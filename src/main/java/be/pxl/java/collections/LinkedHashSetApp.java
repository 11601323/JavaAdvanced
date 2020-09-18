package be.pxl.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class LinkedHashSetApp {
    public static void main(String[] args) {
        //Lotterij
        Random rand = new Random();
        Set<Integer> lotSet = new LinkedHashSet<>();
        int getal = 0;
        while(lotSet.size() < 6){
            getal = rand.nextInt(45) +1;
            System.out.printf(getal + " ");
            lotSet.add(getal);
        }

        System.out.println("");

        Set<Integer> lotSet2 = new LinkedHashSet<>();
        while(lotSet2.size() < 6){
            getal = rand.nextInt(45) +1;
            System.out.printf(getal + " ");
            lotSet2.add(getal);
        }

        System.out.println("");

        System.out.println("Lotterij nummers:");
        lotSet.forEach(l -> System.out.print(l + " "));
        System.out.println("");
        System.out.println("Mijn nummers:");
        lotSet2.forEach(l -> System.out.printf(l + " "));
        System.out.println("");


    }
}
