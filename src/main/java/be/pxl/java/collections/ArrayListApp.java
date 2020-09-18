package be.pxl.java.collections;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListApp {
    public static void main(String[] args) {
        //List "ArrayList"
        Collection<String> arrayList = new ArrayList<>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");

        for(String el: arrayList) {
            System.out.println(el);
        }
        System.out.println("");

        //met lambda
        arrayList.forEach(el -> System.out.println(el));
        System.out.println("");
        //met method reference
        arrayList.forEach(System.out::println);
        System.out.println("");

        System.out.println(arrayList.size());
        System.out.println("");

        arrayList.clear();
        System.out.println(arrayList.size());
        System.out.println("");

        //arrayList omzetten naar array

        String[] sa = arrayList.toArray(new String[arrayList.size()]); //krijgt de grote van de lijst list
        //of
        String[] sa2 = arrayList.toArray(new String[0]); // krijgt de grote 0 dus alle waardes gaan weer leeg zijn



    }
}
