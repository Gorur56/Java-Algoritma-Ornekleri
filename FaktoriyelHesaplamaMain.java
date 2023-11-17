package com.firstapp.nesnetabanligiris;

import java.util.Scanner;



public class FaktoriyelHesaplamaMain {
    public static void main( String Args[]){
        Scanner tarayici = new Scanner(System.in);
        System.out.println("Bir Sayı giriniz: ");

        int sayi = tarayici.nextInt();
        long fak = faktoriyelHesaplaa(sayi);
        System.out.println("Faktöreyel Sonucu: "+ fak);

        OdevlerSinifi os = new OdevlerSinifi();

        os.faktoriyelHesabi(sayi);

    }

    private static long faktoriyelHesaplaa( int n )
    {
        if ( n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return n * faktoriyelHesaplaa(n-1);
        }
    }


}
