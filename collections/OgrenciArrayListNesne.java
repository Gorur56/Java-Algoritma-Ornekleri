package com.firstapp.nesnetabanligiris.collections;

import androidx.annotation.Nullable;

public class OgrenciArrayListNesne implements Comparable<OgrenciArrayListNesne>{
    //Nesleleri sıralatmak istersek bu şekilde implement etmemiz gerekiyor.
    // OgrenciArrayListNesne sınıfının içeriğine göre sıralama yapacaktır.
    private int okulNo;
    private String ogrAd;

    public OgrenciArrayListNesne() {
    }

    public OgrenciArrayListNesne(int okulNo, String ogrAd){
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

    //HasCode 'da Okul numaraları aynıysa artık kaydı almayacak.
    @Override
    public int hashCode() {
        return this.okulNo;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        //false göndüğünde artık aynı okul numarası varsa kayıt yapmayacaktır.
        
        if(this.okulNo == ((OgrenciArrayListNesne)obj).getOkulNo())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /*
    @Override
    public int compareTo(OgrenciArrayListNesne ogrenciArrayListNesne) { //Nesnelerin sıralanması için override method 'u gerekiyor.
        return new Integer(this.tcno).compareTo(ogrenciArrayListNesne.getTcno()); //Tcno 'ya göre sıralama yapacaktır.
    }*/

    //String 'e göre sıralama yapacaksak;


    @Override
    public int compareTo(OgrenciArrayListNesne ogrenciArrayListNesne) {
        return new String(this.ogrAd).compareTo(ogrenciArrayListNesne.getOgrAd());
    }
}
