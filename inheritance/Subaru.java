package com.firstapp.nesnetabanligiris.inheritance;

public class Subaru extends Araba{ // araba 'da arac 'tan miras aldığı için subaru arav-c 'ın da method 'larına erişebilir.
    private String motorHacmi;

    public Subaru(){
        super(); //Bu çalıştığında bir üst sınıfın boş constractor 'ı çalışacaktır.
        System.out.println("Subaru boş constractor çalıştı...");
    }

    public Subaru(String motorHacmi) {
        super();
        this.motorHacmi = motorHacmi;
        System.out.println("Subaru dolu constractor çalıştı...");
    }

    public String getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(String motorHacmi) {
        this.motorHacmi = motorHacmi;
    }
}
