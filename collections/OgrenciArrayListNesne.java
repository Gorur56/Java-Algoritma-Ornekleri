package com.firstapp.nesnetabanligiris.collections;

public class OgrenciArrayListNesne {
    private int tcno;
    private String ogrAd;

    public OgrenciArrayListNesne() {
    }

    public OgrenciArrayListNesne(int tcno, String ogrAd){
        this.tcno = tcno;
        this.ogrAd = ogrAd;
    }

    public void setTcno(int tcno)
    {
        this.tcno = tcno;
    }

    public int getTcno()
    {
        return tcno;
    }

    public void setOgrAd(String ogrAd)
    {
        this.ogrAd = ogrAd;
    }

    public String getOgrAd()
    {
        return this.ogrAd;
    }
}
