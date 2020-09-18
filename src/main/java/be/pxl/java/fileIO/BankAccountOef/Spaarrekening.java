package be.pxl.java.fileIO.BankAccountOef;

import java.io.Serializable;

public class Spaarrekening implements Serializable {
    private double saldo;
    private String naam;
    private String nummer;

    public double getSaldo() {
        return saldo;
    }

    public String getNaam() {
        return naam;
    }

    public String getNummer() {
        return nummer;
    }

    public Spaarrekening(double saldo, String naam, String nummer) {
        this.saldo = saldo;
        this.naam = naam;
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return "Naam: " + naam + " - Saldo: " + saldo + " - Nummer: " + nummer;
    }
}
