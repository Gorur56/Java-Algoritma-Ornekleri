package com.firstapp.nesnetabanligiris.inheritance;

public class Subaru extends Araba{ // araba 'da arac 'tan miras aldığı için subaru arav-c 'ın da method 'larına erişebilir.
    private String motorHacmi;

    public Subaru(){

    }

    public Subaru(String motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public String getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(String motorHacmi) {
        this.motorHacmi = motorHacmi;
    }
}
