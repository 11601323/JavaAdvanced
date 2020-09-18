package be.pxl.java.multithreading.DivisionCounterPa;

public class DevisionCounter2 {
    private int min;
    private int max;
    private int maxDivisors;
    private int maxNumber;

    public DevisionCounter2(int min, int max) {
        this.min = min;
        this.max = max;
        calculate();
    }

    private void calculate() {
        for (int i = min; i <= max; i++) {
            int aantalDelers = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0) aantalDelers++;
            }
            if(aantalDelers > maxDivisors) {
                maxNumber = i;
                maxDivisors = aantalDelers;
            }
        }
    }

    public int getMaxDivisors() {
        return maxDivisors;
    }

    public void setMaxDivisors(int maxDivisors) {
        this.maxDivisors = maxDivisors;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

}
