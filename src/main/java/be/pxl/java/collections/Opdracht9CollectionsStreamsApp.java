package be.pxl.java.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Opdracht9CollectionsStreamsApp {
    public static void main(String[] args) {
        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person("Tom", "Vanbriel", "M", 22,67, 1.71));
        personsList.add(new Person("Stefan", "Vanbriel", "M", 22,67, 1.71));
        personsList.add(new Person("Gitte", "Steegmans", "V", 12,67, 1.71));
        personsList.add(new Person("Maria", "Fuchs", "V", 32,67, 1.71));
        personsList.add(new Person("Stefanie", "Eyckens", "V", 25,67, 1.71));

        List<Person> vrouwen;
        vrouwen = personsList.stream()
                .sorted((person1, person2) -> person1.getAge() - person2.getAge()) //.Sorted(Comparator.comparingInt(person -> person.getAge()))
                .filter(g -> g.getGender().equals("V"))
                .collect(Collectors.toList());

        vrouwen.forEach(s -> System.out.println(s.getFirstname() + " " + s.getAge()));
    }
}
