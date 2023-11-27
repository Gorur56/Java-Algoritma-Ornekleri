package com.firstapp.nesnetabanligiris.ilerijava;

public class OgrenciThread {
    private int ogrNo;

    private String ogrIsim;

    public OgrenciThread() {
    }

    public OgrenciThread(int ogrNo, String ogrIsim) {
        this.ogrNo = ogrNo;
        this.ogrIsim = ogrIsim;
    }

    public int getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }

    public String getOgrIsim() {
        return ogrIsim;
    }

    public void setOgrIsim(String ogrIsim) {
        this.ogrIsim = ogrIsim;
    }

    public void bilgiAl( String isinAdi )
    {
        for (int i = 1; i < 101; i++)
        {
            System.out.println(isinAdi + " : " + i);
        }
    }
}
