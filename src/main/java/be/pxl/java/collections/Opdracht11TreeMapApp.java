package be.pxl.java.collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class Opdracht11TreeMapApp {
    public static void main(String[] args) {
        SortedMap<String, Person> personsMap = new TreeMap<>();

        personsMap.put("Tom", new Person("Tom", "Vanbriel", "M", 20, 67, 1.71));
        personsMap.put("Stefan", new Person("Stefan", "Vanbriel", "M", 20, 67, 1.71));
        personsMap.put("Kris", new Person("Kris", "Vanbriel", "M", 20, 67, 1.71));

        personsMap.keySet().forEach(System.out::println);
        System.out.println(personsMap.get("Kris"));
        System.out.println(personsMap.get(personsMap.firstKey()));

    }


}
