package com.firstapp.nesnetabanligiris;

import java.util.Scanner;

public class SicaklikDonusumMain {
    public static void main( String Args[]){
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Sıcaklık değerini giriniz: ");
        double sicaklik = tarayici.nextDouble();

        OdevlerSinifi os = new OdevlerSinifi();
        os.sicaklikDonustur( sicaklik );


    }
}
