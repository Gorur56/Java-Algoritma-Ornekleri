package com.firstapp.nesnetabanligiris.mainmethodlar;

import com.firstapp.nesnetabanligiris.siniflar.Ogrenciler;
import com.firstapp.nesnetabanligiris.siniflar.Urunler;

public class ErisimMain {
    public static void main(String Args[]){
        Ogrenciler ogr = new Ogrenciler();

        ogr.OgrAd = "Sevim";
        ogr.OgrNo = 123;

        ogr.bilgiAl();

        ogr.setIsim("Yücel");
        ogr.setOgrNo(258);

        System.out.println("Öğrenci Adı: "+ ogr.getIsim());
        System.out.println("Öğrenci No: "+ ogr.getOgrNo());


        Urunler urun = new Urunler("Telefon", 30);

        System.out.println("ürün Adı: "+ urun.getUrunAdi());
        System.out.println("ürün Adeti: "+ urun.getUrunAdeti());

    }
}
