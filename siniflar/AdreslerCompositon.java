package com.firstapp.nesnetabanligiris.siniflar;

public class AdreslerCompositon {

    //Adres bilgileri için bu sınıfı oluşturduk.
    private String il;
    private String ilce;

    public AdreslerCompositon(String il) {
    }
    public AdreslerCompositon(String il, String ilce) {
        this.il = il;
        this.ilce = ilce;
    }
    public void setIl(String il) {
        this.il = il;
    }
    public String getIl() {
        return il;
    }
    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getIlce() {
        return ilce;
    }
}
