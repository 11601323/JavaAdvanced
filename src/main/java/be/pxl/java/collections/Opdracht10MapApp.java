package be.pxl.java.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Opdracht10MapApp {
    public static void main(String[] args) {
        Map<Coin, Integer> portomonee = new LinkedHashMap<>(); //linkedHashmap is gesorteerd gewoon hashmap niet
        portomonee.put(Coin.CENT2,3);
        portomonee.put(Coin.CENT5,4);
        portomonee.put(Coin.CENT10,0);
        portomonee.put(Coin.CENT20,0);
        portomonee.put(Coin.CENT50,6);
        portomonee.put(Coin.EURO1,3);
        portomonee.put(Coin.EURO2,1);

        double totaal = 0;
        for (Coin c : portomonee.keySet()) {
            System.out.println(c.name() + ": " + portomonee.get(c));
            totaal += c.getWaarde() * portomonee.get(c);
        }
        System.out.println(totaal);


    }
}
