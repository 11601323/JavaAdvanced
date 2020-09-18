package be.pxl.java.multithreading.Oefening1;

import be.pxl.java.multithreading.opdracht1.DivisionCounter;

public class DivisionCounter2 extends Thread{
    private int min;
    private int max;
    private int maxDivisors = 0;
    private int maxNumber = 0;


    public DivisionCounter2(int min, int max) throws InterruptedException {
        this.max = max;
        this.min = min;
        setMaxDivisor();
    }


    public void setMaxDivisor() throws InterruptedException {
//        Thread thread1 = new Thread(new DivisionCounter2(min,max));
//        thread1.start();
//        thread1.join();
        int aantal = 0;
        for (int number = min; number < max; number++) {
            for (int deler = min; deler <= number; deler++) {
                if (number % deler == 0) {
                    aantal++;
                }
            }
            if (aantal > this.maxDivisors) {
                this.maxDivisors = aantal;
                this.maxNumber = number;

            }
            aantal = 0;
        }
    }

    public int getMaxDivisors() {
        return maxDivisors;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setWaarde(int waarde){
        this.maxNumber = waarde;
    }
//    @Override
//    public void run() {
//        int aantal = 0;
//        for (int number = min; number < max; number++) {
//            for (int deler = min; deler <= number; deler++) {
//                if (number % deler == 0) {
//                    aantal++;
//                }
//            }
//            if (aantal > this.maxDivisors) {
//                this.maxDivisors = aantal;
//                this.maxNumber = number;
//
//            }
//            aantal = 0;
//        }
//    }
}
