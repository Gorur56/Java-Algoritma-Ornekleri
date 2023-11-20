package com.firstapp.nesnetabanligiris.siniflar;

public class YonetmenlerComposition {
    private int yonetmen_id;
    private  String yonetmen_ad;

    public YonetmenlerComposition() {
    }

    public YonetmenlerComposition(int yonetmen_id, String yonetmen_ad) {
        this.yonetmen_id = yonetmen_id;
        this.yonetmen_ad = yonetmen_ad;
    }

    public int getYonetmen_id() {
        return yonetmen_id;
    }

    public void setYonetmen_id(int yonetmen_id) {
        this.yonetmen_id = yonetmen_id;
    }

    public String getYonetmen_ad() {
        return yonetmen_ad;
    }

    public void setYonetmen_ad(String yonetmen_ad) {
        this.yonetmen_ad = yonetmen_ad;
    }
}
