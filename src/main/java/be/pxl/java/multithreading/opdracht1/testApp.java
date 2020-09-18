package be.pxl.java.multithreading.opdracht1;

public class testApp {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();

        DivisionCounter f = new DivisionCounter(1, 10000);
        System.out.println("Getal: " + f.getMaxNumber());
        System.out.println("Aantal delers: " + f.getMaxDivisors());

        long after = System.currentTimeMillis();

        double seconds = (after - before) / 1000.0;
        System.out.printf("Berekening duurde %.3f seconden", seconds);
    }
}
