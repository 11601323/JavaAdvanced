package be.pxl.java.multithreading;

public class PrintApp {
    public static void main(String[] args) {
        PrintThread thread = new PrintThread('*', 100);
        PrintThread thread2 = new PrintThread('#', 100);
        thread.start();
        thread2.start();

    }
}
