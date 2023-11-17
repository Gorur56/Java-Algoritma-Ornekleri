package com.firstapp.nesnetabanligiris;

import java.util.Scanner;

public class InternetUcretiHesaplamaMain {
    public static void main(String Args[]) {

        Scanner tarayici = new Scanner(System.in);
        System.out.println("Kullanılan internet kotasını giriniz: ");
        int kota = tarayici.nextInt();

        OdevlerSinifi os = new OdevlerSinifi();

        int ucret = os.internetUcretiHesap(kota);
        System.out.println("İnternet Ücreti: " + ucret);
    }
}