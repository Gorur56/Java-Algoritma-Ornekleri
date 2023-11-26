package com.firstapp.nesnetabanligiris.collections;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArraylistOdev3 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> tahminler = new ArrayList<>();

        Random random = new Random();

        int rastgeleSayi = random.nextInt(101);

        int i = 0;

        while (i<5)
        {
            i++;
            System.out.println(i+ ". tahmininizi giriniz: ");
            int tahmin = scan.nextInt();

            tahminler.add(tahmin);

            if( rastgeleSayi == tahmin)
            {
                System.out.println("Tebrikler kazandınız...");
                break;
            }
            else if ( i == 5 && rastgeleSayi != tahmin)
            {
                System.out.println("Tahmin hakkınız doldu.");
                System.out.println("Kaybettiniz :/");

                System.out.println("Tahmin edilmesi gereken değer: \n"+ rastgeleSayi);

            }
            else if (tahmin > rastgeleSayi) {
                System.out.println("Sayınısızı küçültünüz...");
            }
            else if( tahmin < rastgeleSayi)
            {
                System.out.println("Sayınısızı büyütünüz...");
            }
        }

        int n = 0;
        for (Integer t:tahminler)
        {
            n++;
            System.out.println(n + ". Tahmin: "+ t);
        }
    }
}
