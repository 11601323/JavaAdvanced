package be.pxl.java.multithreading.DivisionCounterPa;

public class DevisorApp {
    public static void main(String[] args) throws InterruptedException {
        long before = System.currentTimeMillis();

//        DevisionCounter counter0 = new DevisionCounter(1, 60000);
//        DevisionCounter counter1 = new DevisionCounter(60001, 85000);
//        DevisionCounter counter2 = new DevisionCounter(85001, 100000);

        DevisionCounter counter0 = new DevisionCounter(1, 50000);
        DevisionCounter counter1 = new DevisionCounter(6001, 50000);
        DevisionCounter counter2 = new DevisionCounter(8501, 50000);

        Thread thread0 = new Thread(counter0);
        Thread thread1 = new Thread(counter1);
        Thread thread2 = new Thread(counter2);

        thread0.start();
        thread1.start();
        thread2.start();

        thread0.join();
        thread1.join();
        thread2.join();

        int maxDevisor = 0;
        int maxNumber = 0;

        if(counter0.getMaxDivisors() > counter1.getMaxDivisors() && counter0.getMaxDivisors() > counter2.getMaxDivisors()) {
            maxDevisor = counter0.getMaxDivisors();
            maxNumber = counter0.getMaxNumber();

        } else if (counter1.getMaxDivisors() > counter0.getMaxDivisors() && counter1.getMaxDivisors() > counter2.getMaxDivisors()) {
            maxDevisor = counter1.getMaxDivisors();
            maxNumber = counter1.getMaxNumber();

        } else {
            maxDevisor = counter2.getMaxDivisors();
            maxNumber = counter2.getMaxNumber();
        }

        System.out.println("Getal: " + maxNumber);
        System.out.println("Devisors: " + maxDevisor);


        long after = System.currentTimeMillis();

        double seconds = (after - before) / 1000.0;
        System.out.println("aantal seconden " + seconds);
    }
}
