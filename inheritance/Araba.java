package com.firstapp.nesnetabanligiris.inheritance;

public class Araba extends Arac { // extends anahtar kelime ile Arac 'tan miras aldık.
    private String kasaTipi;

    public Araba() {
    }

    public Araba(String kasaTipi) {
        this.kasaTipi = kasaTipi;
    }

    public String getKasaTipi() {
        return kasaTipi;
    }

    public void setKasaTipi(String kasaTipi) {
        this.kasaTipi = kasaTipi;
    }

    public void bilgiAl(){
        System.out.println("\nKasa Tipi   :"+ kasaTipi);
        System.out.println("Renk        :"+ super.getRenk()); //super üst sınıf demek alttaki gibi yazmasakta olur.
        System.out.println("Vites Tipi  :"+ getVitesTipi());


    }
}
