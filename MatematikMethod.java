package com.firstapp.nesnetabanligiris;

public class MatematikMethod {
    public void carpma( int sayi1, int sayi2 ) // Geri dönüş değeri yoktur.
    {
        int sonuc = sayi1 * sayi2;
        System.out.println("Sonuç: "+sonuc );
    }

    public int topla(int sayi1, int sayi2, int sayi3 ){
        int toplam = sayi1 + sayi2 + sayi3;
        return toplam;
    }

    public int cikarma(int sayi1, int sayi2, String isim)
    {
        int sonuc = sayi1 - sayi2;
        System.out.println("işi yapan: "+ isim);
        return sonuc;
    }
}
