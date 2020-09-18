package be.pxl.java.multithreading;

public class CounterAppLambda {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread1 = new Thread(() -> increment(counter, 10000));
        Thread thread2 = new Thread(() -> increment(counter, 10000));
        Thread thread3 = new Thread(() -> decrement(counter, 500));
        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(counter.getCount());
    }

    private static void decrement(Counter counter, int number) {
        for (int i = 0; i < number; i++){
            counter.decrement();
        }
    }

    private static void increment(Counter counter, int number) {
        for (int i = 0; i < number; i++){
            counter.increment();
        }
    }
}
