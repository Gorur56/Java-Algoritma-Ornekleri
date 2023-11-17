package com.firstapp.nesnetabanligiris;

public class Car {
        String renk;
        int hiz;
        double uzunluk;
        boolean calisiyormu;


        public void calistir(){

                calisiyormu = true;
        }

        public void durdur(){
                calisiyormu = false;
        }

        public void hizlan(int miktar ){
                hiz = hiz + miktar;
        }

        public  void yavasla(int miktar){
                hiz = hiz - miktar;
        }
}
