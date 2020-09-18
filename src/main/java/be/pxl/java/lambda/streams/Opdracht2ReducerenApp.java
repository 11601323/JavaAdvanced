package be.pxl.java.lambda.streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Opdracht2ReducerenApp {
    public static void main(String[] args) {
        int[] getallen = {2,2,4,6};
        System.out.println("Count: " + IntStream.of(getallen).count());

        OptionalInt max = IntStream.of(getallen).max();
        if(max.isPresent()){
            System.out.println("Max: " + max.getAsInt());
        }
        else {
            System.out.println("Er is geen max");
        }

        OptionalInt min = IntStream.of(getallen).min();
        if(min.isPresent()){
            System.out.println("Min: " + min.getAsInt());
        }
        else {
            System.out.println("Er is geen min");
        }

        OptionalDouble average = IntStream.of(getallen).average();
        if(average.isPresent()){
            System.out.println("Average : " + average.getAsDouble());
        }
        else {
            System.out.println("Er is geen Average");
        }

        int sum = IntStream.of(getallen).sum();
        System.out.println("Sum: " + sum);

        OptionalInt sumKwadraten = IntStream.of(getallen).reduce((acc,el) -> acc +  (int)Math.pow(el,2) ); // (int)Math.pow(el,2)
        System.out.println("Sum kwadraten: " + sumKwadraten);

    }
}
