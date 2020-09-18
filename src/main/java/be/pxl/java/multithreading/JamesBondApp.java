package be.pxl.java.multithreading;

import java.util.Random;

public class JamesBondApp {
    public static void main(String[] args) throws InterruptedException {

        Random rand = new Random();
        TimeBomb bomb = new TimeBomb(5);
        bomb.activate();
        Thread.sleep(rand.nextInt(20000));
        System.out.println(bomb.test);
        bomb.disarm();

    }
}
