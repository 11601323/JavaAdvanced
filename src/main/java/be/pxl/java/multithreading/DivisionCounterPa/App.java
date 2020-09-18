package be.pxl.java.multithreading.DivisionCounterPa;

public class App {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();

//        DevisionCounter counter0 = new DevisionCounter(1, 60000);
//        DevisionCounter counter1 = new DevisionCounter(60001, 85000);
//        DevisionCounter counter2 = new DevisionCounter(85001, 100000);

        DevisionCounter2 counter0 = new DevisionCounter2(1, 50000);
        DevisionCounter2 counter1 = new DevisionCounter2(6001, 50000);
        DevisionCounter2 counter2 = new DevisionCounter2(8501, 50000);



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
