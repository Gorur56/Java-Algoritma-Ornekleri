package com.firstapp.nesnetabanligiris.collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapMain {
    public static void main(String Args[])
    {
        //Anahtarlar ile değerler eşler.
        //Her anahtar yalnızca bir defa kullanılır.
        //Değerlere anahtar aracılığıyla erişilir.
        HashMap<Integer,String> plakalar = new HashMap<>();//HashMap<Integer,String> => Key türü ve değerlerin türü.
                                                           // Türlerin hepsi burada büyük harf ile yazılır.

        plakalar.put(16,"Bursa");
        plakalar.put(34,"İstanbul");
        plakalar.put(01, "Adana");

        System.out.println(plakalar.get(34)); //Çıktı=> İstanbul

        Set<Integer> anahtarlar = plakalar.keySet(); //Anahtarları diziye set ledik.

        for (Integer k:anahtarlar)
        {
            System.out.println(plakalar.get(k));
        }


        //HASHMAP 'İ NESNELER İLE KULLANMA

        HashMap<Integer,OgrenciArrayListNesne> nesneler = new HashMap<>();


        OgrenciArrayListNesne ogr1 = new OgrenciArrayListNesne(3333, "Ayşe");
        OgrenciArrayListNesne ogr2 = new OgrenciArrayListNesne(5555, "Ahmet");
        OgrenciArrayListNesne ogr3 = new OgrenciArrayListNesne(8888, "Mehmet");
        OgrenciArrayListNesne ogr4 = new OgrenciArrayListNesne(2222, "Fatma");

        nesneler.put(ogr1.getOkulNo(),ogr1);
        nesneler.put(ogr2.getOkulNo(),ogr2);
        nesneler.put(ogr3.getOkulNo(),ogr3);
        nesneler.put(ogr4.getOkulNo(),ogr4);


        Set<Integer> key = nesneler.keySet();

        for (Integer k:key)
        {
            System.out.println("*****************************************");
            System.out.println(nesneler.get(k).getOkulNo());
            System.out.println(nesneler.get(k).getOgrAd());
            System.out.println("*****************************************");

        }


    }

}
