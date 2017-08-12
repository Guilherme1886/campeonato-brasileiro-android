package com.guilhermeantonio.campeonatobrasileiro.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
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
import kotlinx.android.synthetic.main.fragment_seriea.*


/**
 * Created by Guilherme on 29/07/2017.
 */

class SerieaFragment : Fragment() {

    private lateinit var mAdapter: TimeAdapter

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        configView()


    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_seriea, container, false)
    }

    private fun configView() {

        val listTimes = arrayListOf<TimeModel>()
        var postListener: ValueEventListener? = null
        val termo_json = "equipes-serie-a"

        val database = FirebaseDatabase.getInstance()

        val equipe_1 = database.getReference("$termo_json/1")
        val equipe_2 = database.getReference("$termo_json/2")
        val equipe_3 = database.getReference("$termo_json/3")
        val equipe_4 = database.getReference("$termo_json/4")
        val equipe_5 = database.getReference("$termo_json/5")
        val equipe_6 = database.getReference("$termo_json/6")
        val equipe_7 = database.getReference("$termo_json/7")
        val equipe_8 = database.getReference("$termo_json/8")
        val equipe_9 = database.getReference("$termo_json/9")
        val equipe_10 = database.getReference("$termo_json/10")
        val equipe_11 = database.getReference("$termo_json/11")
        val equipe_12 = database.getReference("$termo_json/12")
        val equipe_13 = database.getReference("$termo_json/13")
        val equipe_14 = database.getReference("$termo_json/14")
        val equipe_15 = database.getReference("$termo_json/15")
        val equipe_16 = database.getReference("$termo_json/16")
        val equipe_17 = database.getReference("$termo_json/17")
        val equipe_18 = database.getReference("$termo_json/18")
        val equipe_19 = database.getReference("$termo_json/19")
        val equipe_20 = database.getReference("$termo_json/20")


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

                recycler_view_seriea.adapter = mAdapter
                recycler_view_seriea.layoutManager = GridLayoutManager(context, 2)
                progressBar.visibility = View.INVISIBLE


            }

            override fun onCancelled(databaseError: DatabaseError) {

            }
        }

        equipe_1.addValueEventListener(postListener)
        equipe_2.addValueEventListener(postListener)
        equipe_3.addValueEventListener(postListener)
        equipe_4.addValueEventListener(postListener)
        equipe_5.addValueEventListener(postListener)
        equipe_6.addValueEventListener(postListener)
        equipe_7.addValueEventListener(postListener)
        equipe_8.addValueEventListener(postListener)
        equipe_9.addValueEventListener(postListener)
        equipe_10.addValueEventListener(postListener)
        equipe_11.addValueEventListener(postListener)
        equipe_12.addValueEventListener(postListener)
        equipe_13.addValueEventListener(postListener)
        equipe_14.addValueEventListener(postListener)
        equipe_15.addValueEventListener(postListener)
        equipe_16.addValueEventListener(postListener)
        equipe_17.addValueEventListener(postListener)
        equipe_18.addValueEventListener(postListener)
        equipe_19.addValueEventListener(postListener)
        equipe_20.addValueEventListener(postListener)

    }

}


