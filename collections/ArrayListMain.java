package com.firstapp.nesnetabanligiris.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMain {
    public static void main( String Args[])
    {

        //Arraylist 'lerin dizilerden farkı başlangıçta boyutunu belirtmiyorum.
        //Veri atadıkça kendini otomatik genişletiyor.

        ArrayList<String> meyveler = new ArrayList<>(); //İçi boş arrayList

        meyveler.add("Elma"); // Dizinin sonuna ekler
        meyveler.add("Portakal");
        meyveler.add("Çilek");

        System.out.println("Boyut: "+ meyveler.size());

        meyveler.add("Erik");

        //get methodu ile erişebiliriz.

        System.out.println(meyveler.get(1));

        //İçerik veya indeksine göre silebilriiz.

        meyveler.remove("Çilek"); // OR meyveler.remove(2);

        //Orta kısmına veri girmek istersek aşağıdaki gibi ekliyoruz.

        meyveler.add(1,"Muz"); // 1.ci indekse muz ekledik. Ve portakal 2. indekse kaydı.

        //Yerini değiştirmek istersek

        meyveler.set(3,"Mandalina"); //ERik i Mandalina ile değiştirdik.


        Collections.sort(meyveler); //Kendi içeriğine göre bir sıralama yapar. (Metinsel veya Sayısal)

        for (String m:meyveler)
        {
            System.out.print(m + "-");
        }
    }
}
