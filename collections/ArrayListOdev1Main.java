package com.firstapp.nesnetabanligiris.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListOdev1Main {
    public static void main(String args[])
    {
        ArrayList<Integer> sayilar = new ArrayList<Integer>();

        Random random = new Random();

        int rastgeleSayi;


        for (int i = 0; i <11; i++)
        {
            rastgeleSayi = random.nextInt(101);
            sayilar.add(rastgeleSayi);
        }

        Collections.sort(sayilar);

        for (int r:sayilar)
        {
            System.out.println("RAstgele sayılar: " + r);
        }

    }
}
