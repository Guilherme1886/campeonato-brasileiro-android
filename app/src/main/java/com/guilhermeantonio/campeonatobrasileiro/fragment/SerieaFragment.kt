package com.guilhermeantonio.campeonatobrasileiro.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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

        mAdapter = TimeAdapter(TimeModel().getTimesSerieA(), context, object : TimeAdapter.OnItemClickListener {
            override fun OnItemClickFoto(itemTime: TimeModel) {

                startActivity(Intent(context, DetalheTimeActivity::class.java)
                        .putExtra("time", itemTime.nome))


            }

        })


        recycler_view_seriea.layoutManager = GridLayoutManager(context, 2)
        recycler_view_seriea.adapter = mAdapter
        progressBar.visibility = View.INVISIBLE

    }


}