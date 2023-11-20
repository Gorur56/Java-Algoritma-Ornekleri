package com.firstapp.nesnetabanligiris.siniflar;

public class KisilerComposition {
    private String isim;
    private long tel;

    //il ilce bilgisi herkeste aynı olabilir ve string tekrarlanır. Bu yüzden bir alt sınıf(Adresler) oluşturup id ile ekleyeceğiz.

    private AdreslerCompositon adresler; // Bununla il ve ilçeye erişeebiliriz.

    public KisilerComposition() {
    }

    public KisilerComposition(String isim, long tel, AdreslerCompositon adresler) {
        this.isim = isim;
        this.tel = tel;
        this.adresler = adresler;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public AdreslerCompositon getAdresler() {
        return adresler;
    }

    public void setAdresler(AdreslerCompositon adresler) {
        this.adresler = adresler;
    }

}
