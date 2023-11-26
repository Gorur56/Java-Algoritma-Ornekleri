package com.firstapp.nesnetabanligiris.ilerijava;

public class HesaplayiciTryCatch {

    public int bol(int sayi1,int sayi2) throws Exception
    {
        if (sayi2 == 0) throw new Exception("Sıfıra Bölünmez!!!");
        return sayi1/sayi2;
    }
}
