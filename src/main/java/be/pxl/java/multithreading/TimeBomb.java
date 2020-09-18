package be.pxl.java.multithreading;

public class TimeBomb implements Runnable {
    private int time;
    private Thread thread1;
    private Thread thread2;
    public int test =0;

    public TimeBomb(int time) {
        this.time = time;
    }

    public void activate() {
        Thread thread1 = new Thread(new TimeBomb(time));
        thread1.start(); //thread1.start() gaat de methode run oproepen hieronder!
    }
    public void disarm(){
        System.out.println("Disarmed");
        System.exit(0);
    }

    @Override
    public void run() {
        test = 50;
        for(int i = 0; i < time; i++){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i == time ){
                System.out.println("Booooooom!!!");
                System.exit(0);
            }
            else{
                System.out.println("Timebomb ticking: " + (time - i) + " seconds left");
            }
        }
    }
}
