package be.pxl.java.multithreading.TimeTask;

import java.util.TimerTask;

public class Timeout extends TimerTask {
    @Override
    public void run() {
        System.out.println("De tijd is verstreken");
    }
}
