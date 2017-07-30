package com.guilhermeantonio.campeonatobrasileiro.rest.request_detalhes_jogo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Guilherme on 29/07/2017.
 */
class ViewTime {

    @SerializedName("anterior")
    @Expose
    var anterior: Anterior? = null
    @SerializedName("proximos")
    @Expose
    var proximos: List<Proximo>? = null
}