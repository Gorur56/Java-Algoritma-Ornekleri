package com.firstapp.nesnetabanligiris;

import java.util.Scanner;

public class IcAciToplamiMain {
    public static void main( String Args[])
    {
        Scanner tarayici = new Scanner(System.in);
        System.out.println("Kenar sayısı giriniz: ");

        int kenar = tarayici.nextInt();

        OdevlerSinifi os = new OdevlerSinifi();

        int toplam = os.icAciToplami(kenar);

        System.out.println("iç açılar toplamı: "+ toplam);
    }
}
