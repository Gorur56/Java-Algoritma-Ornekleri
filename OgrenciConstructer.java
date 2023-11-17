package com.firstapp.nesnetabanligiris;

public class OgrenciConstructer {
    String isim;
    int okulNo;
    String adres;

    public OgrenciConstructer(){ // Constructer 'dır. Mainde new dediğimiz an burası çalışacaktır.

    }


    public OgrenciConstructer( String isim, int okulNo, String adres ){
        // iki Constructer olabilir. Biri boş biri dolu. overloading oluşur.
        // Böylelikle new 'le oluştururken nesne gönderebiliriz.
        //aşağıdaki this 'ler yukarıdaki global değişkenleri kullanmak için yazılır.

        this.isim = isim;
        this.okulNo = okulNo;
        this.adres = adres;

    }
}
