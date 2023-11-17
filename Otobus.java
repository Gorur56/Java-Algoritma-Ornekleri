package com.firstapp.nesnetabanligiris;

public class Otobus {

    //Özellikler

    String firmaAdi;
    int kapasite;
    int mevcutYolcu;
    String nereden;
    String nereye;

    public void bilgiAl(){
        System.out.println("Firma:        "+ firmaAdi);
        System.out.println("kapasite:     "+ kapasite);
        System.out.println("Mevcut Yolcu: "+ mevcutYolcu);
        System.out.println("Nereden:      "+nereden);
        System.out.println("Nereye:       "+nereye+"\n");
    }

    public void  yolcuAl( int yolcuMiktari )
    {
        int yolcuKontrol = mevcutYolcu + yolcuMiktari;

        if ( yolcuKontrol > kapasite)
        {
            System.out.println("Otobüs doludur!!!");
        }
        else
        {
            mevcutYolcu = mevcutYolcu + yolcuMiktari;
        }
    }

    public  void yolcuIndir( int yolcuMiktari )
    {
        int yolcuKontrol = mevcutYolcu - yolcuMiktari;

        if ( yolcuKontrol < 0)
        {
            System.out.println("Otobüste yolcu yoktur!!!");
        }
        else
        {
            mevcutYolcu = mevcutYolcu - yolcuMiktari;
        }
    }
}
