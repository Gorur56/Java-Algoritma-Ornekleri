package com.firstapp.nesnetabanligiris.siniflar;

public class PersonelStatic {
    private String isim;
    private int yas;
    public static int sayac;

    public static  int sifre;

    public PersonelStatic() {
        sayac++;
    }

    public PersonelStatic( String isim, int yas){
        sayac++;
        this.isim = isim;
        this.yas = yas;
    }

    public void setIsim(String isim)
    {
        this.isim = isim;
    }

    public String getIsim()
    {
        return isim;
    }

    public void setYas(int yas)
    {
        this.yas = yas;
    }

    public int getYas()
    {
        return yas;
    }
}
