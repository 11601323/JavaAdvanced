package be.pxl.java.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String,Box> boxes = new LinkedHashMap<>();
        boxes.put("Pictures Childhood", new Box());
        boxes.put("Books from school", new Box());
        boxes.put("My old vinyl records", new Box());
        boxes.put("Love letters", new Box());

        System.out.println("Contents of my loft:");
        boxes.keySet().forEach(System.out::println);

        System.out.println();
        System.out.println("Let's listen to old records.");
        Box records = boxes.get("My old vinly records");
    }
}
