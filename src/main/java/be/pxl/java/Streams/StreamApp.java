package be.pxl.java.Streams;

import be.pxl.java.lambda.Oefening2Juist.VideoGame;

import java.util.ArrayList;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApp {
    public static void main(String[] args) {
        String[] tekens = {"d","b","c"};
        Stream.of(tekens).forEach(System.out::println);

        IntStream intStream = IntStream.rangeClosed(0,9);
        intStream.forEach(System.out::println);

        VideoGame fifa = new VideoGame("Fifa", 5, 9, new String[]{"Sport"} );
        VideoGame basket = new VideoGame("Basket", 5, 9, new String[]{"Sport"} );
        VideoGame valorant = new VideoGame("Valorant", 0, 9, new String[]{"Schooter","Sciencefiction"});
        VideoGame[] games = {fifa,basket,valorant};
        Stream.of(games).forEach(System.out::println);
//        Stream<VideoGame> streamVideoGame = Stream.of(games);
////        streamVideoGame.forEach(System.out::println);

        int[] numbers = {4,16,25};
        int result = IntStream.of(numbers)
                .reduce(0,(acc,el) -> acc +(int) Math.sqrt(el));


        System.out.println(result);

        System.out.println(IntStream.of(numbers).count());
        System.out.println(IntStream.of(numbers).max().getAsInt());
        System.out.println(IntStream.of(numbers).min().getAsInt());
        System.out.println(IntStream.of(numbers).average().getAsDouble());
        System.out.println(IntStream.of(numbers).sum());
    }
}
