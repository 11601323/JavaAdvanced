package be.pxl.java.lambda.streams;

import java.util.stream.Stream;

public class Opdracht1StreamApp {
    public static void main(String[] args) {
        Person per1 = new Person("Tom", "Vanbriel", Geslacht.M, 23, 67, (float) 1.70);
        Person per2 = new Person("Kris", "Vanbriel", Geslacht.M, 23, 67, (float) 1.70);
        Person per3 = new Person("Patricia", "Wendelen", Geslacht.V, 23, 67, (float) 1.70);

        Person[] persons = {per1,per2,per3};

        Stream<Person> personStream = Stream.of(persons);
        personStream.forEach(System.out::println);

    }
}
