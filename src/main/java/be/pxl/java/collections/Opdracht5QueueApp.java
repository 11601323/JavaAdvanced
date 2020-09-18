package be.pxl.java.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Opdracht5QueueApp {
    public static void main(String[] args) {
        Queue<BurgerOrder> orders = new LinkedList<>();
        orders.offer(new BurgerOrder("order 1", 1));
        orders.offer(new BurgerOrder("order 2", 2));

        BurgerOrder s = orders.peek();

        while(s != null){
            System.out.println("About to handle " + s.getName());
            s = orders.poll();
            System.out.println("Handeling " + s.getName());
            s = orders.peek();
        }


    }
}
