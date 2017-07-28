package com.guilhermeantonio.campeonatobrasileiro.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import com.guilhermeantonio.campeonatobrasileiro.R
import com.guilhermeantonio.campeonatobrasileiro.model.TimeModel
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.sql.Time

/**
 * Created by Guilherme on 27/07/2017.
 */

class TimeAdapter(private val timesList: List<TimeModel>,
                  private val context: Context,
                  private val listener: TimeAdapter.OnItemClickListener) : RecyclerView.Adapter<TimeAdapter.TimeViewHolder>() {

    interface OnItemClickListener {
        fun OnItemClickFoto(itemTime: TimeModel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimeViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_time, parent, false)
        return TimeViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TimeViewHolder, position: Int) {
        holder.bind(timesList[position], listener)
    }

    override fun getItemCount(): Int {
        return timesList.size
    }

    inner class TimeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var nome: TextView = itemView.findViewById(R.id.nome_time) as TextView
        var emblema: ImageView = itemView.findViewById(R.id.emblema_time) as ImageView


        fun bind(item: TimeModel, listener: OnItemClickListener) {

            nome.text = item.nome
            emblema.setImageResource(item.emblema as Int)

            emblema.setOnClickListener { listener.OnItemClickFoto(item) }
        }
    }
}
