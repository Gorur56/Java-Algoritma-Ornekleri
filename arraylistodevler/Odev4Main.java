package com.firstapp.nesnetabanligiris.arraylistodevler;

import java.util.ArrayList;
import java.util.Scanner;

public class Odev4Main {
    public static void main( String args[])
    {

        Scanner scan = new Scanner(System.in);

        ArrayList<PersonelOdev4> personeller = new ArrayList<>();

        for (int i = 1; i <= 5; i++)
        {
            System.out.println(i+". Personel No giriniz:");
            int perNo = scan.nextInt();

            System.out.println(i+".Personel ismini giriniz: ");
            String perIsim = scan.next();

            System.out.println(i+". Personel adres il giriniz: ");
            String perIl = scan.next();

            System.out.println(i+". Personel adres ilçe giriniz: \n");
            String perIlce = scan.next();


            AdresOdev4 adres = new AdresOdev4(perIl, perIlce);

            PersonelOdev4 personel = new PersonelOdev4(perNo,perIsim,adres);

            personeller.add(personel);
        }

        int j = 1;

        for (PersonelOdev4 p:personeller)
        {
            j++;

            System.out.println(j+". Personel No: "+ p.getPersonelNo());
            System.out.println(j+". Personel İsim: "+ p.getPerIsim());
            System.out.println(j+". Personel İl: "+ p.getAdres().getPerIl());
            System.out.println(j+". Personel İlçe: "+ p.getAdres().getPerIlce()+"\n");
        }

    }
}
