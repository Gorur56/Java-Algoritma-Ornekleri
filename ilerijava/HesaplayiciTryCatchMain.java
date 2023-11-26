package com.firstapp.nesnetabanligiris.ilerijava;

public class HesaplayiciTryCatchMain {
    public static void main( String Args[])
    {
        HesaplayiciTryCatch hesap = new HesaplayiciTryCatch();

        try {
            hesap.bol(5,0); //Surround with try/catch seçince otomatik kendini bir try cath bloğuna alıyor.
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
