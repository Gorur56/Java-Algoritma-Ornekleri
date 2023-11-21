package com.firstapp.nesnetabanligiris.inheritance;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class OgrenciEqualsAndToString {
    private int tcno;
    private String ogrAd;

    public OgrenciEqualsAndToString() {
    }

    public OgrenciEqualsAndToString(int tcno, String ogrAd) {
        this.tcno = tcno;
        this.ogrAd = ogrAd;
    }

    public int getTcno() {
        return tcno;
    }

    public void setTcno(int tcno) {
        this.tcno = tcno;
    }

    public String getOgrAd() {
        return ogrAd;
    }

    public void setOgrAd(String ogrAd) {
        this.ogrAd = ogrAd;
    }

    @Override
    public String toString() {
        return "TC: "+ tcno + "\nÖğrenci Adı: " + ogrAd;
    }

    @Override
    public boolean equals(Object obj) { //override ile direk objeleri kıyaslarken burada neye göre
        if(tcno == ((OgrenciEqualsAndToString)obj).getTcno())                 //kıyaslayacağını belirliyoruz. downcast yaptık
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
