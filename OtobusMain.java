package com.firstapp.nesnetabanligiris;

public class OtobusMain {
    public static void main( String Args[]){
        Otobus kamilKoc = new Otobus();

        kamilKoc.firmaAdi = "Kamil Koç";
        kamilKoc.kapasite = 60;
        kamilKoc.mevcutYolcu = 30;
        kamilKoc.nereden = "İstanbul";
        kamilKoc.nereye = "Adana";

        kamilKoc.bilgiAl();
        kamilKoc.yolcuAl(20);
        kamilKoc.yolcuIndir(57);
        kamilKoc.bilgiAl();

        /*System.out.println("Kamil Koç kapasite: "+ kamilKoc.kapasite);
        System.out.println("Kamil Koç Mevcut Yolcu: "+ kamilKoc.mevcutYolcu);
        System.out.println("Kamil Koç Nereden: "+kamilKoc.nereden);
        System.out.println("Kamil Koç Nereye: "+kamilKoc.nereye);*/

        Otobus nulifer = new Otobus();

        nulifer.firmaAdi = "Nülifer";
        nulifer.kapasite = 30;
        nulifer.mevcutYolcu = 10;
        nulifer.nereden = "Ankara";
        nulifer.nereye = "İzmir";

        nulifer.bilgiAl();
        nulifer.yolcuAl(30);
        nulifer.yolcuIndir(10);
        nulifer.bilgiAl();

        /*System.out.println("Nülifer kapasite: "+ nulifer.kapasite);
        System.out.println("Nülifer Mevcut Yolcu: "+ nulifer.mevcutYolcu);
        System.out.println("Nülifer Nereden: "+nulifer.nereden);
        System.out.println("Nülifer Nereye: "+nulifer.nereye);*/

    }
}
