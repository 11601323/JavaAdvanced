package be.pxl.java.multithreading;

public class PrintAppLambdaSleep {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> print('*', 100));
        Thread thread2 = new Thread(() -> print('#', 100));

        thread1.setName("T1");
        thread2.setName("T2");

        thread1.start();
        thread2.start();

        Thread.sleep(470);
        thread1.interrupt();
        Thread.sleep(130);
        thread2.interrupt();

    }

    private static void print(char c, int count) {
        for(int i = 0; i < count; i++){
            System.out.print(c);
            //no need for yield anymore//Thread.yield();//cooperative multitasking zodat elke thread even veel kans heeft om aan bot te komen //main thread krijgt niet meer voorang
            try{
                Thread.sleep(100);
        } catch (InterruptedException e) {
                System.out.print(Thread.currentThread().getName() + " :Interrupted");
            }
        }
    }
}
