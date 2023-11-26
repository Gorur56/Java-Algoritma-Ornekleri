package com.firstapp.nesnetabanligiris.arraylistodevler;

import com.firstapp.nesnetabanligiris.arraylistodevler.AdresOdev4;

public class PersonelOdev4 {

    private int personelNo;
    private String perIsim;

    private AdresOdev4 adres;

    public PersonelOdev4() {
    }

    public PersonelOdev4(int personelNo, String perIsim, AdresOdev4 adres) {
        this.personelNo = personelNo;
        this.perIsim = perIsim;
        this.adres = adres;
    }

    public int getPersonelNo() {
        return personelNo;
    }

    public void setPersonelNo(int personelNo) {
        this.personelNo = personelNo;
    }

    public String getPerIsim() {
        return perIsim;
    }

    public void setPerIsim(String perIsim) {
        this.perIsim = perIsim;
    }

    public AdresOdev4 getAdres() {
        return adres;
    }

    public void setAdres(AdresOdev4 adres) {
        this.adres = adres;
    }
}
