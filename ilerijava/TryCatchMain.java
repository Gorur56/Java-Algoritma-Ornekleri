package com.firstapp.nesnetabanligiris.ilerijava;

public class TryCatchMain {
    public static void main( String Args[] ){

        //Bir hata oluşturuğun hata mesajı fırlatır.
        //Hatayı yönetmekle sorumlu koda "exception Handler" denir.
        //Run time (Çalışma zamanı)  'da gerçekleşen hatalardır.

        int x = 5;
        int y = 0;

        //Eğer try bloğu içerisinde birden fazla hata olursa

        int [] dizi = new int[2];

        //Try 'ya hata oluşturabilecek kodu yazıyoruz.
        //Try 'da hata oluşmazsa catch bloğuna hiç girmeyecek.

        try {
            System.out.println("Sonuç: "+(x/1));
            System.out.println("işlem tamamlandı.");
            dizi[8] = 8; //ikinci hata üretecek. Böylece iki bloğa girecektir.
        }
        /* catch (Exception e)
        {
            // Beklenen hatalarda hatayı printStackTrace ile göndermektense kendimiz bir mesaj gönderebiliriz.

            //e.printStackTrace();

            //Birden fazla hata geldiğin hataya göre koşullamak gerekiyor.

            if(e instanceof ArithmeticException)
            {
                System.out.println("Sayılar 0 'a bölünemez!!!"); //1. hata
            }

            if( e instanceof ArrayIndexOutOfBoundsException)
            {
                System.out.println("Dizinin boyutunu aştınız!!!");
            }
        }*/
        catch (ArrayIndexOutOfBoundsException e) //Ve ya koşul yazmak yerine catch 'leri çoğaltabiliriz.
        {
            System.out.println("Dizinin boyutunu aştınız!!!");
        }

        catch (ArithmeticException e)
        {
            System.out.println("Sayılar 0 'a bölünemez!!!"); //1. hata
        }
    }
}
