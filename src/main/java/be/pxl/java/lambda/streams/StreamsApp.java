package be.pxl.java.lambda.streams;

import java.sql.SQLOutput;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsApp {
    public static void main(String[] args) {

        String [] words = {"Hello", "this", "is" , "an", "example", "of", "streams"};
        Stream<String> streamString = Stream.of(words);
        streamString.forEach(System.out::println);
        //of
        System.out.println("");
        Stream.of(words).forEach(System.out::println);

        Stream<String> streamGenerate = Stream.generate(() -> "Hello World");

        System.out.println("***IntStream 0 - 10***");
        IntStream iStream = IntStream.rangeClosed(0,10);
        iStream.forEach(System.out::println);
        //Of
        System.out.println("***Zonder instance te maken***");
        IntStream.rangeClosed(0,10).forEach(System.out::println);
        //IntStream maken die nooit eindigt gaat dor iterate() te gebruiken
        System.out.println("***Oneindige IntStream***");
        //IntStream.iterate(50, i -> i + 1).forEach(System.out::println); //eerste getal is het getal waar de stream begint

        //Consumer
        System.out.println("");
        System.out.println("***Consumer***");
        Stream<String> streamConsumer = Stream.of(words);
        Consumer<String> consumer = s -> System.out.println(s);//Consumer<String> consumer = s -> System.out.printf("<<%s>>\n",s);
        streamConsumer.forEach(consumer);
        System.out.println("***Korte versie***");
        Stream.of(words)
                .forEach(System.out::println);

        //Sum()
        System.out.println();
        System.out.println("***Sum***");
        int sum = IntStream.rangeClosed(0,10).sum();
        System.out.println("Sum: " + sum);

        //Max()
        System.out.println();
        System.out.println("***Max***");
        OptionalInt max = IntStream.rangeClosed(0,10).max();
        System.out.println("Max: " + max.getAsInt()); // als max geen waarde zou hebben krijgt ge een error!!!
        OptionalInt geenMax = IntStream.of().max();
        if(geenMax.isPresent()){
            System.out.println("Max: " + geenMax.getAsInt());
        }
        else
        {
            System.out.println("No result");
        }

        //Reducerende waarden
        System.out.println();
        System.out.println("***Faculiteit***");
        int result = IntStream.rangeClosed(1,10).reduce(1,(acc,el) -> acc * el); //1x2x3x4x5x6x7x8x9x10 Startwaarde is 1
        System.out.println(result);
        //met woorden
        System.out.println();
        System.out.println("***reducerende waarden met woorden***");
        String res = Stream.of(words).reduce("Stertjes er tussen: ",(acc,el) -> acc + el + "*") ; //Hier gaat die starten met 'Sterretjes er tussen: ' en dan overal sterretjes tussen plaatsen
        System.out.println(res);

        //Collecteren dus de data die geterug krijgt ergens insteken
        String[] sa = Stream.of(words).toArray(size -> new String[size]);
        //sa = Stream.of(words).toArray(String[]::new); //manier 2
        int[] numbers = IntStream.of(5,8,9,4,6).toArray();

        //
        System.out.println();
        System.out.println("***Filter***");
        Predicate<String> predicate = s -> s.contains("e");
        Stream<String> filteredStream = Stream.of(words)
                .filter(predicate);
        filteredStream.forEach(System.out::println);
        //in één regel
        Stream.of(words)
                .filter(s -> s.contains("e"))
                .forEach(System.out::println);

        System.out.println("***Voorbeeld met meerdere filters***");
        Stream.of(words)
                .filter(s -> s.length() > 3)
                .filter(s -> s.contains("e"))
                .forEach(System.out::println);
        System.out.println("***Filter met minum 3 letters en max 4 woorden nemen***");
        Stream.of(words)
                .filter(s -> s.length() > 3)
                .limit(4)
                .forEach(System.out::println);

        System.out.println("***Geen duplicaten***");
        Stream.of(words)
                .distinct()
                .forEach(System.out::println);

        System.out.println("***Skip de eerste 2***");
        Stream.of(words)
                .skip(2)
                .forEach(System.out::println);

        System.out.println("***Voorbeeld waar limiet handig is met veelvouden***");
        IntStream.iterate(0, i -> i+3)
                .limit(5)
                .forEach(System.out::println);

        //Omzettingen
        System.out.println("");
        System.out.println("***Omzettingen***");
        Stream.of(words).mapToInt(s -> s.length()).forEach(System.out::println); //neem de lengte van de woorden en print die uit
        System.out.println("***Met ongebonden methode referentie***");
        Stream.of(words).mapToInt(String::length).forEach(System.out::println);
        System.out.println("***Tekenreeks omzetten naar hoofdletters***");
        Stream.of(words).map(String::toUpperCase).forEach(System.out::println);

        //sorteren
        System.out.println("***Sorteren***");
        Stream.of(words).sorted().forEach(System.out::println);


    }
}
