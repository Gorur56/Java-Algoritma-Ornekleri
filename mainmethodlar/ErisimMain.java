package com.firstapp.nesnetabanligiris.mainmethodlar;

import com.firstapp.nesnetabanligiris.siniflar.Ogrenciler;

public class ErisimMain {
    public static void main(String Args[]){
        Ogrenciler ogr = new Ogrenciler();

        ogr.OgrAd = "Sevim";
        ogr.OgrNo = 123;

        ogr.bilgiAl();

    }
}
