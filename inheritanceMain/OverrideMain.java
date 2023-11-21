package com.firstapp.nesnetabanligiris.inheritanceMain;

import com.firstapp.nesnetabanligiris.inheritance.HayvanOverride;
import com.firstapp.nesnetabanligiris.inheritance.KediOverride;
import com.firstapp.nesnetabanligiris.inheritance.KopekOverride;
import com.firstapp.nesnetabanligiris.inheritance.MemelilerOverride;

public class OverrideMain {
    public static void main(String Args[]){
        //Override methodun 'Da önce herkes kendi method 'unu çalıştırır.
        //Eğer yoksa bir üst sınıfı çalıştırır.

        HayvanOverride h1 = new HayvanOverride();

        h1.sesCikar(); //Çıktı = Sesim yokk...

        MemelilerOverride m1 = new MemelilerOverride();
        //Memelilerde bu method olmadığı için bir üst sınıfı hayvan sınıfından alacaktır.

        m1.sesCikar(); //Çıktı = Sesim yokk...

        KopekOverride k1 = new KopekOverride();
        k1.sesCikar(); //Çıktı = Hav Hav

        KediOverride kedi1 = new KediOverride();
        kedi1.sesCikar(); //Çıktı = Miyav
    }
}
