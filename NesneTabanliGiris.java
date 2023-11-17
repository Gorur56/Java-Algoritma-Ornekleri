package com.firstapp.nesnetabanligiris;

public class NesneTabanliGiris {
    public static void main(String Args[]) {
        //Normal değişken oluşturma
        int a = 25;

        //Nesne tabanlı obje oluşturma
        Car bmw = new Car(); // car sınıfından boş bir nesne oluşturduk.

        bmw.renk = "red";
        bmw.hiz = 180;
        bmw.calisiyormu = true;
        bmw.uzunluk = 1.80;

        Car tofas = new Car();

        tofas.renk = "Mavi";
        tofas.hiz = 150;
        tofas.calisiyormu = false;
        tofas.uzunluk = 1.60;


        System.out.println("BMW");
        System.out.println("bmw renk:"+ bmw.renk);
        System.out.println("bmw hız:"+ bmw.hiz);
        System.out.println("bmw çalışıyor mu:"+ bmw.calisiyormu);
        System.out.println("bmw uzunluk:"+ bmw.uzunluk);

        System.out.println("TOFAŞ");
        System.out.println("tofas renk:"+ tofas.renk);
        System.out.println("tofas hız:"+ tofas.hiz);
        System.out.println("tofas çalışıyor mu:"+ tofas.calisiyormu);
        System.out.println("tofas uzunluk:"+ tofas.uzunluk);

        tofas.calistir(); //yazdığımız fonksiyonlarla çalışma durumlarını değiştiriyoruz.
        bmw.durdur();
        tofas.hizlan(100);
        bmw.hizlan(100);

        System.out.println("BMW");
        System.out.println("bmw renk:"+ bmw.renk);
        System.out.println("bmw hız:"+ bmw.hiz);
        System.out.println("bmw çalışıyor mu:"+ bmw.calisiyormu);
        System.out.println("bmw uzunluk:"+ bmw.uzunluk);

        System.out.println("TOFAŞ");
        System.out.println("tofas renk:"+ tofas.renk);
        System.out.println("tofas hız:"+ tofas.hiz);
        System.out.println("tofas çalışıyor mu:"+ tofas.calisiyormu);
        System.out.println("tofas uzunluk:"+ tofas.uzunluk);

        bmw.yavasla(50);
        tofas.yavasla(50);


        System.out.println("BMW");
        System.out.println("bmw renk:"+ bmw.renk);
        System.out.println("bmw hız:"+ bmw.hiz);
        System.out.println("bmw çalışıyor mu:"+ bmw.calisiyormu);
        System.out.println("bmw uzunluk:"+ bmw.uzunluk);

        System.out.println("TOFAŞ");
        System.out.println("tofas renk:"+ tofas.renk);
        System.out.println("tofas hız:"+ tofas.hiz);
        System.out.println("tofas çalışıyor mu:"+ tofas.calisiyormu);
        System.out.println("tofas uzunluk:"+ tofas.uzunluk);





    }
}
