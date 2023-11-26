package com.firstapp.nesnetabanligiris.ilerijava;

public class IkinciThreadInterface implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("İkinci Thread: " + i);
        }
    }
}
