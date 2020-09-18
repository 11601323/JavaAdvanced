package be.pxl.java.multithreading.Oefening1;


public class DivisorApp {
    public static void main(String[] args) throws InterruptedException {
        long before = System.currentTimeMillis();

        DivisionCounter f = new DivisionCounter(1, 50000);
        System.out.println("Getal: " + f.getMaxNumber());
        System.out.println("Aantal delers: " + f.getMaxDivisors());

        DivisionCounter f2 = new DivisionCounter(1, 50000);
        System.out.println("Getal: " + f.getMaxNumber());
        System.out.println("Aantal delers: " + f.getMaxDivisors());

        long after = System.currentTimeMillis();

        double seconds = (after - before) / 1000.0;
        System.out.printf("Berekening duurde %.3f seconden", seconds);

    }
}
