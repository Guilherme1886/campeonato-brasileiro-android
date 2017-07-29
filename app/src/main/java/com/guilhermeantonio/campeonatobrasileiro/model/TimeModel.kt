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
        listTimes.add(objSP)

        return listTimes


    }

    fun getTimesSerieB(): ArrayList<TimeModel> {

        val listTimes = arrayListOf<TimeModel>()

        val objAmerica = TimeModel()
        objAmerica.nome = "América-MG"
        objAmerica.emblema = R.drawable.america

        val objVilaNova = TimeModel()
        objVilaNova.nome = "Vila Nova"
        objVilaNova.emblema = R.drawable.vilanova

        val objGuarani = TimeModel()
        objGuarani.nome = "Guarani"
        objGuarani.emblema = R.drawable.guarani

        val objInter = TimeModel()
        objInter.nome = "Internacional"
        objInter.emblema = R.drawable.internacional

        val objJuventude = TimeModel()
        objJuventude.nome = "Juventude"
        objJuventude.emblema = R.drawable.juventude

        val objLondrina = TimeModel()
        objLondrina.nome = "Londrina"
        objLondrina.emblema = R.drawable.londrina

        val objCeara = TimeModel()
        objCeara.nome = "Ceará"
        objCeara.emblema = R.drawable.ceara

        val objCRB = TimeModel()
        objCRB.nome = "CRB"
        objCRB.emblema = R.drawable.crb

        val objParana = TimeModel()
        objParana.nome = "Paraná"
        objParana.emblema = R.drawable.parana

        val objGoias = TimeModel()
        objGoias.nome = "Goiás"
        objGoias.emblema = R.drawable.goias

        val objCriciuma = TimeModel()
        objCriciuma.nome = "Criciúma"
        objCriciuma.emblema = R.drawable.criciuma

        val objSanta = TimeModel()
        objSanta.nome = "Santa Cruz"
        objSanta.emblema = R.drawable.santacruz

        val objOeste = TimeModel()
        objOeste.nome = "Oeste"
        objOeste.emblema = R.drawable.oeste

        val objBoa = TimeModel()
        objBoa.nome = "Boa Esporte"
        objBoa.emblema = R.drawable.boaesporte

        val objBrasil = TimeModel()
        objBrasil.nome = "Brasil de Pelotas"
        objBrasil.emblema = R.drawable.brasil

        val objPay = TimeModel()
        objPay.nome = "Paysandu"
        objPay.emblema = R.drawable.paysandu

        val objLuverdense = TimeModel()
        objLuverdense.nome = "Luverdense"
        objLuverdense.emblema = R.drawable.luverdense

        val objFiguei = TimeModel()
        objFiguei.nome = "Figueirense"
        objFiguei.emblema = R.drawable.figueirense

        val objABC = TimeModel()
        objABC.nome = "ABC"
        objABC.emblema = R.drawable.abc

        val objNautico = TimeModel()
        objNautico.nome = "Náutico"
        objNautico.emblema = R.drawable.nautico

        listTimes.add(objAmerica)
        listTimes.add(objVilaNova)
        listTimes.add(objGuarani)
        listTimes.add(objInter)
        listTimes.add(objJuventude)
        listTimes.add(objLondrina)
        listTimes.add(objCeara)
        listTimes.add(objCRB)
        listTimes.add(objParana)
        listTimes.add(objGoias)
        listTimes.add(objCriciuma)
        listTimes.add(objSanta)
        listTimes.add(objOeste)
        listTimes.add(objBoa)
        listTimes.add(objBrasil)
        listTimes.add(objPay)
        listTimes.add(objLuverdense)
        listTimes.add(objFiguei)
        listTimes.add(objABC)
        listTimes.add(objNautico)

        return listTimes


    }


}