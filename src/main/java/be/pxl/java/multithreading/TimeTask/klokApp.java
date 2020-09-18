package be.pxl.java.multithreading.TimeTask;

import java.util.Timer;

public class klokApp {
    public static void main(String[] args) {
        Timer time = new Timer();
        Klok klok = new Klok();
        time.schedule(klok, 100, 1000);
    }
}
