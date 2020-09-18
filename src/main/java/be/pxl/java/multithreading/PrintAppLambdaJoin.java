package be.pxl.java.multithreading;

public class PrintAppLambdaJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> print('*', 100));
        Thread thread2 = new Thread(() -> print('#', 100));


        thread1.start();
        thread2.start();


        thread1.join(); //De hoofd thread moet gaan wachten tot dat thread1 en twee klaar zijn
        thread2.join();
        //Thread.sleep(300);
        thread1.interrupt();
        thread2.interrupt();

        System.out.println(Thread.interrupted());

        System.out.println("End");

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
