package be.pxl.java.lambda.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Opdracht4BewerkingenFiltersApp {
    public static void main(String[] args) {
        Person per1 = new Person("Tom", "Vanbriel", Geslacht.M, 23, 67, (float) 1.70);
        Person per2 = new Person("Kris", "Vanbriel", Geslacht.M, 27, 70, (float) 1.70);
        Person per3 = new Person("Patricia", "Wendelen", Geslacht.V, 50, 80, (float) 1.70);

        Person[] personen = {per1,per2,per3};

        System.out.println("---Geslacht");
        Stream.of(personen).filter(p -> p.getGeslacht() == Geslacht.V).forEach(System.out::println);

        System.out.println("---Leeftijd");
        Stream.of(personen).filter(p -> p.getLeeftijd() < 28).forEach(System.out::println);

        System.out.println("---Gewicht");
        Stream.of(personen)
                .filter(p -> p.getGewicht() > 50 )
                .filter(p -> p.getGewicht() < 69)
                .forEach(System.out::println);

        System.out.println("---ouder en gewicht");
        Stream.of(personen)
                .filter(p -> p.getGewicht() > 50 )
                .filter(p -> p.getLeeftijd() > 40)
                .forEach(System.out::println);

        System.out.println("---leeftijden afprinten");
        Stream.of(personen).forEach(p -> System.out.println(p.getLeeftijd()));

        System.out.println("---Voornamen en achternamen afprinten");
        Stream.of(personen)
                .map(p -> p.getVoornaam() + " " + per1.getAchternaam())
                .forEach(System.out::println);

        System.out.println("---Gemiddelde leeftijd en min en max");
       Stream.of(personen).mapToInt(p -> p.getLeeftijd()).average();
        System.out.println("Average: " + Stream.of(personen).mapToInt(p -> p.getLeeftijd()).average().getAsDouble());
        System.out.println("Min: " + Stream.of(personen).mapToInt(p -> p.getLeeftijd()).min().getAsInt());
        System.out.println("Max: " + Stream.of(personen).mapToInt(p -> p.getLeeftijd()).max().getAsInt());

        System.out.println("---som van vierkantswortels");
       OptionalInt result = IntStream.rangeClosed(0,1000)
                .filter(i -> i % 5 == 0)
                .filter(i -> i % 8 == 0)
                .limit(3)
                .reduce((acc,el) -> (int) (acc + Math.sqrt(el)));

//       OptionalDouble resutld = DoubleStream.iterate(0, i -> i + 1 )
//               .filter(i -> i % 5 == 0)
//               .filter(i -> i % 8 == 0)
//               .limit(3)
//               .reduce((acc, el) ->  acc + Math.sqrt(el));

        System.out.println(result);

        System.out.println("---10 unieke even getallen tussen 0 en 1000");
        Random random = new Random();
        IntStream intStream = random.ints(0,1000)
                .filter(i -> i % 2 == 0)
                .distinct()
                .limit(10);
        int[] array = intStream.toArray();
        for(int i : array){
            System.out.println(i);
        }
        List<Person> lijst = new ArrayList<>(Arrays.asList(personen));

        String str = lijst.stream().map(p -> p.getVoornaam()).reduce("", (acc,el) -> acc  + el + " ");
        System.out.println(str);
    }
}
