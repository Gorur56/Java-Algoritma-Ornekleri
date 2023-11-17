package com.firstapp.nesnetabanligiris.siniflar;

public class Urunler {
    private String urunAdi;
    private int urunAdeti;

    //Boş constructor
    //Dolu constructor
    //Set ve get methodlar her zaman kullanılacaktır.


    public Urunler() {

    }

    public Urunler( String urunAdi, int urunAdeti ){
        this.urunAdi = urunAdi;
        this.urunAdeti = urunAdeti;
    }

    public void setUrunAdi( String urunAdi )
    {
        this.urunAdi = urunAdi;
    }

    public String getUrunAdi(){
        return this.urunAdi;
    }

    public void setUrunAdeti( int urunAdeti )
    {
        this.urunAdeti = urunAdeti;
    }

    public int getUrunAdeti(){
        return this.urunAdeti;
    }
}
