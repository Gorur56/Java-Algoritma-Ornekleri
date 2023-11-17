package com.firstapp.nesnetabanligiris;

public class MatematikselHesaplamaOverloading {
    public void topla( int sayi1, int sayi2 )
    {
        System.out.println("Sonuç1: "+ ( sayi1 + sayi2 ) );
    }

    public void topla( double sayi1, int sayi2 )
    {
        System.out.println("Sonuç2: "+ ( sayi1 + sayi2 ));
    }

    public void topla( int sayi1, double sayi2 )
    {
        System.out.println("Sonuç3: "+ ( sayi1 + sayi2 ));
    }

    public void topla( int sayi1, int sayi2, String isim )
    {
        System.out.println("işi yapan: "+ isim);
        System.out.println("Sonuç4: "+ ( sayi1 + sayi2 ));
    }
}
