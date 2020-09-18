package be.pxl.java.multithreading.Oefening1;

public class DivisionCounter {
    private int min;
    private int max;
    private int maxDivisors = 0;
    private int maxNumber = 0;


    public DivisionCounter(int min, int max) {
        this.max = max;
        this.min = min;
        setMaxDivisor();
    }


    public void setMaxDivisor() {
        int aantal = 0;
        for (int number = min; number < max; number++) {
            for (int deler = min; deler <= number; deler++) {
                if (number % deler == 0) {
                    aantal++;
                }
            }
            if (aantal > maxDivisors) {
                maxDivisors = aantal;
                maxNumber = number;
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
}
