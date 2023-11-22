package com.firstapp.nesnetabanligiris.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListNesneMain {
    public static void main(String args[])
    {
        List<OgrenciArrayListNesne> nesneler = new ArrayList<>(); //polymorphism sol taraf üst sınıf/sağ taraf alt sınıf

        OgrenciArrayListNesne ogr1 = new OgrenciArrayListNesne(3333, "Ayşe");
        OgrenciArrayListNesne ogr2 = new OgrenciArrayListNesne(5555, "Ahmet");
        OgrenciArrayListNesne ogr3 = new OgrenciArrayListNesne(8888, "Mehmet");
        OgrenciArrayListNesne ogr4 = new OgrenciArrayListNesne(2222, "Fatma");

        nesneler.add(ogr1);
        nesneler.add(ogr2);
        nesneler.add(ogr3);
        nesneler.add(ogr4);

        int sira = 1;

        for (OgrenciArrayListNesne o:nesneler)
        {
            System.out.println(sira+") "+ o.getTcno()+ " "+o.getOgrAd());
            sira++;
        }


    }

}
