package be.pxl.java.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TextZonderInterfaceApp {
    public static void main(String[] args) {
        TextPrinterZonderInterface tp = new TextPrinterZonderInterface("Hello this is an example of a sentence containing words");
        System.out.println("Predicate*********");
        Predicate<String> condition1 = s -> s.length() == 4;
        Predicate<String> condition2 = s -> s.length() == 5;
        Predicate<String> condition3 = condition1.or(condition2);
        tp.printFilteredWords(condition3);

        System.out.println("Function**************");
        tp.printProcessedWords(String::toUpperCase);
        System.out.println("Tekens verwisseld********");
        Function<String,String> proc1 = s -> s.toUpperCase();
        Function<String, String> proc2 = s -> s.replace('e', '3');
        Function<String,String> proc3 = proc2.andThen(proc1); //eerst voorwaarde 2 doen daarna voorwaar 1
        tp.printProcessedWords(proc3);

        System.out.println("Consumer*****");
        Consumer<String> printer = System.out::println;
        //tp.printFilteredWordsConsume(s -> String.format("<<%s>>",s),printer);
    }
}
