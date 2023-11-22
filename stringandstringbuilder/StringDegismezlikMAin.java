package com.firstapp.nesnetabanligiris.stringandstringbuilder;

public class StringDegismezlikMAin {
    public static void main( String args[]){

        String s1 = "Merhaba Dünya";

        String s2 = s1; // Adresleri aynı oldu.

        String s3 = "Merhaba Dünya"; // Eğer içerik aynıysa aynı alanı işaret ederler.

        String s4 = "Merhaba ";
        String s5 = s4 + "Dünya"; // içerik aynı olsada birleştirme işlemi yapıldığı için artık başka yeri işaret eder.

        String s6 = new String("Merbaha Dünya"); //Buradada içerik aynı olsa da yeni bir nesne oluşturduğu için hafıza farklı bir yer tutar.

        if (s1 == s2 && s1 == s3 && s1 == s5 && s1 == s6) //Adreslerle kıyasladığı için ilk iki koşul sağlanacak.
        {                                                 // 3.cü ve 4.cü false dönecek.
            System.out.println("Eşit...");
        }
        else
        {
            System.out.println("Eşit değil.");
        }

        String s7 = "merhaba";
        String s8 = "MERHABA"; //Java küçük büyük harfleri ayırdığı için false döner.

        if (s7.equals(s8)) //Burada stringleri karşılaştırır.
        {
            System.out.println("true");
        }
        else if (s7.equalsIgnoreCase(s8)) //
        {
            System.out.println("Büyük küçük harf yok sayıp karşılaştırdı.");
        }

        //String 'leri birleştirmek istersek String Builder sınıfını kullanmamız gerekiyor.

        StringBuilder stringToplayici = new StringBuilder();

        stringToplayici.append("Merhaba ");
        stringToplayici.append("Dünya");

        System.out.println(stringToplayici); //append ile birleştirdir.

    }
}
