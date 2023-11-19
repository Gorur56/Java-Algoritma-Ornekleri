package com.firstapp.nesnetabanligiris.mainmethodlar;

import com.firstapp.nesnetabanligiris.siniflar.Matematik;
import com.firstapp.nesnetabanligiris.siniflar.PersonelStatic;

public class StaticMain {
    public static void main( String Args[]){
        Matematik.topla(23,63); // topla fonksiyonu static olduğu için direk erişebiliyoruz.

        PersonelStatic pS1 = new PersonelStatic("Sevim",29);

        System.out.println("Sayaç2: "+ pS1.sayac); //pS1 bir defa girdiği için sonuç 1 verir.


        PersonelStatic pS2 = new PersonelStatic("Ahmet",22);
        PersonelStatic pS3 = new PersonelStatic("Fatma",26);
        PersonelStatic pS4 = new PersonelStatic("Yücel",28);

        // constructor 'a 4 defa girdi.


        PersonelStatic.sifre = 123456;

        System.out.println("Sayaç: "+ PersonelStatic.sayac + " Şifre: " + PersonelStatic.sifre); //Sayaç statik olduğu için direk erişebildik.



    }
}
