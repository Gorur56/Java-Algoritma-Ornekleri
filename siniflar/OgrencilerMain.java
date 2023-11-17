package com.firstapp.nesnetabanligiris.siniflar;

public class OgrencilerMain {
    public static void main(String Args[]){
        Ogrenciler ogr = new Ogrenciler();
        ogr.OgrAd = "Yücel"; //Aynı pakette olduğu için protected tanımlarsak erişebiliriz.
        ogr.OgrNo = 12345; // Ama buradan private tanımlanan bir nesneye erişemeyiz.

    }
}
