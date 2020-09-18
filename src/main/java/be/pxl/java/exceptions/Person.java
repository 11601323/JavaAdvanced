package be.pxl.java.exceptions;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
    private String naam;
    private LocalDate geboorteDatum;

    public Person(String name, int dag, int maand, int geboortejaar) {
        this.naam = name;


    }

    public String getNaam() {
        return naam;
    }

    public void setName(String name) {
        this.naam = name;
    }

    public long aantalDagenTotVerjaardag(){
        long dagen = ChronoUnit.DAYS.between(LocalDate.now(), geboorteDatum);
        return dagen;
    }

    @Override
    public String toString() {

        return this.naam + ": " + aantalDagenTotVerjaardag() + "dagen tot verjaardag";
    }

    @Override
    public boolean equals(Object obj) {
        if(((Person) obj).naam == this.naam){
            return true;

        }
        else {
            return false;
        }

    }


}
