package be.pxl.java.multithreading;

public class DaemonThreadApp {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> print('*', 10));
        Thread thread2 = new Thread(() -> print('#', 10));
        thread2.setDaemon(true); //--------- zorgt ervoor dat de applicatie ook kan stoppen wanneer thread2 nog niet gedaan is
        thread1.start();
        //thread1.setDaemon(true); // beide gaat niet dan krijgt ge een error
        thread2.start();


        print('@', 100); //die gaat ook mee uitvoeren omdat dat ook een thread is maar dan van de main

        //System.exit(1); //forced een einde van het programma
    }

    private static void print(char c, int count) {
        for(int i = 0; i < count; i++){
            System.out.print(c);
            Thread.yield();//cooperative multitasking zodat elke thread even veel kans heeft om aan bot te komen //main thread krijgt niet meer voorang
        }
    }
}
