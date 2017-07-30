package com.guilhermeantonio.campeonatobrasileiro.rest.request_detalhes_jogo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by Guilherme on 29/07/2017.
 */
class VencedorJogo {

    @SerializedName("equipe_id")
    @Expose
    var equipeId: Int? = null
    @SerializedName("label")
    @Expose
    var label: String? = null
}