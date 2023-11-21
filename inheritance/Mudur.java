package com.firstapp.nesnetabanligiris.inheritance;

public class Mudur extends Personel{

    public void iseAl( Personel p){
        p.iseAlindi();
    }

    public void terfiEttir(Personel p ){

        if( p instanceof Ogretmen){ //eğer p Ogretmen türündense
            ((Ogretmen)p).maasArttir(); // p ile Ogretmen sınıfına eriştik.
        }

        if( p instanceof Isci){ //eğer p İşci türündense anlamına gelir.
            System.out.println("Isci terfi alamaz.");
        }
    }
}
