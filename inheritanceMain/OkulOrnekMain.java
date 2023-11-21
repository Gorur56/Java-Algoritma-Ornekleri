package com.firstapp.nesnetabanligiris.inheritanceMain;

import com.firstapp.nesnetabanligiris.inheritance.Isci;
import com.firstapp.nesnetabanligiris.inheritance.Mudur;
import com.firstapp.nesnetabanligiris.inheritance.Ogretmen;
import com.firstapp.nesnetabanligiris.inheritance.Personel;

public class OkulOrnekMain {
    public static void main( String Args[])
    {
        //işse alımı müfür yapıyor. Müdür 'den bir obje oluştur.

        Mudur mudur = new Mudur();

        //Polimorphism

        Personel ogretmen = new Ogretmen(); //Alt Ogretmen sınıfı Üst Perdonel sınıfını yerine geçti.
        Personel isci = new Isci();         //Alt Isci sınıfı Üst Perdonel sınıfını yerine geçti.

        //aşağıda personel türünde bir obje istiyor.

        mudur.iseAl(ogretmen); //mudur içindeki methodu çağıracak. O da Personel içindeki method 'a erişecektir.
        mudur.iseAl(isci);     //Buna polymorphisz 'den yararlanmak denir.

        mudur.terfiEttir(ogretmen); //Mudur üzerinde Personel sınıfına Personel sınıfından da Ogretmen sınıfına erişiyoruz.

        mudur.terfiEttir(isci); //isci ve ogretmen arasında bir ilişki yoktur. Bu nedenle casting hatası verecektir.
                                //Yani işci öğrenmene dönüşemez.
                                // Ama koşul koyarsak bu hatayı almayız. Yani bir hata mesajı yollayabiliriz.
    }
}
