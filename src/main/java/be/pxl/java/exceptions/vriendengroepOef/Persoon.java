package be.pxl.java.exceptions.vriendengroepOef;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persoon {
    private String name;
    private LocalDate geboorteDatum;

    public String getName() {
        return name;
    }

    public Persoon() {
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public Persoon(String name, int geboortedag, int geboortemaand, int geboortejaar) {
        this.name = name;
        this.geboorteDatum = LocalDate.of(geboortejaar,geboortemaand,geboortemaand);
    }

    @Override
    public boolean equals(Object obj) {
        Persoon per = (Persoon)obj;
        return per.name == this.name;
    }

    @Override
    public String toString() {
        return this.name + ": " + aantalDagenTotVerjaardag() + " dagen tot verjaardag";
    }

    public long aantalDagenTotVerjaardag(){
        LocalDate date = geboorteDatum.withYear(LocalDate.now().getYear());
        if(date.isBefore(LocalDate.now())){
            date = date.plusYears(1);
        }
        return ChronoUnit.DAYS.between(LocalDate.now(), date);
    }
}
