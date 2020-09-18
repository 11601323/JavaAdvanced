package be.pxl.java.collections.CompareTo;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ComparableApp {
    public static void main(String[] args) {
        Dier dier = new Dier("Lando", "Walvis");
        Dier dier2 = new Dier("Werner", "Hond");

        TreeSet<Dier> dieren = new TreeSet<>();
        dieren.add(dier);
        dieren.add(dier2);
        dieren.forEach(System.out::println);
        System.out.println();
        List<Dier> lijst = new ArrayList<>();

        lijst.addAll(dieren);
        lijst.forEach(System.out::println);
        System.out.println();
        Collections.reverse(lijst);
        lijst.forEach(System.out::println);
    }
}
