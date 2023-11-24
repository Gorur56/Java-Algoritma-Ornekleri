package com.firstapp.nesnetabanligiris.collections;

import java.net.SecureCacheResponse;
import java.util.ArrayList;
import java.util.Scanner;

public class OkulKayitOrnekMain {
    public static void main( String args[])
    {
        Scanner scan = new Scanner(System.in);

        ArrayList<OgrenciArrayListOkulKayit> ogrenciler = new ArrayList<>(); //Döngüye koyarsak her döndüğünde boşalacaktır.

        while (true)
        {
            System.out.println("Öğrenci okul no giriniz: ");
            int okulNo = scan.nextInt();

            System.out.println("Öğrenci adını giriniz: ");
            String ogrIsim = scan.next();

            OgrenciArrayListOkulKayit yeniOgr = new OgrenciArrayListOkulKayit(okulNo,ogrIsim);

            ogrenciler.add(yeniOgr);

            System.out.println("Çıkış için (1) 'e basınız...");
            System.out.println("Devam etmek için herhangi bir rakama basınız.");
            int secim = scan.nextInt();

            if (secim == 1)
            {
                for (OgrenciArrayListOkulKayit ogr:ogrenciler)
                {
                    System.out.println("-----------------------------------------");
                    System.out.println("Öğrenci No: "+ ogr.getOkulNo());
                    System.out.println("Öğrenci Ad: "+ ogr.getOgrAd());
                }
                break;
            }
        }
    }
}
