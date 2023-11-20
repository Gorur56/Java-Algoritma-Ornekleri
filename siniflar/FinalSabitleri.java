package com.firstapp.nesnetabanligiris.siniflar;

public class FinalSabitleri {

    //Başına final anahtarını koyduğumuzda bu değeri sonra değiştiremeyiz.
    public static final int white  = 1111;
    public static final int black = 0000;

    public static final int red = 3333;

    public void boya( int renk )
    {
        if ( renk == 1111 )
        {
            System.out.println("White");
        }
        else if (renk == 0000)
        {
            System.out.println("Black");
        }
        else if ( renk == 3333 )
        {
            System.out.println("Red");
        }
    }
}
