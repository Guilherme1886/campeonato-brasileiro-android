package com.guilhermeantonio.campeonatobrasileiro.rest.request_detalhes_jogo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by Guilherme on 29/07/2017.
 */
class Escudo {

    @SerializedName("pequeno")
    @Expose
    var pequeno: String? = null
    @SerializedName("grande")
    @Expose
    var grande: String? = null
    @SerializedName("medio")
    @Expose
    var medio: String? = null
}