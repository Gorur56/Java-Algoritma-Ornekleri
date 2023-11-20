package com.firstapp.nesnetabanligiris.siniflar;

public class FilmlerComposition {
    private int film_id;
    private String film_ad;
    private int film_yil;

    KategorilerComposition kategori;
    YonetmenlerComposition yonetmen;

    public FilmlerComposition() {
    }

    public FilmlerComposition(int film_id, String film_ad, int film_yil, KategorilerComposition kategori, YonetmenlerComposition yonetmen) {
        this.film_id = film_id;
        this.film_ad = film_ad;
        this.film_yil = film_yil;
        this.kategori = kategori;
        this.yonetmen = yonetmen;
    }


    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getFilm_ad() {
        return film_ad;
    }

    public void setFilm_ad(String film_ad) {
        this.film_ad = film_ad;
    }

    public int getFilm_yil() {
        return film_yil;
    }

    public void setFilm_yil(int film_yil) {
        this.film_yil = film_yil;
    }

    public KategorilerComposition getKategori() {
        return kategori;
    }

    public void setKategori(KategorilerComposition kategori) {
        this.kategori = kategori;
    }

    public YonetmenlerComposition getYonetmen() {
        return yonetmen;
    }

    public void setYonetmen(YonetmenlerComposition yonetmen) {
        this.yonetmen = yonetmen;
    }
}
