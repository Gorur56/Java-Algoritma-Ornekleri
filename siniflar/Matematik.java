package com.firstapp.nesnetabanligiris.siniflar;

public class Matematik {
    public static void topla( int sayi1, int sayi2) // Eğer bunu static yaparsak çağırdığımız yerde direk class ismiyle çağırabiliriz.
    {                                        // ilk önce bir nesne oluşturmaya gerek kalmaz.
        int sonuc = sayi1 + sayi2;
        System.out.println("Toplam: "+ sonuc);
    }
}
