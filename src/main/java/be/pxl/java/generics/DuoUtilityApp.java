package be.pxl.java.generics;

public class DuoUtilityApp {
    public static void main(String[] args) {
        Duo<String> d1 = new Duo<>("Hello", "World");
        Duo<String> d2 = new Duo<>("Goodbye", "Mars");
        DuoUtility.swapFirst(d1,d2);
        DuoUtility.printDuo(d1);
        DuoUtility.printDuo(d2);
    }
}
