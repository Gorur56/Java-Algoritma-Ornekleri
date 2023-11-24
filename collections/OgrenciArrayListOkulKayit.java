package com.firstapp.nesnetabanligiris.collections;

public class OgrenciArrayListOkulKayit {
    private int okulNo;
    private String ogrAd;

    public OgrenciArrayListOkulKayit() {
    }

    public OgrenciArrayListOkulKayit(int okulNo, String ogrAd) {
        this.okulNo = okulNo;
        this.ogrAd = ogrAd;
    }

    public void setOkulNo(int okulNo)
    {
        this.okulNo = okulNo;
    }

    public int getOkulNo()
    {
        return okulNo;
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
