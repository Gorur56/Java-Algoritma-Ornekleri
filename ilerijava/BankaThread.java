package com.firstapp.nesnetabanligiris.ilerijava;

public class BankaThread {
    private int bakiye;

    public BankaThread() {
    }

    public BankaThread(int bakiye) {
        this.bakiye = bakiye;
    }

    public synchronized void paraCek( String isim, int tutar)
    {
        //sleep methodu eklediğimizde saçmalamaması için synchronized methodu ekliyoruz.
        //Artık biri bir işlem yaparken diğerini kuyruğa sokup duruyor.

        if(tutar > bakiye)
        {
            System.out.println(isim + ": Hesapta para kalamdı!!!");
        }
        else
        {
            bakiye = bakiye - tutar;
            System.out.println(isim + ": Hesapta kalan para "+ bakiye + " $");
        }
    }
}
