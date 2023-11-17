package com.firstapp.nesnetabanligiris;

public class ReferansTipiAtamaMain {
    public static void main( String Args[]){
        int a = 40;
        int b = a; //Burada kopyalama işlemi yapılıyor.

        //Referans Atama

        OgrenciConstructer ogrenci1 = new OgrenciConstructer();

        ogrenci1.isim = "Zeynep";

        System.out.println(ogrenci1.isim);

        OgrenciConstructer ogrenci2 = ogrenci1; // Burada kopyalama değil referans atama işlemi yapıldı
                                                // Yani ogrenci1 yetkilerini ogrenci2 'ye atadı.

        ogrenci2.isim = "Ayşe"; //yukarıdak, ogrenci1 'i değiştirmiş oluyoruz.

        System.out.println(ogrenci1.isim); // Referansla değiştirmiş olduk.

        System.out.println(ogrenci1.hashCode()); // Hafızadaki adresinin yeri
        System.out.println(ogrenci2.hashCode());

    }
}
