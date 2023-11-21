package com.firstapp.nesnetabanligiris.inheritanceMain;

import com.firstapp.nesnetabanligiris.inheritance.HayvanOverride;
import com.firstapp.nesnetabanligiris.inheritance.KediOverride;
import com.firstapp.nesnetabanligiris.inheritance.KopekOverride;
import com.firstapp.nesnetabanligiris.inheritance.MemelilerOverride;

public class PolymorphismMain {
    public static void main(String Args[]){
        HayvanOverride hayvan = new KediOverride();

        //Polymorphism ( Çok çeşitlilik ) bir alt sınıfın özelliklerini bir üst sınıfa aktarmaktır.
        // Yani alt sınıf üst sınıf gidi davranır.
        //Artık hayvan nesnesinin içinde kedinin özellikleri vardır.

        hayvan.sesCikar(); //KediOverride methodunu çağırır.

        HayvanOverride hayvan2 = new KopekOverride();

        hayvan2.sesCikar(); //koperOverride sınıfını çağırır.


        HayvanOverride hayvan3 = new MemelilerOverride();
        hayvan3.sesCikar(); //Kendi hayvan methodu olmadığı için Hayvanın kendi method 'unu çağırır.
    }
}
