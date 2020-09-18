package be.pxl.java.multithreading.Oefening1;

public class DivisorApp2 {
    public static void main(String[] args) throws InterruptedException {
        long before = System.currentTimeMillis();

        DivisionCounter2 f = new DivisionCounter2(1, 50000);
        Thread thread1 = new Thread(() -> {
            try {
                f.setMaxDivisor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        DivisionCounter f2 = new DivisionCounter(1, 50000);
        Thread thread2 = new Thread(f2::setMaxDivisor);

        thread1.start();
        thread2.start();
//        thread1.join();
//        thread2.join();
        System.out.println("Getal: " + f.getMaxNumber());
        System.out.println("Aantal delers: " + f.getMaxDivisors());

        long after = System.currentTimeMillis();

        double seconds = (after - before) / 1000.0;
        System.out.printf("Berekening duurde %.3f seconden", seconds);
    }
}
