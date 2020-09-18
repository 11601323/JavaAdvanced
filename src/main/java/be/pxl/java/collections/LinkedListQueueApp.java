package be.pxl.java.collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("John");
        queue.offer("Sue");
        queue.offer("Ellen");
        queue.offer("Richard");

        //handeeling queue, het afgaan van een wachtrij bij de dokter bijvoorbeeld
        String s = queue.peek();
        while(s!=null){
            System.out.println("About to handle " + s);
            s = queue.poll(); //pol pakt dat element en verwijderd het
            System.out.println("Handeling " + s);
            s = queue.peek(); // peek kijkt alleen maar wat het volgende item is
        }
    }
}
