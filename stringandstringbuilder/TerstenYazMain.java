package com.firstapp.nesnetabanligiris.stringandstringbuilder;

import java.util.Scanner;

public class TerstenYazMain {
    public static void main( String args[]){
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Lütfen bir kelime giriniz: ");
        String text = tarayici.next();

        int boyut = text.length();

        char [] dizi = new char[boyut];

        for (int i = 0; i < boyut; i++)
        {
            dizi[i] = text.charAt(i);
        }

        for (int j = (boyut -1); j >= 0; j-- ) //Tersten başlaması için sondan başlayığ 0 a kadar dizide dolaşıyoruz.
        {
            System.out.print(dizi[j]);
        }
    }
}
