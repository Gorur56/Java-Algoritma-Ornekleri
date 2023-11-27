package com.firstapp.nesnetabanligiris.ilerijava;

public class OgrenciThreadNesneMain {
    public static void main(String[] args) {

        OgrenciThread ogrenci = new OgrenciThread(123, "Kemal");

        BenimThread benim = new BenimThread("İlk İş", ogrenci);

        benim.start();

        BenimThread benim1 = new BenimThread("İkinci İş", ogrenci);

        benim1.start(); //Kendi algotirmasına göre iki thread 'ide çalıştıracaktır.

    }

    static class BenimThread extends Thread
    {
        private String isinAdi;
        private OgrenciThread ogr;

        public BenimThread() {
        }

        public BenimThread(String isinAdi, OgrenciThread ogr) {
            this.isinAdi = isinAdi;
            this.ogr = ogr;
        }

        @Override
        public void run() {
            for (int i = 0; i < 101; i++)
            {
                ogr.bilgiAl(isinAdi);
            }
        }
    }


}
