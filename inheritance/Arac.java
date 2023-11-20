package com.firstapp.nesnetabanligiris.inheritance;

public class Arac { //extend object otomatik olur.
    private String renk;
    private String vitesTipi;

    public Arac() {
    }

    public Arac(String renk, String vitesTipi) {
        this.renk = renk;
        this.vitesTipi = vitesTipi;
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
