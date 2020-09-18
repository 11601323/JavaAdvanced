package be.pxl.java.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> train = new ArrayDeque<>();
        train.offerFirst("Locomotive1");
        train.offerLast("Wagon1");
        train.offerLast("Wagon2");
        train.offerLast("Wagon3");
        train.offerLast("Wagon4");
        train.offerLast("Wagon5");
        train.offerFirst("Locomotive2");
        train.offerLast("Wagon6");
        train.offerLast("Wagon7");
        train.offerLast("Wagon8");
        train.offerLast("Wagon9");
        train.offerLast("Wagon10");

        String unit = train.pollFirst();
        while(unit != null){
            System.out.println(unit);
            unit = train.pollFirst();
        }


    }
}
