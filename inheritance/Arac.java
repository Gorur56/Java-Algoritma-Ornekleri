package com.firstapp.nesnetabanligiris.inheritance;

public class Arac { //extend object otomatik olur.
    private String renk;
    private String vitesTipi;

    public Arac() {
        super(); //Java da bir üst sınıf olan object sınıfını çalıştırır.
        System.out.println("Araç boş constractor çalıştı...");
    }

    public Arac(String renk, String vitesTipi) {
        super();
        this.renk = renk;
        this.vitesTipi = vitesTipi;
        System.out.println("Araç dolu constractor çalıştı...");
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getVitesTipi() {
        return vitesTipi;
    }

    public void setVitesTipi(String vitesTipi) {
        this.vitesTipi = vitesTipi;
    }
}
