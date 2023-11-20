package com.firstapp.nesnetabanligiris.mainmethodlar;

import com.firstapp.nesnetabanligiris.siniflar.AdreslerCompositon;
import com.firstapp.nesnetabanligiris.siniflar.KisilerComposition;

public class CompositionMain {
    public static void main( String Args[]){
        //Composition genelde veritabanlarında kullanılır.
        //İçerideki sınıf her zaman önce tanımlanmalıdır.
        AdreslerCompositon adres = new AdreslerCompositon("İstanbul", "Maltepe");

        KisilerComposition kisi = new KisilerComposition("Sevim", 0553546, adres);

        System.out.println("Kişi: "+ kisi.getIsim());
        System.out.println("Tel: "+ kisi.getTel());

        //Bu şekilde composition yani iç içe sınıflara erişebildik.
        System.out.println("Adres: "+ kisi.getAdresler().getIl() +"/"+ kisi.getAdresler().getIlce());
        
    }
}
