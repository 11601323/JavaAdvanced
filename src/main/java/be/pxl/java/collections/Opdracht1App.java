package be.pxl.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Opdracht1App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        List<Double> arrayList = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            arrayList.add(keyboard.nextDouble());
        }

        arrayList.forEach(System.out::println);
        System.out.println(arrayList.stream().mapToDouble(a -> a).sum());
        System.out.println(arrayList.stream().mapToDouble(a -> a).average());


//        String i = "dsq";
//        String letter = "";
//        while(!letter.equals(".")){
//            i = keyboard.next();
//            letter = i.substring(i.length()-1);
//            System.out.println(letter);
//
//        }

    }
}
