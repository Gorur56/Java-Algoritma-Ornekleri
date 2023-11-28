package com.firstapp.nesnetabanligiris.ilerijava;

public class BankaThreadMain {
    public static void main(String[] args) {

        //Thread Senkronizasyonu
        //İki Thread aynı anda aynı veriye güvenli bir şekilde erişemez.
        //Threadlerin veriye sırayla erişimine  SYNCHRONIZED ile sağlanır.

        BankaThread b = new BankaThread(900);

        BankaIslemThread is1 = new BankaIslemThread(b, "Zeynep", 500);
        BankaIslemThread is2 = new BankaIslemThread(b, "Ahmet", 600);

        //Sonuç olarak her iki ihtimalde gelebilir. Aşağıdaki gibi runtime 'da
        //öncelik hangisine veriyorsa ilk önce o para çekebilir.

        // Ahmet: Hesapta kalan para 300 $
        //Zeynep: Hesapta para kalamdı!!!

        is1.start();
        is2.start();

    }

    static class BankaIslemThread extends Thread
    {
        private BankaThread b;
        private String isim;
        private int tutar;

        public BankaIslemThread( BankaThread b, String isim, int tutar)
        {
            this.b = b;
            this.isim = isim;
            this.tutar = tutar;
        }
        @Override
        public void run() {
            //işlemler gerçekte çok hızlı olmadığı için 100 ms gecikme vereceğiz.

            try {
                Thread.sleep(100); //Gecikme eklediğimizda saçmayalabilir. Aynı anda ikisine de işlem yaptırabilir.
                b.paraCek(isim,tutar);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
