package be.pxl.java.multithreading.opdracht1;

public class DivisionCounter implements Runnable {
    private int min;
    private int max;
    private int maxDivisors = 0;
    private int maxNumber = 0;


    public DivisionCounter(int min, int max) {
        this.min = min;
        this.max = max;
        run();
    }

    public int getMaxDivisors() {
        return maxDivisors;
    }

    public int getMaxNumber() {
        return maxNumber;
    }


    @Override
    public void run() {
        findNumberWithHighestofDivsors(min, max);
    }

    public void findNumberWithHighestofDivsors(int min, int max){
        int delers = 0;
        for (int number = min; number <= max; number++) {
            for (int deler = min; deler <= number; deler++) {
                if (number % deler == 0) {
                    System.out.println( number + "----" + deler);
                    delers++;
                }
            }
            if (delers > maxDivisors) {
                maxDivisors = delers;
                maxNumber = number;
                System.out.println("MaxDiv : " + maxDivisors + " number : " + number);

            }
            delers = 0;
        }
    }
}
