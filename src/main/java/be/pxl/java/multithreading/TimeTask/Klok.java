package be.pxl.java.multithreading.TimeTask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimerTask;

public class Klok extends TimerTask {
    @Override
    public void run() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern(("HH:mm:ss"))));
    }
}
