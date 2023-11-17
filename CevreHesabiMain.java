package com.firstapp.nesnetabanligiris;

import java.util.Scanner;

public class CevreHesabiMain {
    public static void main( String Args[]){
        Scanner tarayici = new Scanner(System.in);

        System.out.println( "Uzun kenarı giriniz: " );
        int uzunKenar = tarayici.nextInt();

        System.out.println("Kısa kenari giriniz: ");
        int kisaKenar = tarayici.nextInt();

        OdevlerSinifi os = new OdevlerSinifi();
        os.cevreHesabi(uzunKenar,kisaKenar);
    }
}
