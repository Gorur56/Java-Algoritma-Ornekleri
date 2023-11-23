package com.firstapp.nesnetabanligiris.collections;

import java.util.HashSet;

public class HashSetMAin {
    public static void main(String Args[])
    {
        //Hashset 'te Array listlere benzer
        //Burada aynı değer iki defa tekrarlanmaz.
        //Bir tane NULL değer olabilir.
        //Elemanlar ekleme sırasına göre tutulmaz. Herhangi bir yere kaydeder.

        HashSet<String> meyveler = new HashSet<>();

        meyveler.add("Armut");
        meyveler.add("Çilek");
        meyveler.add("Muz");
        meyveler.add("Ayva");
        meyveler.add("Elma");
        meyveler.add("Portakal");

        //Rasgele içerik atadığı için burada sadece içeriğine göre silebiliriz.
        //Indeks' e göre araya ekleme işlemi de burada yoktur.

        meyveler.remove("Muz");

        //Aynı veriden kayıt yapmıyor demiştik.

        meyveler.add("Armut"); //Çalıştığında artmut bir defa çıkar. Çıktı: -Armut-Çilek-Elma-Ayva-Portakal

        for (String m:meyveler)
        {
            System.out.print("-"+ m); //Çıktı: -Armut-Muz-Çilek-Elma-Ayva-Portakal
        }


    }
}
