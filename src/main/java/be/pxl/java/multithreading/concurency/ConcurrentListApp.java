package be.pxl.java.multithreading.concurency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ConcurrentListApp {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();

        List<Integer> slist = Collections.synchronizedList(list);

        Thread thread1 = new Thread(() -> populate(slist,1000));
        Thread thread2 = new Thread(() -> populate(slist,1000));
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(slist.size());
    }

    private static void populate(List<Integer> list, int count) {
        for(int i=0; i<count; i++){
            list.add(i);
        }
    }
}
