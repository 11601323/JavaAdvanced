package be.pxl.java.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, Integer> ingredients = new HashMap<>();
        ingredients.put("Potatoes", 5);
        ingredients.put("Carrots", 4);
        ingredients.put("Beans",2);
        ingredients.put("Chicken",1); //key is chicken, waarde is 1 (1 kip dus)

        System.out.println(ingredients.get("Chicken"));

        for(String s: ingredients.keySet()){
            System.out.println(s + ": " + ingredients.get(s));
        }

        System.out.println("");
        ingredients.forEach((k,v) -> System.out.println(k + ": " + v));
    }
}
