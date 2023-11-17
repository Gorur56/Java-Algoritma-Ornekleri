package com.firstapp.nesnetabanligiris;

public class MatematikMethodMain {
    public static void main( String Args[]){
        MatematikMethod m1 = new MatematikMethod();

        m1.carpma(15,12);


        int gelenDeger = m1.topla(50,15,45);

        System.out.println("Toplam: "+gelenDeger);

        int gelenCikarmaDegeri = m1.cikarma(80,25, "Yücel");

        System.out.println("Sonuç: "+ gelenCikarmaDegeri);
    }
}
