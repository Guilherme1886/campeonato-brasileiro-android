package com.guilhermeantonio.campeonatobrasileiro.activity

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.View
import android.widget.ImageView

import com.guilhermeantonio.campeonatobrasileiro.R
import com.guilhermeantonio.campeonatobrasileiro.rest.ApiClient
import com.guilhermeantonio.campeonatobrasileiro.rest.ApiInterface
import com.guilhermeantonio.campeonatobrasileiro.rest.request_detalhes_jogo.ViewTime
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detalhe_time.*
import kotlinx.android.synthetic.main.content_detalhe_time.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetalheTimeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_time)

        setSupportActionBar(toolbar)
        //configFloatButton()

        getJogosTime()


    }

    private fun usePiscasso(file: String?, imageView: ImageView) {
        Picasso.with(this).load(file).into(imageView)
    }

    private fun getJogosTime() {

        val apiService = ApiClient.client?.create(ApiInterface::class.java)
        val callJson = apiService?.dadosJogo("vila-nova")

        object : Thread() {
            override fun run() {
                try {
                    callJson?.enqueue(object : Callback<ViewTime> {
                        override fun onResponse(call: Call<ViewTime>?, response: Response<ViewTime>) {

                            if (response.isSuccessful) {

                                val res = response.body()
                                val jogo_anterior = res.anterior

                                /*Jogo 1*/

                                //Dados do Jogo
                                dia_semana_jogo_1.text = "${jogo_anterior?.dataFormatada.toString().toUpperCase()}/2017 "
                                local_jogo_1.text = "${jogo_anterior?.estadio.toString().toUpperCase()} "
                                hora_jogo_1.text = jogo_anterior?.hora

                                //Mandante
                                time_mandante_1.text = "${jogo_anterior?.mandante?.sigla} "
                                usePiscasso(jogo_anterior?.mandante?.escudo?.grande, emblema_mandante_1)
                                gols_mandante_1.text = "     ${jogo_anterior?.mandante?.placarOficial} x "

                                //Visitante
                                gols_visitante_1.text = "${jogo_anterior?.visitante?.placarOficial}     "
                                usePiscasso(jogo_anterior?.visitante?.escudo?.grande, emblema_visitante_1)
                                time_visitante_1.text = " ${jogo_anterior?.visitante?.sigla} "
                                /*Jogo 1*/

                            }

                        }

                        override fun onFailure(call: Call<ViewTime>?, t: Throwable?) {

                        }

                    })

                } catch (e: Exception) {

                }

            }

        }.start()

    }

//    private fun configFloatButton() {
//
//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
//        }
//
//    }
}
