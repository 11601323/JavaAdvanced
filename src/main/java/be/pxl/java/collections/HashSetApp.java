package be.pxl.java.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp {
    public static void main(String[] args) {
        Set<String> texts = new HashSet<>();
        texts.add("Hallo");
        texts.add("World");

        texts.forEach(System.out::println);
        texts.forEach(System.out::println);

        texts.clear();

        texts.add(new String("Hello World"));
        texts.add(new String("Hello World"));
        System.out.println(texts.size()); //1!!!!! dit komt door de ingeboude equals methode in een string die ziet dat da twee dezelfde zijn, bij een stringbuilder is dit niet het geval


        Set<StringBuilder> texts2 = new HashSet<>();
        texts2.add(new StringBuilder("Hello World"));
        texts2.add(new StringBuilder("Hello World"));
        System.out.println(texts2.size()); //2!!!!!
    }
}
