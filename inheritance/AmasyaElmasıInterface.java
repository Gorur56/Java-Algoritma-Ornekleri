package com.firstapp.nesnetabanligiris.inheritance;

public class AmasyaElmasıInterface extends ElmaInterface { //Elmada interface 'leri implement ettiğimiz için
                                                           // direk üst sınıfı override edebilir.
    @Override
    public void howToSquueezable() {
        System.out.println("Değerli meyve yemelisin...");
    }
}
