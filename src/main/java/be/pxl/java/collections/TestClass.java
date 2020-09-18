package be.pxl.java.collections;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("woord 1");
        col.add("woord 2");

        Iterator<String> it = col.iterator();

        System.out.println("Lambda!!!!!");
        col.forEach(woord -> System.out.println(woord)); //lambda expression
        System.out.println("");

        System.out.println("Method reference!!!!");
        col.forEach(System.out::println); //method reference
        System.out.println("");

        System.out.println("hasNext en Next");
        while(it.hasNext()){
            System.out.println(it.next() + " " + it.hasNext());
        }
        System.out.println("");

        System.out.println("Next()");
        col.forEach(woord -> System.out.println(col.iterator().next()));
        System.out.println("");

        System.out.println("Stream");
        col.stream().forEach(System.out::println);


    }
}
