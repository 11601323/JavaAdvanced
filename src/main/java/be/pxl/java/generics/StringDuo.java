package be.pxl.java.generics;

public class StringDuo extends Duo<String> {
    //Een niet generieke subklasse van een generieke klasse
    public StringDuo(String first, String second) {
        super(first, second);
    }
}
