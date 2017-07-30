package com.guilhermeantonio.campeonatobrasileiro.rest.request_detalhes_jogo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by Guilherme on 29/07/2017.
 */
class Visitante {

    @SerializedName("placar_oficial")
    @Expose
    var placarOficial: Int? = null
    @SerializedName("placar_penaltis")
    @Expose
    var placarPenaltis: Any? = null
    @SerializedName("escudo")
    @Expose
    var escudo: Escudo? = null
    @SerializedName("apelido")
    @Expose
    var apelido: String? = null
    @SerializedName("sigla")
    @Expose
    var sigla: String? = null
}