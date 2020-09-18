package be.pxl.java.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class BoxSortingApp {
    public static void main(String[] args) {
        SortedSet<Box> boxes = new TreeSet<>();
        //sorteerd van kleinste oppervlakte naar grootste
        boxes.add(new Box(3,5,2));
        boxes.add(new Box(4,3,7));
        boxes.forEach(System.out::println);

        SortedSet<Box> boxes2 = new TreeSet<>(new BoxLengthComparator());
        //sorteerd van kleinste lengte naar grootste
        boxes2.add(new Box(3,5,2));
        boxes2.add(new Box(4,3,7));
        boxes2.forEach(System.out::println);
    }
}
