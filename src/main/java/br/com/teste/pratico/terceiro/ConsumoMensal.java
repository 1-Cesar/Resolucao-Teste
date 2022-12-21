package br.com.teste.pratico.terceiro;

import br.com.teste.pratico.terceiro.model.Ano;

import java.util.*;

public class ConsumoMensal {
    public static void main(String[] args) {

        //random para definir os kWh
        Random gerador = new Random();

        double consumoMedioJan, consumoMedioFev, consumoMedioMar, consumoMedioAbr, consumoMedioMai, consumoMedioJun,
                consumoMedioJul, consumoMedioAgo, consumoMedioSet, consumoMedioOut, consumoMedioNov, consumoMedioDez,
                totalDez, totalOnze, totalDoze, totalTreze, totalQuatorze, totalQuinze, totalDezesseis, totalDezessete,
                totalOito, totalNove;

        //objetos referentes aos anos em questão com seus respectivos meses
        Ano doisMilDez = new Ano(gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100));

        Ano doisMilOnze = new Ano(gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100));

        Ano doisMilDoze = new Ano(gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100));

        Ano doisMilTreze = new Ano(gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100));

        Ano doisMilQuatorze = new Ano(gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100));

        Ano doisMilQuinze = new Ano(gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100));

        Ano doisMilDezesseis = new Ano(gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100));

        Ano doisMilDezessete = new Ano(gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100));

        Ano doisMilDezoito = new Ano(gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100));

        Ano doisMilDezenove = new Ano(gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100),
                gerador.nextInt(100),gerador.nextInt(100),gerador.nextInt(100));

        //calculo de consumo médio
        consumoMedioJan = (doisMilDez.getJan() + doisMilOnze.getJan() + doisMilDoze.getJan() + doisMilTreze.getJan() +
                doisMilQuatorze.getJan() + doisMilQuinze.getJan() + doisMilDezesseis.getJan() + doisMilDezessete.getJan() +
                doisMilDezoito.getJan() + doisMilDezenove.getJan()) / 10;

        consumoMedioFev = (doisMilDez.getFev() + doisMilOnze.getFev() + doisMilDoze.getFev() + doisMilTreze.getFev() +
                doisMilQuatorze.getFev() + doisMilQuinze.getFev() + doisMilDezesseis.getFev() + doisMilDezessete.getFev() +
                doisMilDezoito.getFev() + doisMilDezenove.getFev()) / 10;

        consumoMedioMar = (doisMilDez.getMar() + doisMilOnze.getMar() + doisMilDoze.getMar() + doisMilTreze.getMar() +
                doisMilQuatorze.getMar() + doisMilQuinze.getMar() + doisMilDezesseis.getMar() + doisMilDezessete.getMar() +
                doisMilDezoito.getMar() + doisMilDezenove.getMar()) / 10;

        consumoMedioAbr = (doisMilDez.getAbr() + doisMilOnze.getAbr() + doisMilDoze.getAbr() + doisMilTreze.getAbr() +
                doisMilQuatorze.getAbr() + doisMilQuinze.getAbr() + doisMilDezesseis.getAbr() + doisMilDezessete.getAbr() +
                doisMilDezoito.getAbr() + doisMilDezenove.getAbr()) / 10;

        consumoMedioMai = (doisMilDez.getMai() + doisMilOnze.getMai() + doisMilDoze.getMai() + doisMilTreze.getMai() +
                doisMilQuatorze.getMai() + doisMilQuinze.getMai() + doisMilDezesseis.getMai() + doisMilDezessete.getMai() +
                doisMilDezoito.getMai() + doisMilDezenove.getMai()) / 10;

        consumoMedioJun = (doisMilDez.getJun() + doisMilOnze.getJun() + doisMilDoze.getJun() + doisMilTreze.getJun() +
                doisMilQuatorze.getJun() + doisMilQuinze.getJun() + doisMilDezesseis.getJun() + doisMilDezessete.getJun() +
                doisMilDezoito.getJun() + doisMilDezenove.getJun()) / 10;

        consumoMedioJul = (doisMilDez.getJul() + doisMilOnze.getJul() + doisMilDoze.getJul() + doisMilTreze.getJul() +
                doisMilQuatorze.getJul() + doisMilQuinze.getJul() + doisMilDezesseis.getJul() + doisMilDezessete.getJul() +
                doisMilDezoito.getJul() + doisMilDezenove.getJul()) / 10;

        consumoMedioAgo = (doisMilDez.getAgo() + doisMilOnze.getAgo() + doisMilDoze.getAgo() + doisMilTreze.getAgo() +
                doisMilQuatorze.getAgo() + doisMilQuinze.getAgo() + doisMilDezesseis.getAgo() + doisMilDezessete.getAgo() +
                doisMilDezoito.getAgo() + doisMilDezenove.getAgo()) / 10;

        consumoMedioSet = (doisMilDez.getSet() + doisMilOnze.getSet() + doisMilDoze.getSet() + doisMilTreze.getSet() +
                doisMilQuatorze.getSet() + doisMilQuinze.getSet() + doisMilDezesseis.getSet() + doisMilDezessete.getSet() +
                doisMilDezoito.getSet() + doisMilDezenove.getSet()) / 10;

        consumoMedioOut = (doisMilDez.getOut() + doisMilOnze.getOut() + doisMilDoze.getOut() + doisMilTreze.getOut() +
                doisMilQuatorze.getOut() + doisMilQuinze.getOut() + doisMilDezesseis.getOut() + doisMilDezessete.getOut() +
                doisMilDezoito.getOut() + doisMilDezenove.getOut()) / 10;

        consumoMedioNov = (doisMilDez.getNov() + doisMilOnze.getNov() + doisMilDoze.getNov() + doisMilTreze.getNov() +
                doisMilQuatorze.getNov() + doisMilQuinze.getNov() + doisMilDezesseis.getNov() + doisMilDezessete.getNov() +
                doisMilDezoito.getNov() + doisMilDezenove.getNov()) / 10;

        consumoMedioDez = (doisMilDez.getDez() + doisMilOnze.getDez() + doisMilDoze.getDez() + doisMilTreze.getDez() +
                doisMilQuatorze.getDez() + doisMilQuinze.getDez() + doisMilDezesseis.getDez() + doisMilDezessete.getDez() +
                doisMilDezoito.getDez() + doisMilDezenove.getDez()) / 10;

        totalDez = doisMilDez.getJan() + doisMilDez.getFev() + doisMilDez.getMar() + doisMilDez.getAbr() + doisMilDez.getMai() +
                doisMilDez.getJun() + doisMilDez.getJul() + doisMilDez.getAgo() + doisMilDez.getSet() + doisMilDez.getOut() +
                doisMilDez.getNov() + doisMilDez.getDez();

        totalOnze = doisMilOnze.getJan() + doisMilOnze.getFev() + doisMilOnze.getMar() + doisMilOnze.getAbr() + doisMilOnze.getMai() +
                doisMilOnze.getJun() + doisMilOnze.getJul() + doisMilOnze.getAgo() + doisMilOnze.getSet() + doisMilOnze.getOut() +
                doisMilOnze.getNov() + doisMilOnze.getDez();

        totalDoze = doisMilDoze.getJan() + doisMilDoze.getFev() + doisMilDoze.getMar() + doisMilDoze.getAbr() + doisMilDoze.getMai() +
                doisMilDoze.getJun() + doisMilDoze.getJul() + doisMilDoze.getAgo() + doisMilDoze.getSet() + doisMilDoze.getOut() +
                doisMilDoze.getNov() + doisMilDoze.getDez();

        totalTreze = doisMilTreze.getJan() + doisMilTreze.getFev() + doisMilTreze.getMar() + doisMilTreze.getAbr() + doisMilTreze.getMai() +
                doisMilTreze.getJun() + doisMilTreze.getJul() + doisMilTreze.getAgo() + doisMilTreze.getSet() + doisMilTreze.getOut() +
                doisMilTreze.getNov() + doisMilTreze.getDez();

        totalQuatorze = doisMilQuatorze.getJan() + doisMilQuatorze.getFev() + doisMilQuatorze.getMar() + doisMilQuatorze.getAbr() + doisMilQuatorze.getMai() +
                doisMilQuatorze.getJun() + doisMilQuatorze.getJul() + doisMilQuatorze.getAgo() + doisMilQuatorze.getSet() + doisMilQuatorze.getOut() +
                doisMilQuatorze.getNov() + doisMilQuatorze.getDez();

        totalQuinze = doisMilQuinze.getJan() + doisMilQuinze.getFev() + doisMilQuinze.getMar() + doisMilQuinze.getAbr() + doisMilQuinze.getMai() +
                doisMilQuinze.getJun() + doisMilQuinze.getJul() + doisMilQuinze.getAgo() + doisMilQuinze.getSet() + doisMilQuinze.getOut() +
                doisMilQuinze.getNov() + doisMilQuinze.getDez();

        totalDezesseis = doisMilDezesseis.getJan() + doisMilDezesseis.getFev() + doisMilDezesseis.getMar() + doisMilDezesseis.getAbr() + doisMilDezesseis.getMai() +
                doisMilDezesseis.getJun() + doisMilDezesseis.getJul() + doisMilDezesseis.getAgo() + doisMilDezesseis.getSet() + doisMilDezesseis.getOut() +
                doisMilDezesseis.getNov() + doisMilDezesseis.getDez();

        totalDezessete = doisMilDezessete.getJan() + doisMilDezessete.getFev() + doisMilDezessete.getMar() + doisMilDezessete.getAbr() + doisMilDezessete.getMai() +
                doisMilDezessete.getJun() + doisMilDezessete.getJul() + doisMilDezessete.getAgo() + doisMilDezessete.getSet() + doisMilDezessete.getOut() +
                doisMilDezessete.getNov() + doisMilDezessete.getDez();

        totalOito = doisMilDezoito.getJan() + doisMilDezoito.getFev() + doisMilDezoito.getMar() + doisMilDezoito.getAbr() + doisMilDezoito.getMai() +
                doisMilDezoito.getJun() + doisMilDezoito.getJul() + doisMilDezoito.getAgo() + doisMilDezoito.getSet() + doisMilDezoito.getOut() +
                doisMilDezoito.getNov() + doisMilDezoito.getDez();

        totalNove = doisMilDezenove.getJan() + doisMilDezenove.getFev() + doisMilDezenove.getMar() + doisMilDezenove.getAbr() + doisMilDezenove.getMai() +
                doisMilDezenove.getJun() + doisMilDezenove.getJul() + doisMilDezenove.getAgo() + doisMilDezenove.getSet() + doisMilDezenove.getOut() +
                doisMilDezenove.getNov() + doisMilDezenove.getDez();

        //HashMap chave valor para organização e formatação dos elementos
        Map<String,Double> mesMaisCaro = new HashMap<>();
        mesMaisCaro.put("jan/2010 : Total gasto em kWh", doisMilDez.getJan());
        mesMaisCaro.put("fev/2010 : Total gasto em kWh", doisMilDez.getFev());
        mesMaisCaro.put("mar/2010 : Total gasto em kWh", doisMilDez.getMar());
        mesMaisCaro.put("abr/2010 : Total gasto em kWh", doisMilDez.getAbr());
        mesMaisCaro.put("mai/2010 : Total gasto em kWh", doisMilDez.getMai());
        mesMaisCaro.put("jun/2010 : Total gasto em kWh", doisMilDez.getJun());
        mesMaisCaro.put("jul/2010 : Total gasto em kWh", doisMilDez.getJul());
        mesMaisCaro.put("ago/2010 : Total gasto em kWh", doisMilDez.getAgo());
        mesMaisCaro.put("set/2010 : Total gasto em kWh", doisMilDez.getSet());
        mesMaisCaro.put("out/2010 : Total gasto em kWh", doisMilDez.getOut());
        mesMaisCaro.put("nov/2010 : Total gasto em kWh", doisMilDez.getNov());
        mesMaisCaro.put("dez/2010 : Total gasto em kWh", doisMilDez.getDez());
        //
        mesMaisCaro.put("jan/2011 : Total gasto em kWh", doisMilOnze.getJan());
        mesMaisCaro.put("fev/2011 : Total gasto em kWh", doisMilOnze.getFev());
        mesMaisCaro.put("mar/2011 : Total gasto em kWh", doisMilOnze.getMar());
        mesMaisCaro.put("abr/2011 : Total gasto em kWh", doisMilOnze.getAbr());
        mesMaisCaro.put("mai/2011 : Total gasto em kWh", doisMilOnze.getMai());
        mesMaisCaro.put("jun/2011 : Total gasto em kWh", doisMilOnze.getJun());
        mesMaisCaro.put("jul/2011 : Total gasto em kWh", doisMilOnze.getJul());
        mesMaisCaro.put("ago/2011 : Total gasto em kWh", doisMilOnze.getAgo());
        mesMaisCaro.put("set/2011 : Total gasto em kWh", doisMilOnze.getSet());
        mesMaisCaro.put("out/2011 : Total gasto em kWh", doisMilOnze.getOut());
        mesMaisCaro.put("nov/2011 : Total gasto em kWh", doisMilOnze.getNov());
        mesMaisCaro.put("dez/2011 : Total gasto em kWh", doisMilOnze.getDez());
        //
        mesMaisCaro.put("jan/2012 : Total gasto em kWh", doisMilDoze.getJan());
        mesMaisCaro.put("fev/2012 : Total gasto em kWh", doisMilDoze.getFev());
        mesMaisCaro.put("mar/2012 : Total gasto em kWh", doisMilDoze.getMar());
        mesMaisCaro.put("abr/2012 : Total gasto em kWh", doisMilDoze.getAbr());
        mesMaisCaro.put("mai/2012 : Total gasto em kWh", doisMilDoze.getMai());
        mesMaisCaro.put("jun/2012 : Total gasto em kWh", doisMilDoze.getJun());
        mesMaisCaro.put("jul/2012 : Total gasto em kWh", doisMilDoze.getJul());
        mesMaisCaro.put("ago/2012 : Total gasto em kWh", doisMilDoze.getAgo());
        mesMaisCaro.put("set/2012 : Total gasto em kWh", doisMilDoze.getSet());
        mesMaisCaro.put("out/2012 : Total gasto em kWh", doisMilDoze.getOut());
        mesMaisCaro.put("nov/2012 : Total gasto em kWh", doisMilDoze.getNov());
        mesMaisCaro.put("dez/2012 : Total gasto em kWh", doisMilDoze.getDez());
        //
        mesMaisCaro.put("jan/2013 : Total gasto em kWh", doisMilTreze.getJan());
        mesMaisCaro.put("fev/2013 : Total gasto em kWh", doisMilTreze.getFev());
        mesMaisCaro.put("mar/2013 : Total gasto em kWh", doisMilTreze.getMar());
        mesMaisCaro.put("abr/2013 : Total gasto em kWh", doisMilTreze.getAbr());
        mesMaisCaro.put("mai/2013 : Total gasto em kWh", doisMilTreze.getMai());
        mesMaisCaro.put("jun/2013 : Total gasto em kWh", doisMilTreze.getJun());
        mesMaisCaro.put("jul/2013 : Total gasto em kWh", doisMilTreze.getJul());
        mesMaisCaro.put("ago/2013 : Total gasto em kWh", doisMilTreze.getAgo());
        mesMaisCaro.put("set/2013 : Total gasto em kWh", doisMilTreze.getSet());
        mesMaisCaro.put("out/2013 : Total gasto em kWh", doisMilTreze.getOut());
        mesMaisCaro.put("nov/2013 : Total gasto em kWh", doisMilTreze.getNov());
        mesMaisCaro.put("dez/2013 : Total gasto em kWh", doisMilTreze.getDez());
        //
        mesMaisCaro.put("jan/2014 : Total gasto em kWh", doisMilQuatorze.getJan());
        mesMaisCaro.put("fev/2014 : Total gasto em kWh", doisMilQuatorze.getFev());
        mesMaisCaro.put("mar/2014 : Total gasto em kWh", doisMilQuatorze.getMar());
        mesMaisCaro.put("abr/2014 : Total gasto em kWh", doisMilQuatorze.getAbr());
        mesMaisCaro.put("mai/2014 : Total gasto em kWh", doisMilQuatorze.getMai());
        mesMaisCaro.put("jun/2014 : Total gasto em kWh", doisMilQuatorze.getJun());
        mesMaisCaro.put("jul/2014 : Total gasto em kWh", doisMilQuatorze.getJul());
        mesMaisCaro.put("ago/2014 : Total gasto em kWh", doisMilQuatorze.getAgo());
        mesMaisCaro.put("set/2014 : Total gasto em kWh", doisMilQuatorze.getSet());
        mesMaisCaro.put("out/2014 : Total gasto em kWh", doisMilQuatorze.getOut());
        mesMaisCaro.put("nov/2014 : Total gasto em kWh", doisMilQuatorze.getNov());
        mesMaisCaro.put("dez/2014 : Total gasto em kWh", doisMilQuatorze.getDez());
        //
        mesMaisCaro.put("jan/2015 : Total gasto em kWh", doisMilQuinze.getJan());
        mesMaisCaro.put("fev/2015 : Total gasto em kWh", doisMilQuinze.getFev());
        mesMaisCaro.put("mar/2015 : Total gasto em kWh", doisMilQuinze.getMar());
        mesMaisCaro.put("abr/2015 : Total gasto em kWh", doisMilQuinze.getAbr());
        mesMaisCaro.put("mai/2015 : Total gasto em kWh", doisMilQuinze.getMai());
        mesMaisCaro.put("jun/2015 : Total gasto em kWh", doisMilQuinze.getJun());
        mesMaisCaro.put("jul/2015 : Total gasto em kWh", doisMilQuinze.getJul());
        mesMaisCaro.put("ago/2015 : Total gasto em kWh", doisMilQuinze.getAgo());
        mesMaisCaro.put("set/2015 : Total gasto em kWh", doisMilQuinze.getSet());
        mesMaisCaro.put("out/2015 : Total gasto em kWh", doisMilQuinze.getOut());
        mesMaisCaro.put("nov/2015 : Total gasto em kWh", doisMilQuinze.getNov());
        mesMaisCaro.put("dez/2015 : Total gasto em kWh", doisMilQuinze.getDez());
        //
        mesMaisCaro.put("jan/2016 : Total gasto em kWh", doisMilDezesseis.getJan());
        mesMaisCaro.put("fev/2016 : Total gasto em kWh", doisMilDezesseis.getFev());
        mesMaisCaro.put("mar/2016 : Total gasto em kWh", doisMilDezesseis.getMar());
        mesMaisCaro.put("abr/2016 : Total gasto em kWh", doisMilDezesseis.getAbr());
        mesMaisCaro.put("mai/2016 : Total gasto em kWh", doisMilDezesseis.getMai());
        mesMaisCaro.put("jun/2016 : Total gasto em kWh", doisMilDezesseis.getJun());
        mesMaisCaro.put("jul/2016 : Total gasto em kWh", doisMilDezesseis.getJul());
        mesMaisCaro.put("ago/2016 : Total gasto em kWh", doisMilDezesseis.getAgo());
        mesMaisCaro.put("set/2016 : Total gasto em kWh", doisMilDezesseis.getSet());
        mesMaisCaro.put("out/2016 : Total gasto em kWh", doisMilDezesseis.getOut());
        mesMaisCaro.put("nov/2016 : Total gasto em kWh", doisMilDezesseis.getNov());
        mesMaisCaro.put("dez/2016 : Total gasto em kWh", doisMilDezesseis.getDez());
        //
        mesMaisCaro.put("jan/2017 : Total gasto em kWh", doisMilDezessete.getJan());
        mesMaisCaro.put("fev/2017 : Total gasto em kWh", doisMilDezessete.getFev());
        mesMaisCaro.put("mar/2017 : Total gasto em kWh", doisMilDezessete.getMar());
        mesMaisCaro.put("abr/2017 : Total gasto em kWh", doisMilDezessete.getAbr());
        mesMaisCaro.put("mai/2017 : Total gasto em kWh", doisMilDezessete.getMai());
        mesMaisCaro.put("jun/2017 : Total gasto em kWh", doisMilDezessete.getJun());
        mesMaisCaro.put("jul/2017 : Total gasto em kWh", doisMilDezessete.getJul());
        mesMaisCaro.put("ago/2017 : Total gasto em kWh", doisMilDezessete.getAgo());
        mesMaisCaro.put("set/2017 : Total gasto em kWh", doisMilDezessete.getSet());
        mesMaisCaro.put("out/2017 : Total gasto em kWh", doisMilDezessete.getOut());
        mesMaisCaro.put("nov/2017 : Total gasto em kWh", doisMilDezessete.getNov());
        mesMaisCaro.put("dez/2017 : Total gasto em kWh", doisMilDezessete.getDez());
        //
        mesMaisCaro.put("jan/2018 : Total gasto em kWh", doisMilDezoito.getJan());
        mesMaisCaro.put("fev/2018 : Total gasto em kWh", doisMilDezoito.getFev());
        mesMaisCaro.put("mar/2018 : Total gasto em kWh", doisMilDezoito.getMar());
        mesMaisCaro.put("abr/2018 : Total gasto em kWh", doisMilDezoito.getAbr());
        mesMaisCaro.put("mai/2018 : Total gasto em kWh", doisMilDezoito.getMai());
        mesMaisCaro.put("jun/2018 : Total gasto em kWh", doisMilDezoito.getJun());
        mesMaisCaro.put("jul/2018 : Total gasto em kWh", doisMilDezoito.getJul());
        mesMaisCaro.put("ago/2018 : Total gasto em kWh", doisMilDezoito.getAgo());
        mesMaisCaro.put("set/2018 : Total gasto em kWh", doisMilDezoito.getSet());
        mesMaisCaro.put("out/2018 : Total gasto em kWh", doisMilDezoito.getOut());
        mesMaisCaro.put("nov/2018 : Total gasto em kWh", doisMilDezoito.getNov());
        mesMaisCaro.put("dez/2018 : Total gasto em kWh", doisMilDezoito.getDez());
        //
        mesMaisCaro.put("jan/2019 : Total gasto em kWh", doisMilDezenove.getJan());
        mesMaisCaro.put("fev/2019 : Total gasto em kWh", doisMilDezenove.getFev());
        mesMaisCaro.put("mar/2019 : Total gasto em kWh", doisMilDezenove.getMar());
        mesMaisCaro.put("abr/2019 : Total gasto em kWh", doisMilDezenove.getAbr());
        mesMaisCaro.put("mai/2019 : Total gasto em kWh", doisMilDezenove.getMai());
        mesMaisCaro.put("jun/2019 : Total gasto em kWh", doisMilDezenove.getJun());
        mesMaisCaro.put("jul/2019 : Total gasto em kWh", doisMilDezenove.getJul());
        mesMaisCaro.put("ago/2019 : Total gasto em kWh", doisMilDezenove.getAgo());
        mesMaisCaro.put("set/2019 : Total gasto em kWh", doisMilDezenove.getSet());
        mesMaisCaro.put("out/2019 : Total gasto em kWh", doisMilDezenove.getOut());
        mesMaisCaro.put("nov/2019 : Total gasto em kWh", doisMilDezenove.getNov());
        mesMaisCaro.put("dez/2019 : Total gasto em kWh", doisMilDezenove.getDez());

        //print com o mes mais caro
        System.out.println("\nMês com o maior gasto (2010~2019):\n");
        mesMaisCaro.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(1)
                .forEach(System.out::println);

        Map<String,Double> anoMaisCaro = new HashMap<>();
        anoMaisCaro.put("2010: Total gasto em kWh", totalDez);
        anoMaisCaro.put("2011 : Total gasto em kWh", totalOnze);
        anoMaisCaro.put("2012 : Total gasto em kWh", totalDoze);
        anoMaisCaro.put("2013 : Total gasto em kWh", totalTreze);
        anoMaisCaro.put("2014 : Total gasto em kWh", totalQuatorze);
        anoMaisCaro.put("2015 : Total gasto em kWh", totalQuinze);
        anoMaisCaro.put("2016 : Total gasto em kWh", totalDezesseis);
        anoMaisCaro.put("2017 : Total gasto em kWh", totalDezessete);
        anoMaisCaro.put("2018 : Total gasto em kWh", totalOito);
        anoMaisCaro.put("2019 : Total gasto em kWh", totalNove);

        System.out.println("\nAno com o maior gasto (2010~2019):\n");
        anoMaisCaro.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(1)
                .forEach(System.out::println);

        System.out.println("\nConsumo médio de Janeiro referente ao intervalo 2010-2019: " + consumoMedioJan + " kWh");
        System.out.println("\nConsumo médio de Fevereiro referente ao intervalo 2010-2019: " + consumoMedioFev + " kWh");
        System.out.println("\nConsumo médio de Março referente ao intervalo 2010-2019: " + consumoMedioMar + " kWh");
        System.out.println("\nConsumo médio de Abril referente ao intervalo 2010-2019: " + consumoMedioAbr + " kWh");
        System.out.println("\nConsumo médio de Maio referente ao intervalo 2010-2019: " + consumoMedioMai + " kWh");
        System.out.println("\nConsumo médio de Junho referente ao intervalo 2010-2019: " + consumoMedioJun + " kWh");
        System.out.println("\nConsumo médio de Julho referente ao intervalo 2010-2019: " + consumoMedioJul + " kWh");
        System.out.println("\nConsumo médio de Agosto referente ao intervalo 2010-2019: " + consumoMedioAgo + " kWh");
        System.out.println("\nConsumo médio de Setembro referente ao intervalo 2010-2019: " + consumoMedioSet + " kWh");
        System.out.println("\nConsumo médio de Outubro referente ao intervalo 2010-2019: " + consumoMedioOut + " kWh");
        System.out.println("\nConsumo médio de Novembro referente ao intervalo 2010-2019: " + consumoMedioNov + " kWh");
        System.out.println("\nConsumo médio de Dezembro referente ao intervalo 2010-2019: " + consumoMedioDez + " kWh");
    }
}
