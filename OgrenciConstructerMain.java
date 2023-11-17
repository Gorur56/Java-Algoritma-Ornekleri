package com.firstapp.nesnetabanligiris;

public class OgrenciConstructerMain {
    public static void main( String Args[]){

        OgrenciConstructer ogrenci = new OgrenciConstructer(); // new denildiğinde boş bir constructer oluşturur.

        ogrenci.isim = "Sevim";
        ogrenci.okulNo = 1947;
        ogrenci.adres = "Maltepe";

        OgrenciConstructer ogrenci2 = new OgrenciConstructer("Yücel", 1545, "İstanbul");

        System.out.println(ogrenci2.adres); //sonuc istanbulu gösterir.

    }
}
