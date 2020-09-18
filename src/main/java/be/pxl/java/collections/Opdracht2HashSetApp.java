package be.pxl.java.collections;

import java.util.*;

public class Opdracht2HashSetApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
//        Set<Double> hashSet = new HashSet<>();
//        for(int i = 0; i < 3; i++){
//            hashSet.add(keyboard.nextDouble());
//        }
//
//        hashSet.forEach(System.out::println);
//        System.out.println(hashSet.stream().mapToDouble(a -> a).sum());
//        System.out.println(hashSet.stream().mapToDouble(a -> a).average());
//

        //Lotterij
        Random rand = new Random();
        Set<Integer> lotSet = new HashSet<>();
        int getal = 0;
        while(lotSet.size() < 6){
            getal = rand.nextInt(45) +1;
            System.out.printf(getal + " ");
            lotSet.add(getal);
        }

        System.out.println("");

        Set<Integer> lotSet2 = new HashSet<>();
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

        System.out.println(lotSet.retainAll(lotSet2)); //retainAll gaat alleen de waardes houden in de lotset die overeen komen met de waardes van lotset2
        System.out.println(lotSet.size());


    }
}
