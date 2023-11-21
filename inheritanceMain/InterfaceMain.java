package com.firstapp.nesnetabanligiris.inheritanceMain;

import com.firstapp.nesnetabanligiris.inheritance.AmasyaElmasıInterface;
import com.firstapp.nesnetabanligiris.inheritance.AslanInterface;
import com.firstapp.nesnetabanligiris.inheritance.EatableInterface;
import com.firstapp.nesnetabanligiris.inheritance.ElmaInterface;
import com.firstapp.nesnetabanligiris.inheritance.SquueezableInterface;
import com.firstapp.nesnetabanligiris.inheritance.TavukInterface;

public class InterfaceMain {
    public static void main(String args[]){
        Object aslan = new AslanInterface(); //Polymorphism

        ElmaInterface elma = new ElmaInterface();

        AmasyaElmasıInterface aElme = new AmasyaElmasıInterface();

        EatableInterface tavuk = new TavukInterface();

        //Hepsi obje 'den türediği için obje adında bir diziye atayabiliriz.

        Object [] nesneler = new Object[]{aslan,elma,aElme,tavuk};

        for (Object o:nesneler){
            if( o instanceof EatableInterface)
            {
                ((EatableInterface)o).howToEat();
            } else if (o instanceof SquueezableInterface) {
                ((SquueezableInterface)o).howToSquueezable();
            }
        }
    }
}
