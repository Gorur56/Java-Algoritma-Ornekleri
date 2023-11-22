package com.firstapp.nesnetabanligiris.stringandstringbuilder;

public class StringMethodlarMain {
    public static void main( String args[]){

        String s1 = "Merhaba Ali";

        System.out.println(s1.charAt(8)); //String ler dizidir. 2.ci index 'i yazdırır. Boşluklarıda sayar.

        System.out.println(s1.length()); //Uzunluğunu yazdırır.

        System.out.println(s1.replace('a','ö')); //a 'ların yerine ö koyar.

        System.out.println(s1.substring(3,7)); //3.cü index 'ten 7.ci index 'e kadar yazdırır.

        System.out.println(s1.toLowerCase()); // Hepsini küçük harfe çevirir.

        System.out.println(s1.toUpperCase()); //Hepsini büyük harfe çevirir.

        System.out.println(s1.trim()); // başındaki ve sonundaki boşlukları siler.

        String dizi [] = s1.split(" ");



        for (String s:dizi)
        {
            System.out.println(s); // Metni boşluğa göre parçalar.
        }
    }
}
