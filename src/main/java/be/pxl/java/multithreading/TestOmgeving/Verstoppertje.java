package be.pxl.java.multithreading.TestOmgeving;

public class Verstoppertje implements Runnable {
    private Thread thread1 = new Thread();
    private Thread thread2;

    public void startTellen(){
        thread1 = new Thread(new Verstoppertje());
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void Vindpersoon(){
        for(int i = 0; i <= 5; i++){
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Persoon  " +  i  + "gevonden");
        }
    }

    @Override
    public void run() {
        if(thread1.getState() == Thread.State.NEW) {
            for (int i = 0; i <= 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(10 - i);
            }
        }

    }
}
