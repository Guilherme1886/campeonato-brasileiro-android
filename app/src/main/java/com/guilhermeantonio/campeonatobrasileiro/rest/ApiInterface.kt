package com.guilhermeantonio.campeonatobrasileiro.rest

import com.guilhermeantonio.campeonatobrasileiro.rest.request_detalhes_jogo.ViewTime
import retrofit2.Call
import retrofit2.http.GET

import retrofit2.http.Path

/**
 * Created by Guilherme on 29/07/2017.
 */

interface ApiInterface {

    @GET("servico/equipe/{time}/jogos.json")
    fun dadosJogo(@Path("time") time: String): Call<ViewTime>
}