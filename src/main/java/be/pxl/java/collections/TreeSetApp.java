package be.pxl.java.collections;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetApp {
    public static void main(String[] args) {
        NavigableSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(10);
        treeSet.add(5); //gaat niet toegevoegd worden!

        treeSet.forEach(System.out::println);

        treeSet.add(4);

        System.out.println("");
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.ceiling(7));
        System.out.println(treeSet.floor(7));
        System.out.println(treeSet.higher(4));
        System.out.println(treeSet.lower(8));
    }
}
