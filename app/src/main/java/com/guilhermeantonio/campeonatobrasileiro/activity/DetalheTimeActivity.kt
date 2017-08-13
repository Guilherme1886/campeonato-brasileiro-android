package com.guilhermeantonio.campeonatobrasileiro.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.ImageView
import com.guilhermeantonio.campeonatobrasileiro.R
import com.guilhermeantonio.campeonatobrasileiro.model.TimeModel
import com.guilhermeantonio.campeonatobrasileiro.rest.ApiClient
import com.guilhermeantonio.campeonatobrasileiro.rest.ApiInterface
import com.guilhermeantonio.campeonatobrasileiro.rest.request_detalhes_jogo.ViewTime
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detalhe_time.*
import kotlinx.android.synthetic.main.content_detalhe_time.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*


class DetalheTimeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_time)

        configView()

    }

    private fun configView() {

        setSupportActionBar(toolbar)

        val time = "Jogos ${intent.getStringExtra("time")}"
        toolbar_layout.title = time
        timeSelected(time.replace("Jogos ", ""))

    }

    private fun usePicasso(file: String?, imageView: ImageView) = Picasso.with(this).load(file).into(imageView)

    private fun timeSelected(time: String) {

        when (time) {

        //serie a
            TimeModel.corinthians -> getJogosTime("corinthians")
            TimeModel.gremio -> getJogosTime("gremio")
            TimeModel.santos -> getJogosTime("santos")
            TimeModel.flamengo -> getJogosTime("flamengo")
            TimeModel.palmeiras -> getJogosTime("palmeiras")
            TimeModel.sport -> getJogosTime("sport")
            TimeModel.botafogo -> getJogosTime("botafogo")
            TimeModel.vasco -> getJogosTime("vasco")
            TimeModel.cruzeiro -> getJogosTime("cruzeiro")
            TimeModel.pontepreta -> getJogosTime("ponte-preta")
            TimeModel.chapecoense -> getJogosTime("chapecoense")
            TimeModel.fluminense -> getJogosTime("fluminense")
            TimeModel.atleticomg -> getJogosTime("atletico-mg")
            TimeModel.bahia -> getJogosTime("bahia")
            TimeModel.coritiba -> getJogosTime("coritiba")
            TimeModel.atleticopr -> getJogosTime("atletico-pr")
            TimeModel.avai -> getJogosTime("avai")
            TimeModel.vitoria -> getJogosTime("vitoria")
            TimeModel.atleticogo -> getJogosTime("atletico-go")
            TimeModel.saopaulo -> getJogosTime("sao-paulo")

        //serie b
            TimeModel.vilanova -> getJogosTime("vila-nova")
            TimeModel.america -> getJogosTime("america-mg")
            TimeModel.guarani -> getJogosTime("guarani")
            TimeModel.internacional -> getJogosTime("internacional")
            TimeModel.juventude -> getJogosTime("juventude")
            TimeModel.londrina -> getJogosTime("londrina")
            TimeModel.ceara -> getJogosTime("ceara")
            TimeModel.crb -> getJogosTime("crb")
            TimeModel.parana -> getJogosTime("parana")
            TimeModel.goias -> getJogosTime("goias")
            TimeModel.criciuma -> getJogosTime("criciuma")
            TimeModel.santacruz -> getJogosTime("santa-cruz")
            TimeModel.oeste -> getJogosTime("oeste")
            TimeModel.boaesporte -> getJogosTime("boa")
            TimeModel.brasildepelotas -> getJogosTime("brasil-de-pelotas")
            TimeModel.paysandu -> getJogosTime("paysandu")
            TimeModel.luverdense -> getJogosTime("luverdense")
            TimeModel.figueirense -> getJogosTime("figueirense")
            TimeModel.abc -> getJogosTime("abc")
            TimeModel.nautico -> getJogosTime("nautico")


        }


    }

    private fun getJogosTime(time: String) {

        val apiService = ApiClient.client?.create(ApiInterface::class.java)
        val callJson = apiService?.dadosJogo(time)

        object : Thread() {
            override fun run() {
                try {
                    callJson?.enqueue(object : Callback<ViewTime> {
                        override fun onResponse(call: Call<ViewTime>?, response: Response<ViewTime>) {

                            if (response.isSuccessful) {

                                val res = response.body()
                                val anterior = res.anterior
                                val proximo = res.proximos

                                val formato_data = SimpleDateFormat("dd/MM")
                                val data_atual = formato_data.format(Calendar.getInstance().time)

                                /*Jogo 1*/

                                //Dados do Jogo

                                var nome_fase_jogo_1 = ""
                                val jogo_hoje = "- HOJE"

                                if (anterior?.nomeFase != "Fase única") nome_fase_jogo_1 = "- ${anterior?.nomeFase.toString()}"

                                if (anterior?.dia.equals(data_atual)) hora_jogo_1.text = "${anterior?.hora} $jogo_hoje" else hora_jogo_1.text = anterior?.hora

                                nome_campeonato_jogo_1.text = "${anterior?.nomeCampeonato} $nome_fase_jogo_1"
                                dia_semana_jogo_1.text = "${anterior?.dataFormatada.toString().toUpperCase()}/2017 "
                                local_jogo_1.text = "${anterior?.estadio.toString().toUpperCase()} "

                                //Mandante
                                time_mandante_1.text = "${anterior?.mandante?.sigla} "
                                usePicasso(anterior?.mandante?.escudo?.grande, emblema_mandante_1)
                                gols_mandante_1.text = "     ${anterior?.mandante?.placarOficial} x "

                                //Visitante
                                gols_visitante_1.text = "${anterior?.visitante?.placarOficial}     "
                                usePicasso(anterior?.visitante?.escudo?.grande, emblema_visitante_1)
                                time_visitante_1.text = " ${anterior?.visitante?.sigla} "

                                /*Jogo 1*/

                                /*Jogo 2*/

                                //Dados do Jogo

                                var nome_fase_jogo_2 = ""

                                if (proximo?.get(0)?.nomeFase != "Fase única") nome_fase_jogo_2 = "- ${proximo?.get(0)?.nomeFase.toString()}"

                                if (proximo?.get(0)?.dia.equals(data_atual)) hora_jogo_2.text = "${proximo?.get(0)?.hora} $jogo_hoje" else hora_jogo_2.text = proximo?.get(0)?.hora

                                nome_campeonato_jogo_2.text = "${proximo?.get(0)?.nomeCampeonato} $nome_fase_jogo_2"
                                dia_semana_jogo_2.text = "${proximo?.get(0)?.dataFormatada.toString().toUpperCase()}/2017 "
                                local_jogo_2.text = "${proximo?.get(0)?.estadio.toString().toUpperCase()} "


                                //Mandante
                                time_mandante_2.text = "${proximo?.get(0)?.mandante?.sigla} "
                                usePicasso(proximo?.get(0)?.mandante?.escudo?.grande, emblema_mandante_2)
                                gols_mandante_2.text = "     ${proximo?.get(0)?.mandante?.placarOficial ?: ""} x "

                                //Visitante
                                gols_visitante_2.text = "${proximo?.get(0)?.visitante?.placarOficial ?: ""}     "
                                usePicasso(proximo?.get(0)?.visitante?.escudo?.grande, emblema_visitante_2)
                                time_visitante_2.text = " ${proximo?.get(0)?.visitante?.sigla} "

                                /*Jogo 2*/


                                /*Jogo 3*/

                                //Dados do Jogo

                                var nome_fase_jogo_3 = ""

                                if (proximo?.get(1)?.nomeFase != "Fase única") nome_fase_jogo_3 = "- ${proximo?.get(1)?.nomeFase.toString()}"

                                if (proximo?.get(1)?.dia.equals(data_atual)) hora_jogo_3.text = "${proximo?.get(1)?.hora} $jogo_hoje" else hora_jogo_3.text = proximo?.get(1)?.hora

                                nome_campeonato_jogo_3.text = "${proximo?.get(1)?.nomeCampeonato} $nome_fase_jogo_3"
                                dia_semana_jogo_3.text = "${proximo?.get(1)?.dataFormatada.toString().toUpperCase()}/2017 "
                                local_jogo_3.text = "${proximo?.get(1)?.estadio.toString().toUpperCase()} "

                                //Mandante
                                time_mandante_3.text = "${proximo?.get(1)?.mandante?.sigla} "
                                usePicasso(proximo?.get(1)?.mandante?.escudo?.grande, emblema_mandante_3)
                                gols_mandante_3.text = "     ${proximo?.get(1)?.mandante?.placarOficial ?: ""} x "

                                //Visitante
                                gols_visitante_3.text = "${proximo?.get(1)?.visitante?.placarOficial ?: ""}     "
                                usePicasso(proximo?.get(1)?.visitante?.escudo?.grande, emblema_visitante_3)
                                time_visitante_3.text = " ${proximo?.get(1)?.visitante?.sigla} "

                                /*Jogo 3*/

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

}


//val df = SimpleDateFormat("dd MM yyyy, HH:mm")
//val date = df.format(Calendar.getInstance().time)
