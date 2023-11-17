package com.firstapp.nesnetabanligiris;

import java.util.Scanner;

public class MesaiHesabiMain {
    public static void main( String Args[]){
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Çalıştığın gün sayısını giriniz: ");
        int gun = tarayici.nextInt();

        OdevlerSinifi os = new OdevlerSinifi();

        int maas = os.mesaiHesabi(gun);

        System.out.println("Maaş: "+ maas);

    }
}
