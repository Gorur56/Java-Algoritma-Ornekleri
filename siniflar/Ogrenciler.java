package com.firstapp.nesnetabanligiris.siniflar;

public class Ogrenciler {
    public String OgrAd; //Eğer önunde acces modifier yoksa protected 'dır. Başka paketten erişilemez.
                         // Eğer private veya protected tanımlarsak yine başka paketten erişemeyiz.
    public int OgrNo;


    private String kapOgrAd; //Kapsülleme set- get için
    private int kapOgrNo;

    public void setIsim( String isim )
    {
        this.kapOgrAd = isim;
    }

    public String getIsim()
    {
        return this.kapOgrAd;
    }

    public void setOgrNo( int OgrNo ) // Başka paket altında veya class 'ta private nesne ve method 'lara erişmek için
    {                                 // set-get methodlarını kulanırız. Kontrollü bir şekilde paylaşırız. Buna
        this.kapOgrNo = OgrNo;        // Kapsülleme denir.
    }

    public int getOgrNo()
    {
        return this.kapOgrNo;
    }

    public void bilgiAl(){
        System.out.println("Öğrenci Adı: "+ OgrAd);
        System.out.println("Öğrenci No: "+ OgrNo);
    }

}
