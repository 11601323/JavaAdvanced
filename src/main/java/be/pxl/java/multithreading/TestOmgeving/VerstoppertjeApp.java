package be.pxl.java.multithreading.TestOmgeving;

public class VerstoppertjeApp {
    public static void main(String[] args) throws InterruptedException {
        Verstoppertje verstoppertje = new Verstoppertje();
        verstoppertje.startTellen();

        verstoppertje.Vindpersoon(); // in de klasse staat een join zodat de main thread moet volgen na de eerste thread
    }
}
