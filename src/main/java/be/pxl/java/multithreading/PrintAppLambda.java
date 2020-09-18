package be.pxl.java.multithreading;

public class PrintAppLambda {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> print('*', 100));
        Thread thread2 = new Thread(() -> print('#', 100));

        System.out.println("Available processors: " + Runtime.getRuntime().availableProcessors());
        //state afprinten van een thread
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
        thread1.start();
        System.out.println(thread1.getState());
        thread2.start();
        System.out.println(thread2.getState());
        print('@', 100); //die gaat ook mee uitvoeren omdat dat ook een thread is maar dan van de main

    }

    private static void print(char c, int count) {
        for(int i = 0; i < count; i++){
            System.out.print(c);
            Thread.yield();//cooperative multitasking zodat elke thread even veel kans heeft om aan bot te komen //main thread krijgt niet meer voorang
        }
    }
}
