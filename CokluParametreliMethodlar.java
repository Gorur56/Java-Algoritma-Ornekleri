package com.firstapp.nesnetabanligiris;

public class CokluParametreliMethodlar {
    public double ortalamaHesapla(double... sayilar) //Buradsı dizi görevi görüyor. İstediğimiz kadar sayı koyabiliriz.
    {                                                // Her işlemde bir tane kullanabiliriz ve en sonda olmalıdır.
        double toplam = 0;

        for (double s:sayilar){
            toplam = toplam + s;
        }

        return toplam / sayilar.length;
    }
}
