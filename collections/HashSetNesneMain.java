package com.firstapp.nesnetabanligiris.collections;

import java.util.HashSet;

public class HashSetNesneMain {
    public static void main(String Args[])
    {
        HashSet<OgrenciArrayListNesne> nesneler = new HashSet<>(); //polymorphism sol taraf üst sınıf/sağ taraf alt sınıf

        OgrenciArrayListNesne ogr1 = new OgrenciArrayListNesne(3333, "Ayşe");
        OgrenciArrayListNesne ogr2 = new OgrenciArrayListNesne(5555, "Ahmet");
        OgrenciArrayListNesne ogr3 = new OgrenciArrayListNesne(8888, "Mehmet");
        OgrenciArrayListNesne ogr4 = new OgrenciArrayListNesne(2222, "Fatma");

        //İki değer olunca aynı değerler girilse de kayıt atıyor. Çünkü hangi değere göre sıralama yapacğaını bilemeiyor.

        //Eğer aynı kaydı alsın istemiyorsak OgrenciArrayListNesne sınıfına override fonksiyonları yazarız.
        OgrenciArrayListNesne ogr5 = new OgrenciArrayListNesne(2222, "Fatma");



        nesneler.add(ogr1);
        nesneler.add(ogr2);
        nesneler.add(ogr3);
        nesneler.add(ogr4);
        nesneler.add(ogr5);



        int sira = 1;

        for (OgrenciArrayListNesne o:nesneler)
        {
            System.out.println(sira+") "+ o.getOkulNo()+ " "+o.getOgrAd());
            sira++;
        }
    }
}
