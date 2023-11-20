package com.firstapp.nesnetabanligiris.mainmethodlar;

import com.firstapp.nesnetabanligiris.siniflar.FinalSabitleri;

public class FinalSabitleriMain {
    public static void main( String Args[]){
        FinalSabitleri renk = new FinalSabitleri();

        renk.boya(FinalSabitleri.red); // red 'de zaten int bir değer olduğu için direk böyle yazabiliriz.

        //FinalSabitleri.red = 2222; // Hata verir. Final değişken değiştirilemez.
    }
}
