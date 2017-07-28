package com.guilhermeantonio.campeonatobrasileiro.model

import com.guilhermeantonio.campeonatobrasileiro.R
import java.util.ArrayList

/**
 * Created by Guilherme on 27/07/2017.
 */

class TimeModel {
    var nome: String? = null
    var emblema: Int? = null

    fun getTimesSerieA(): ArrayList<TimeModel> {

        val listTimes = arrayListOf<TimeModel>()

        val objCor = TimeModel()
        objCor.nome = "Corinthians"
        objCor.emblema = R.drawable.cor

        val objGremio = TimeModel()
        objGremio.nome = "Grêmio"
        objGremio.emblema = R.drawable.gremio

        val objSantos = TimeModel()
        objSantos.nome = "Santos"
        objSantos.emblema = R.drawable.santos

        val objFlamengo = TimeModel()
        objFlamengo.nome = "Flamengo"
        objFlamengo.emblema = R.drawable.flamengo

        val objPalmeiras = TimeModel()
        objPalmeiras.nome = "Palmeiras"
        objPalmeiras.emblema = R.drawable.palmeiras

        val objSport = TimeModel()
        objSport.nome = "Sport"
        objSport.emblema = R.drawable.sport

        val objBotafogo = TimeModel()
        objBotafogo.nome = "Botafogo"
        objBotafogo.emblema = R.drawable.botafogo

        val objVasco = TimeModel()
        objVasco.nome = "Vasco"
        objVasco.emblema = R.drawable.vasco

        val objCruzeiro = TimeModel()
        objCruzeiro.nome = "Cruzeiro"
        objCruzeiro.emblema = R.drawable.cruzeiro

        val objPonte = TimeModel()
        objPonte.nome = "Ponte Preta"
        objPonte.emblema = R.drawable.ponte_preta

        val objChape = TimeModel()
        objChape.nome = "Chapecoense"
        objChape.emblema = R.drawable.chape

        val objFlu = TimeModel()
        objFlu.nome = "Fluminense"
        objFlu.emblema = R.drawable.flu

        val objAtleticomg = TimeModel()
        objAtleticomg.nome = "Atlético-MG"
        objAtleticomg.emblema = R.drawable.atleticomg

        val objBahia = TimeModel()
        objBahia.nome = "Bahia"
        objBahia.emblema = R.drawable.bahia

        val objCoritiba = TimeModel()
        objCoritiba.nome = "Coritiba"
        objCoritiba.emblema = R.drawable.coritiba

        val objAtleticopr = TimeModel()
        objAtleticopr.nome = "Atlético-PR"
        objAtleticopr.emblema = R.drawable.atleticopr

        val objAvai = TimeModel()
        objAvai.nome = "Avaí"
        objAvai.emblema = R.drawable.avai

        val objSP = TimeModel()
        objSP.nome = "São Paulo"
        objSP.emblema = R.drawable.sp

        val objVitoria = TimeModel()
        objVitoria.nome = "Vitória"
        objVitoria.emblema = R.drawable.vitoria

        val objAtleticogo = TimeModel()
        objAtleticogo.nome = "Atlético-GO"
        objAtleticogo.emblema = R.drawable.atleticogo

        listTimes.add(objCor)
        listTimes.add(objGremio)
        listTimes.add(objSantos)
        listTimes.add(objFlamengo)
        listTimes.add(objPalmeiras)
        listTimes.add(objSport)
        listTimes.add(objBotafogo)
        listTimes.add(objVasco)
        listTimes.add(objCruzeiro)
        listTimes.add(objPonte)
        listTimes.add(objChape)
        listTimes.add(objFlu)
        listTimes.add(objAtleticomg)
        listTimes.add(objBahia)
        listTimes.add(objCoritiba)
        listTimes.add(objAtleticopr)
        listTimes.add(objAvai)
        listTimes.add(objVitoria)
        listTimes.add(objAtleticogo)

        return listTimes


    }


}