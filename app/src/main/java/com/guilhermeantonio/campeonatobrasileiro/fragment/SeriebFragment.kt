package com.guilhermeantonio.campeonatobrasileiro.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.guilhermeantonio.campeonatobrasileiro.R
import com.guilhermeantonio.campeonatobrasileiro.activity.DetalheTimeActivity
import com.guilhermeantonio.campeonatobrasileiro.adapter.TimeAdapter
import com.guilhermeantonio.campeonatobrasileiro.model.TimeModel
import kotlinx.android.synthetic.main.fragment_serieb.*


/**
 * Created by Guilherme on 29/07/2017.
 */
class SeriebFragment : Fragment() {

    private lateinit var mAdapter: TimeAdapter

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       // configView()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_serieb, container, false)
    }

    private fun configView() {

        val listTimes = arrayListOf<TimeModel>()
        var postListener: ValueEventListener? = null

        val database = FirebaseDatabase.getInstance()

        val equipe_1 = database.getReference("/equipes/3")
        val equipe_2 = database.getReference("/equipes/4")

        postListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {

                val post = dataSnapshot.getValue(TimeModel::class.java)

                val obj = TimeModel()
                obj.nome = post.nome
                obj.emblema = post.emblema
                obj.id = post.id
                listTimes.add(obj)


                mAdapter = TimeAdapter(listTimes, context, object : TimeAdapter.OnItemClickListener {
                    override fun OnItemClickFoto(itemTime: TimeModel) {

                        startActivity(Intent(context, DetalheTimeActivity::class.java)
                                .putExtra("time", itemTime.nome))


                    }

                })

                recycler_view_serieb.adapter = mAdapter
                recycler_view_serieb.layoutManager = GridLayoutManager(context, 2)
                progressBar.visibility = View.INVISIBLE


            }

            override fun onCancelled(databaseError: DatabaseError) {

            }
        }



        equipe_1.addValueEventListener(postListener)
        equipe_2.addValueEventListener(postListener)

    }


}