package be.pxl.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionStreamApp {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("this");
        words.add("is");
        words.add("an");
        words.add("example");
        words.add("of");
        words.add("streams");

        words.stream()
                .filter(s -> s.contains("e")) //alleen woorden met een e
                .sorted()
                .map(e -> "<" + e +">")
                .forEach(System.out::println);

        List<String> list =  words.stream()
                .filter(s -> s.contains("e")) //alleen woorden met een e
                .sorted()
                .map(e -> "<" + e +">").collect(Collectors.toList());
        list.forEach(System.out::println);

    }
}
