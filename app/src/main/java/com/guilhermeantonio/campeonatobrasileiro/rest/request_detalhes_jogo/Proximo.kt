package com.guilhermeantonio.campeonatobrasileiro.rest.request_detalhes_jogo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


/**
 * Created by Guilherme on 29/07/2017.
 */
class Proximo {

    @SerializedName("hora")
    @Expose
    var hora: String? = null
    @SerializedName("visitante")
    @Expose
    var visitante: Visitante? = null
    @SerializedName("vencedor_jogo")
    @Expose
    var vencedorJogo: Any? = null
    @SerializedName("mandante")
    @Expose
    var mandante: Mandante? = null
    @SerializedName("confronto")
    @Expose
    var confronto: Any? = null
    @SerializedName("rodada")
    @Expose
    var rodada: Int? = null
    @SerializedName("tempo_real")
    @Expose
    var tempoReal: Any? = null
    @SerializedName("nome_campeonato")
    @Expose
    var nomeCampeonato: String? = null
    @SerializedName("dia")
    @Expose
    var dia: String? = null
    @SerializedName("nome_fase")
    @Expose
    var nomeFase: String? = null
    @SerializedName("jogo_id")
    @Expose
    var jogoId: Int? = null
    @SerializedName("datajogo")
    @Expose
    var datajogo: String? = null
    @SerializedName("horajogo")
    @Expose
    var horajogo: String? = null
    @SerializedName("data_formatada")
    @Expose
    var dataFormatada: String? = null
    @SerializedName("estadio")
    @Expose
    var estadio: String? = null
}