package com.firstapp.nesnetabanligiris.siniflar;

public class Ogrenciler {
    public String OgrAd; //Eğer önunde acces modifier yoksa protected 'dır. Başka paketten erişilemez.
                         // Eğer private veya protected tanımlarsak yine başka paketten erişemeyiz.
    public int OgrNo;

    public void bilgiAl(){
        System.out.println("Öğrenci Adı: "+ OgrAd);
        System.out.println("Öğrenci No: "+ OgrNo);
    }
}
