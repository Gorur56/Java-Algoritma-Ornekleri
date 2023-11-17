package com.firstapp.nesnetabanligiris;

public class OdevlerSinifi {

    public void sicaklikDonustur( double sicaklik ){
        double f = ( sicaklik * 1.8 ) + 32;
        System.out.println("Fehrenhiet: "+ f);
    }

    public void  cevreHesabi( int uzunKenar, int kisaKenar ){
        int c = (uzunKenar + kisaKenar ) * 2;
        System.out.println("Dikdörtgenin Çevresi: "+ c);
    }

    public void  faktoriyelHesabi( int n ){
        long f = 1;

        if( n == 0)
        {
            f = 1;
        }
        else {
            for (int i = 1; i <= n ; i++)
            {
                f = f * i;
            }
        }

        System.out.println(n + "'nin Faktöriyeli:" + f );
    }



    public void harfSayisiniBul( String kelime, char harf ) {
        int boyut = kelime.length();

        char [] harfler = new char[boyut];

        for (int i = 0; i < boyut; i++)
        {
            harfler[i] = kelime.charAt(i);
        }

        int sayac = 0;

        for (int k = 0; k < boyut ; k++)
        {
            if (harfler[k] == harf)
            {
                sayac++;
            }
        }

        System.out.println("Harf Sayısı: "+ sayac);

    }

    public int icAciToplami( int kenarSayisi)
    {
        int sonuc = (kenarSayisi-2) * 180;

        return sonuc;
    }

    public int mesaiHesabi(int gun ){
        int calistiSaat = gun * 8;
        int mesai = calistiSaat - 160;

        if ( mesai > 0 )
        {
            return 1750 + ( mesai * 10 );
        }
        else{
            return 1750;
        }
    }

    public int internetUcretiHesap( int kota )
    {
        int fazlaKota = kota - 50;

        if ( fazlaKota > 0 )
        {
            return 100 + ( fazlaKota * 4 );
        }
        else
        {
            return 100;
        }
    }
}
