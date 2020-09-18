package be.pxl.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        Collection<String> linkedList = new LinkedList<>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        for(String el: linkedList) {
            System.out.println(el);
        }
        System.out.println("");

        //met lambda
        linkedList.forEach(el -> System.out.println(el));
        System.out.println("");
        //met method reference
        linkedList.forEach(System.out::println);
        System.out.println("");

        System.out.println(linkedList.size());
        System.out.println("");

        linkedList.clear();
        System.out.println(linkedList.size());
        System.out.println("");

    }
}
