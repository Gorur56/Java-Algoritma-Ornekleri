package com.firstapp.nesnetabanligiris.javaIOUygulama;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class JavaIOMainFileReaderAndFilewriter {
    public static void main(String[] args) throws IOException {
        //fileReadOku();
        //filewriteYaz();
        //OutputStreamYaz();
         inputStreamReader();
    }

    public static void OutputStreamYaz()
    {
        try
        {
            File dosya = new File("C:\\Users\\Sevim\\Desktop\\dosyaStream.txt"); //dosya.txt adında bir doaya oluşturuyoruz.

            if (!dosya.exists()) //Dosya var mı yok mu kontrolü yapar.
            {
                dosya.createNewFile(); //Dosyayı oluştur.
            }

            FileOutputStream fos = new FileOutputStream(dosya); //YAzdıracağımız dosyayı seçiyoruz.

            OutputStreamWriter yazici = new OutputStreamWriter(fos, "utf-8");

            yazici.write("Merhaba fos"); //Yazdıracağımız text

            yazici.flush(); //Son anda bir hata oluşursa tüm değeri gönderir.
            yazici.close();

        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }

    public static void inputStreamReader() throws IOException {
        File dosya = new File("C:\\Users\\Sevim\\Desktop\\dosyaStream.txt");
        InputStreamReader okuyucu;
        try {
            FileInputStream fis = new FileInputStream(dosya);
            okuyucu = new InputStreamReader(fis);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //Dosyayı harf harf okuyacaktır. Bu yüzden string ^leri toplama özelliği olan
        // StringBuilder fonksiyonunu kullanacağız.

        StringBuilder sp = new StringBuilder();

        int bilgi = 0; //ASCII karakter ile aldığı için önce integer alır sonra karaktere dönüştürür.

        //okuyucu dosyayısını oku -1 'e gelene yani boşluk görene kadar tek tek bilgiye ata.
        while (true) {
            try {
                if (!((bilgi = okuyucu.read()) != -1)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            sp.append((char) bilgi); //Sonra bilgiyi char 'a dönüştürüp sp 'ye ata.
        }

        System.out.println("Okunan: " + sp.toString());

    }

    public static void filewriteYaz() throws IOException {
        //3 çeşit okuma yazdırma fonksiyonları vardır. Bu en eskisidir.
        // Performansı kötürdür.
        //dosya.txt adında masa üstünde bir dosyamız olmadığı için gidip dosyayı oluşturdu.
        //Sonra dosyanın içene Merhaba yazdırdı.

        try
        {
            File dosya = new File("C:\\Users\\Sevim\\Desktop\\dosya.txt"); //dosya.txt adında bir doaya oluşturuyoruz.

            if (!dosya.exists()) //Dosya var mı yok mu kontrolü yapar.
            {
                dosya.createNewFile(); //Dosyayı oluştur.
            }

            FileWriter yazici = new FileWriter(dosya); //YAzdıracağımız dosyayı seçiyoruz.

            yazici.write("Merhaba"); //Yazdıracağımız text

            yazici.flush(); //Son anda bir hata oluşursa tüm değeri gönderir.
            yazici.close();

        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }

    public static void fileReadOku() throws IOException {

        File dosya = new File("C:\\Users\\Sevim\\Desktop\\dosya.txt");

        FileReader okuyucu = null;
        try {
            okuyucu = new FileReader(dosya);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //Dosyayı harf harf okuyacaktır. Bu yüzden string ^leri toplama özelliği olan
        // StringBuilder fonksiyonunu kullanacağız.

        StringBuilder sp = new StringBuilder();

        int bilgi = 0; //ASCII karakter ile aldığı için önce integer alır sonra karaktere dönüştürür.

        //okuyucu dosyayısını oku -1 'e gelene yani boşluk görene kadar tek tek bilgiye ata.
        while (-1 != (bilgi = okuyucu.read()))
        {
            sp.append((char)bilgi); //Sonra bilgiyi char 'a dönüştürüp sp 'ye ata.
        }

        System.out.println("Okunan: "+ sp.toString());

    }
}
