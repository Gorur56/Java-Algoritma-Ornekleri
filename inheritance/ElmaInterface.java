package com.firstapp.nesnetabanligiris.inheritance;

public class ElmaInterface implements EatableInterface, SquueezableInterface{
    @Override
    public void howToEat() {
        System.out.println("Isırarak ye...");
    }

    @Override
    public void howToSquueezable() {
        System.out.println("Suyunu sık ve iç.");
    }
}
