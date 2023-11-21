package com.firstapp.nesnetabanligiris.inheritanceMain;

import com.firstapp.nesnetabanligiris.inheritance.Araba;
import com.firstapp.nesnetabanligiris.inheritance.Subaru;

public class CasttingMain {
    public static void main(String Args[]){
        //Araba ve Subaru arasında dönüşüm yapacağız.
        //Subaru 'dan Arabaya dönğş yapacaksak upcasting
        //Arabadan Subaru 'ya dönüşüm olacaksa downcasting

        //Aşağıdaki işleme upcast denir.

        Subaru subaru = new Subaru();
        Araba araba = subaru;

        //Bu da downcast dönüşüm

        Araba araba1 = new Araba();
        Subaru subaru1 = (Subaru)araba;
    }
}
