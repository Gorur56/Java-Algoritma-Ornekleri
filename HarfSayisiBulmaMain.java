package com.firstapp.nesnetabanligiris;

import java.util.Scanner;

public class HarfSayisiBulmaMain {
    public static void main( String Args[]){
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Bir kelime giriniz: ");
        String kelime = tarayici.next();

        System.out.println("Aranacak Harfi giriniz: ");
        char harf = tarayici.next().charAt(0);

        OdevlerSinifi os = new OdevlerSinifi();
        os.harfSayisiniBul(kelime,harf);


    }
}
