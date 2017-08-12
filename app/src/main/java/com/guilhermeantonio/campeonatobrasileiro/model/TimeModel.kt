package com.guilhermeantonio.campeonatobrasileiro.model

import com.guilhermeantonio.campeonatobrasileiro.R
import kotlin.collections.ArrayList

/**
 * Created by Guilherme on 27/07/2017.
 */

class TimeModel {
    var nome: String? = null
    var emblema: String? = null
    var id: String? = null

    companion object {

        //serie a
        val corinthians = "Corinthians"
        val gremio = "Gremio"
        val santos = "Santos"
        val flamengo = "Flamengo"
        val palmeiras = "Palmeiras"
        val sport = "Sport"
        val botafogo = "Botafogo"
        val vasco = "Vasco"
        val cruzeiro = "Cruzeiro"
        val pontepreta = "Ponte Preta"
        val chapecoense = "Chapecoense"
        val fluminense = "Fluminense"
        val atleticomg = "Atletico-MG"
        val bahia = "Bahia"
        val coritiba = "Coritiba"
        val atleticopr = "Atletico-PR"
        val avai = "Avai"
        val saopaulo = "Sao Paulo"
        val vitoria = "Vitoria"
        val atleticogo = "Atletico-GO"

        //serie b
        var america = "America-MG"
        var vilanova = "Vila Nova"
        var guarani = "Guarani"
        var internacional = "Internacional"
        var juventude = "Juventude"
        var londrina = "Londrina"
        var ceara = "Ceara"
        var crb = "CRB"
        var parana = "Parana"
        var goias = "Goias"
        var criciuma = "Criciuma"
        var santacruz = "Santa Cruz"
        var oeste = "Oeste"
        var boaesporte = "Boa Esporte"
        var brasildepelotas = "Brasil de Pelotas"
        var paysandu = "Paysandu"
        var luverdense = "Luverdense"
        var figueirense = "Figueirense"
        var abc = "ABC"
        var nautico = "Nautico"


    }

//    fun getTimesSerieA(): ArrayList<TimeModel> {
//
//        val listTimes = arrayListOf<TimeModel>()
//
//        val objCor = TimeModel()
//        objCor.nome = corinthians
//        objCor.emblema = R.drawable.cor
//
//        val objGremio = TimeModel()
//        objGremio.nome = gremio
//        objGremio.emblema = R.drawable.gremio
//
//        val objSantos = TimeModel()
//        objSantos.nome = santos
//        objSantos.emblema = R.drawable.santos
//
//        val objFlamengo = TimeModel()
//        objFlamengo.nome = flamengo
//        objFlamengo.emblema = R.drawable.flamengo
//
//        val objPalmeiras = TimeModel()
//        objPalmeiras.nome = palmeiras
//        objPalmeiras.emblema = R.drawable.palmeiras
//
//        val objSport = TimeModel()
//        objSport.nome = sport
//        objSport.emblema = R.drawable.sport
//
//        val objBotafogo = TimeModel()
//        objBotafogo.nome = botafogo
//        objBotafogo.emblema = R.drawable.botafogo
//
//        val objVasco = TimeModel()
//        objVasco.nome = vasco
//        objVasco.emblema = R.drawable.vasco
//
//        val objCruzeiro = TimeModel()
//        objCruzeiro.nome = cruzeiro
//        objCruzeiro.emblema = R.drawable.cruzeiro
//
//        val objPonte = TimeModel()
//        objPonte.nome = pontepreta
//        objPonte.emblema = R.drawable.ponte_preta
//
//        val objChape = TimeModel()
//        objChape.nome = chapecoense
//        objChape.emblema = R.drawable.chape
//
//        val objFlu = TimeModel()
//        objFlu.nome = fluminense
//        objFlu.emblema = R.drawable.flu
//
//        val objAtleticomg = TimeModel()
//        objAtleticomg.nome = atleticomg
//        objAtleticomg.emblema = R.drawable.atleticomg
//
//        val objBahia = TimeModel()
//        objBahia.nome = bahia
//        objBahia.emblema = R.drawable.bahia
//
//        val objCoritiba = TimeModel()
//        objCoritiba.nome = coritiba
//        objCoritiba.emblema = R.drawable.coritiba
//
//        val objAtleticopr = TimeModel()
//        objAtleticopr.nome = atleticopr
//        objAtleticopr.emblema = R.drawable.atleticopr
//
//        val objAvai = TimeModel()
//        objAvai.nome = avai
//        objAvai.emblema = R.drawable.avai
//
//        val objSP = TimeModel()
//        objSP.nome = saopaulo
//        objSP.emblema = R.drawable.sp
//
//        val objVitoria = TimeModel()
//        objVitoria.nome = vitoria
//        objVitoria.emblema = R.drawable.vitoria
//
//        val objAtleticogo = TimeModel()
//        objAtleticogo.nome = atleticogo
//        objAtleticogo.emblema = R.drawable.atleticogo
//
//        listTimes.add(objCor)
//        listTimes.add(objGremio)
//        listTimes.add(objSantos)
//        listTimes.add(objFlamengo)
//        listTimes.add(objPalmeiras)
//        listTimes.add(objSport)
//        listTimes.add(objBotafogo)
//        listTimes.add(objVasco)
//        listTimes.add(objCruzeiro)
//        listTimes.add(objPonte)
//        listTimes.add(objChape)
//        listTimes.add(objFlu)
//        listTimes.add(objAtleticomg)
//        listTimes.add(objBahia)
//        listTimes.add(objCoritiba)
//        listTimes.add(objAtleticopr)
//        listTimes.add(objAvai)
//        listTimes.add(objVitoria)
//        listTimes.add(objAtleticogo)
//        listTimes.add(objSP)
//
//        return listTimes
//
//
//    }
//
//    fun getTimesSerieB(): ArrayList<TimeModel> {
//
//        val listTimes = arrayListOf<TimeModel>()
//
//        val objAmerica = TimeModel()
//        objAmerica.nome = america
//        objAmerica.emblema = R.drawable.america
//
//        val objVilaNova = TimeModel()
//        objVilaNova.nome = vilanova
//        objVilaNova.emblema = R.drawable.vilanova
//
//        val objGuarani = TimeModel()
//        objGuarani.nome = guarani
//        objGuarani.emblema = R.drawable.guarani
//
//        val objInter = TimeModel()
//        objInter.nome = internacional
//        objInter.emblema = R.drawable.internacional
//
//        val objJuventude = TimeModel()
//        objJuventude.nome = juventude
//        objJuventude.emblema = R.drawable.juventude
//
//        val objLondrina = TimeModel()
//        objLondrina.nome = londrina
//        objLondrina.emblema = R.drawable.londrina
//
//        val objCeara = TimeModel()
//        objCeara.nome = ceara
//        objCeara.emblema = R.drawable.ceara
//
//        val objCRB = TimeModel()
//        objCRB.nome = crb
//        objCRB.emblema = R.drawable.crb
//
//        val objParana = TimeModel()
//        objParana.nome = parana
//        objParana.emblema = R.drawable.parana
//
//        val objGoias = TimeModel()
//        objGoias.nome = goias
//        objGoias.emblema = R.drawable.goias
//
//        val objCriciuma = TimeModel()
//        objCriciuma.nome = criciuma
//        objCriciuma.emblema = R.drawable.criciuma
//
//        val objSanta = TimeModel()
//        objSanta.nome = santacruz
//        objSanta.emblema = R.drawable.santacruz
//
//        val objOeste = TimeModel()
//        objOeste.nome = oeste
//        objOeste.emblema = R.drawable.oeste
//
//        val objBoa = TimeModel()
//        objBoa.nome = boaesporte
//        objBoa.emblema = R.drawable.boaesporte
//
//        val objBrasil = TimeModel()
//        objBrasil.nome = brasildepelotas
//        objBrasil.emblema = R.drawable.brasil
//
//        val objPay = TimeModel()
//        objPay.nome = paysandu
//        objPay.emblema = R.drawable.paysandu
//
//        val objLuverdense = TimeModel()
//        objLuverdense.nome = luverdense
//        objLuverdense.emblema = R.drawable.luverdense
//
//        val objFiguei = TimeModel()
//        objFiguei.nome = figueirense
//        objFiguei.emblema = R.drawable.figueirense
//
//        val objABC = TimeModel()
//        objABC.nome = abc
//        objABC.emblema = R.drawable.abc
//
//        val objNautico = TimeModel()
//        objNautico.nome = nautico
//        objNautico.emblema = R.drawable.nautico
//
//        listTimes.add(objAmerica)
//        listTimes.add(objVilaNova)
//        listTimes.add(objGuarani)
//        listTimes.add(objInter)
//        listTimes.add(objJuventude)
//        listTimes.add(objLondrina)
//        listTimes.add(objCeara)
//        listTimes.add(objCRB)
//        listTimes.add(objParana)
//        listTimes.add(objGoias)
//        listTimes.add(objCriciuma)
//        listTimes.add(objSanta)
//        listTimes.add(objOeste)
//        listTimes.add(objBoa)
//        listTimes.add(objBrasil)
//        listTimes.add(objPay)
//        listTimes.add(objLuverdense)
//        listTimes.add(objFiguei)
//        listTimes.add(objABC)
//        listTimes.add(objNautico)
//
//        return listTimes
//
//
//    }


}