package be.pxl.java.InnerClasses;

public class MuscianApp {
    public static void main(String[] args) {
        Musician mus = new Musician();
        mus.play();

        Musician.Instrument instrument = mus.new Instrument();
        instrument.makeSound();

    }
}
