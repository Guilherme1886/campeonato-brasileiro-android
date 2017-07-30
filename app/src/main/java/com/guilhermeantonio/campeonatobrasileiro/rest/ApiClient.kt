package com.guilhermeantonio.campeonatobrasileiro.rest

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Guilherme on 29/07/2017.
 */
object ApiClient {

    private val BASE_URL = "http://globoesporte.globo.com"
    private var retrofit: Retrofit? = null

    val client: Retrofit? get() {

        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }
        return retrofit
    }
}