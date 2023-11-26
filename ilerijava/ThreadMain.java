package com.firstapp.nesnetabanligiris.ilerijava;

public class ThreadMain {
    public static void main(String[] args) { // main sınıfıda aslında bir thread 'dir.

        // Tek bir program akışı içeriisnde birden fazla işlemin gerçekleştirilmesi Thread ile olur.
        //Thread.Sleep(int miliseconds) ile durdurubiliriz.
        // Static bir method 'dur her yerden çağırılabilir.
        //Yalnızca içinde bulunduğu Thread 'i etkiler.

        BirinciThread birinciThread = new BirinciThread();

        birinciThread.start(); //run() fonksiyonunu çalıştırır.

        Thread bt2 = new Thread(new IkinciThreadInterface());

        bt2.start(); //Aynı anda birden fazla iş yapılmış oluyor.

        //Sonuç 3 for döngünün karışımıdır. Runtime da hangisini öncelik olrak görüyorsa.

        //İki for döngüsünü çalışma zamanında öncelik vererek çalıştırmış.
        //Sonuç her iki döngünün karışımı şeklinde gelir.

        for (int i = 1; i <= 100; i++) {
            System.out.println("Main: " + i);
        }

    }

    //Sınıf içinde sınıf oluşturuyoruz. İlk sınıf static olduğu için bu da statik olmalıdır.

    static class BirinciThread extends Thread{
        @Override
        public void run(){
            for(int j = 1; j <= 100; j++)
            {
                System.out.println("Birinci Thread: "+ j);
            }
        }
    }

}
