package com.firstapp.nesnetabanligiris.mainmethodlar;

import com.firstapp.nesnetabanligiris.siniflar.FilmlerComposition;
import com.firstapp.nesnetabanligiris.siniflar.KategorilerComposition;
import com.firstapp.nesnetabanligiris.siniflar.YonetmenlerComposition;

public class FilmCompositionMAin {
    public static void main(String Args[])
    {
        KategorilerComposition kategori1 = new KategorilerComposition(1, "Drama");
        KategorilerComposition kategori2 = new KategorilerComposition(2, "Komedi");
        KategorilerComposition kategori3 = new KategorilerComposition(3, "Bilim Kurgu");

        YonetmenlerComposition yonetmen1 = new YonetmenlerComposition(1, "Nuri Bilge Ceylan");
        YonetmenlerComposition yonetmen2 = new YonetmenlerComposition(1, "Quetin Tarantino");
        YonetmenlerComposition yonetmen3 = new YonetmenlerComposition(1, "Chrisropher Nolan");

        FilmlerComposition film1 = new FilmlerComposition(1, "Django", 2013,kategori1, yonetmen2);
        FilmlerComposition film2 = new FilmlerComposition(2, "Inception", 2006,kategori3, yonetmen3);

        System.out.println("Film Id: "+ film1.getFilm_id());
        System.out.println("Film Ad: "+ film1.getFilm_ad());
        System.out.println("Film Kategori: "+ film1.getKategori().getKategori_ad());
        System.out.println("Film Yönetmen: "+ film1.getYonetmen().getYonetmen_ad());

        System.out.println("\nFilm Id: "+ film2.getFilm_id());
        System.out.println("Film Ad: "+ film2.getFilm_ad());
        System.out.println("Film Kategori: "+ film2.getKategori().getKategori_ad());
        System.out.println("Film Yönetmen: "+ film2.getYonetmen().getYonetmen_ad());


    }
}
