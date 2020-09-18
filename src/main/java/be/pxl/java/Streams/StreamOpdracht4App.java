package be.pxl.java.Streams;

import be.pxl.java.lambda.streams.Geslacht;
import be.pxl.java.lambda.streams.Person;

import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOpdracht4App {
    public static void main(String[] args) {
        Person per1 = new Person("Tom", "Vanbriel", Geslacht.M, 23, 67, (float) 1.70);
        Person per2 = new Person("Kris", "Vanbriel", Geslacht.M, 27, 70, (float) 1.70);
        Person per3 = new Person("Patricia", "Wendelen", Geslacht.V, 50, 80, (float) 1.70);

        Person[] personen = {per1, per2, per3};


        Stream.of(personen)
                .filter(p -> p.getGeslacht().equals(Geslacht.V))
                .forEach(System.out::println);
        System.out.println();

        Stream.of(personen)
                .filter(p -> p.getLeeftijd() > 24)
                .forEach(System.out::println);
        System.out.println();

        Stream.of(personen)
                .filter(p -> p.getGewicht() > 68)
                .filter(p -> p.getGewicht() < 79)
                .forEach(System.out::println);
        System.out.println();

        Stream.of(personen)
                .forEach(s -> System.out.println(s.getLeeftijd()));
        System.out.println();

        Stream.of(personen)
                .map(p -> "<<" + p.getVoornaam() + " " + p.getAchternaam() + ">>")
                .forEach(System.out::println);

        System.out.println(Stream.of(personen).mapToInt(p -> p.getLeeftijd()).average().getAsDouble());
        System.out.println(Stream.of(personen).mapToInt(p -> p.getLeeftijd()).min().getAsInt());
        System.out.println(Stream.of(personen).mapToInt(p -> p.getLeeftijd()).max().getAsInt());


        double resutld = DoubleStream.iterate(0, i -> i + 1)
                .filter(i -> i % 5 == 0)
                .filter(i -> i % 8 == 0)
                .limit(3)
                .reduce(0, (acc, el) -> acc + Math.sqrt(el));
        System.out.println(resutld);

        System.out.println();
        Random rand = new Random();
        Random random = new Random();
        IntStream intStream = random.ints(1,11)
                .filter(i -> i % 2 == 0)
                .distinct()
                .limit(5);
        intStream.forEach(System.out::println);
    }
}
