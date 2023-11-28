package com.firstapp.nesnetabanligiris.javaIOUygulama;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferIOMain {
    public static void main(String[] args) {

        //Karakter bazlı değil kelime bazlı satır satır okur.
        //Performansı iyidir.
        //Hafıza bilginin bir kısmını tutup bir kısmını yazar.

        //bufferYaz();
        bufferRead();

    }

    public static void bufferRead(){
        try {
            File dosya = new File("C:\\Users\\Sevim\\Desktop\\dosyabuffer.txt"); //dosya yolu oluştur

            FileReader fr = new FileReader(dosya); //dosya oku

            BufferedReader okuyucu = new BufferedReader(fr);

            StringBuilder sb = new StringBuilder();

            String satir = "";

            while ((satir = okuyucu.readLine()) != null){
                sb.append(satir + "\n");
            }

            okuyucu.close();

            System.out.println("okuyucu: \n"+ sb.toString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void bufferYaz()
    {

        try {
            File dosya = new File("C:\\Users\\Sevim\\Desktop\\dosyabuffer.txt"); //dosya.txt adında bir doaya oluşturuyoruz.

            if (!dosya.exists()) //Dosya var mı yok mu kontrolü yapar.
            {
                dosya.createNewFile(); //Dosyayı oluştur.
            }

            FileWriter fw = new FileWriter(dosya);
            BufferedWriter yazici = new BufferedWriter(fw);

            yazici.write("sdmkglkdfmblpdbmlhdmblkmblşskilfişlsfiösşişvkgşlvöşlssssssssssssssss");

            yazici.flush();
            yazici.close();

        }catch (Exception e)
        {

        }

    }
}
