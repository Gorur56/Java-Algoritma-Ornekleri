package com.firstapp.nesnetabanligiris.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOdev2 {
    public static void main(String Args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir isim giriniz: ");

        String isim = scan.next();

        ArrayList<String> isimler = new ArrayList<>();

        isimler.add("Sevim");
        isimler.add("Mehmet");
        isimler.add("Ayşe");
        isimler.add("Fatma");
        isimler.add("Necati");

        for (String i:isimler)
        {
            if( i.equalsIgnoreCase(isim)) //Küçük büyük harf fark etmez.
            {
                System.out.println("isim var");
                break;
            }
            else
            {
                System.out.println("İsim yok");
                break;
            }
        }
    }
}
