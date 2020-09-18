package be.pxl.java.multithreading.TimeTask;

import java.sql.Time;
import java.util.Timer;

public class TimeoutApp {
    public static void main(String[] args) {
        Timeout task = new Timeout();
        Timer timer = new Timer(true);
        timer.schedule(task, 1000*10);
        System.out.println("Even geduld");
        try{
            Thread.sleep(20*1000);
            System.out.println("End");
        }catch(InterruptedException ie){

        }
    }
}
