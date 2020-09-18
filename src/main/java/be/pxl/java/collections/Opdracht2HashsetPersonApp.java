package be.pxl.java.collections;

import java.util.HashSet;
import java.util.Set;

public class Opdracht2HashsetPersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("tom", "vanbriel","m", 22, 70, 1.71);
        Person person2 = new Person("tom", "vanbriel","m", 22, 70, 1.71);

        Set<Person> persons = new HashSet<>();
        persons.add(person1);
        persons.add(person2);

        persons.forEach(System.out::println);
    }
}
