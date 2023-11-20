package com.firstapp.nesnetabanligiris.inheritance;

public class Araba extends Arac { // extends anahtar kelime ile Arac 'tan miras aldık.
    private String kasaTipi;

    public Araba() {
        super();
        System.out.println("Araba boş constractor çalıştı...");
    }

    public Araba(String kasaTipi) {
        super();
        this.kasaTipi = kasaTipi;
        System.out.println("Araba dolu constractor çalıştı...");
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
