package com.firstapp.nesnetabanligiris.inheritanceMain;

import com.firstapp.nesnetabanligiris.inheritance.Araba;
import com.firstapp.nesnetabanligiris.inheritance.Arac;
import com.firstapp.nesnetabanligiris.inheritance.Subaru;

public class KalitimMain {
    public static void main( String Args[])
    {
        Araba araba = new Araba();

        araba.setKasaTipi("Sedan");
        araba.setRenk("Kırmızı");
        araba.setVitesTipi("Otomatik");

        System.out.println("Kasa Tipi    : "+ araba.getKasaTipi());
        System.out.println("Renk         : "+ araba.getRenk());
        System.out.println("Vites Tipi   : "+ araba.getVitesTipi());

        //Üst sınıf alt sınıfa erişemez. Bu nedenle araba motor hacmine erişemeiyor.

        Subaru subaru = new Subaru();

        subaru.setMotorHacmi("1.6");
        subaru.setRenk("Gri");
        subaru.setKasaTipi("Sedan");
        subaru.setVitesTipi("Manuel");

        System.out.println("\nKasa Tipi    : "+ subaru.getKasaTipi());
        System.out.println("Renk         : "+ subaru.getRenk());
        System.out.println("Vites Tipi   : "+ subaru.getVitesTipi());
        System.out.println("Motor Hacmi  : "+ subaru.getMotorHacmi());


        araba.bilgiAl();

        System.out.println("Dolu constractor çalıştır....\n");
        Subaru subaru1 = new Subaru("2.4");

        System.out.println("Dolu constractor çalıştır....\n");
        Araba araba1 = new Araba("Sedan");

        System.out.println("Dolu constractor çalıştır....\n");
        Arac arac1 = new Arac("Mavi", "Otomatik");


        //Kalıtım constractor ilişkisi super() ile bir üst sınıfın constractor 'a ulaşır.



    }
}
