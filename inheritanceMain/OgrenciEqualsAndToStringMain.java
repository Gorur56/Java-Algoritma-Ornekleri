package com.firstapp.nesnetabanligiris.inheritanceMain;

import com.firstapp.nesnetabanligiris.inheritance.OgrenciEqualsAndToString;
import com.firstapp.nesnetabanligiris.siniflar.Ogrenciler;

public class OgrenciEqualsAndToStringMain {
    public static void main(String Args[]){
        OgrenciEqualsAndToString ogr1 = new OgrenciEqualsAndToString(8888, "Sevim");
        OgrenciEqualsAndToString ogr2 = new OgrenciEqualsAndToString(1111, "Ahmet");
        OgrenciEqualsAndToString ogr3 = new OgrenciEqualsAndToString(2222, "Mehmet");
        OgrenciEqualsAndToString ogr4 = new OgrenciEqualsAndToString(4444, "Ahmet");

        System.out.println(ogr1); //Normalde ogr 'lerin oluştuğu adresi çıktı olarak verir.
        System.out.println(ogr2); //OgrenciEqualsAndToString sınıfında oluşturduğumuz toString methodu sayesinde
        System.out.println(ogr3); // artık değerlerini görebiliriz.
        System.out.println(ogr4);

        if ((ogr1.equals(ogr4))) //yazdığımız override equals fonksiyonu sayesinde direk obj ile karşılaştırabiliyoruz.
        {
            System.out.println("Eşit");
        }
        else
        {
            System.out.println("Eşit değil.");
        }

    }
}
