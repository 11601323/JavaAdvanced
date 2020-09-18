package be.pxl.java.lambda;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TextPrinterZonderInterface {
    private String sentence;

    public TextPrinterZonderInterface(String sentence) {
        this.sentence = sentence;
    }

    public void printFilteredWords(Predicate<String> filter){
        for(String w : sentence.split(" ")){ //---------zelfde als de gewone textprinter maar dan zonder interface maar dan Predicate<String> gaat na als het object wel een string is true or false
            if(filter.test(w)){
                System.out.println(w);
            }
        }
    }

    public void printProcessedWords(Function<String,String> processor){
        for(String w : sentence.split(" ")){
            System.out.println(processor.apply(w));
        }
    }

    public void printNumberValues(Function<String, BigDecimal> parser){ //function zet het ene type om naar het andere
        for(String w : sentence.split(" ")){
            System.out.format("%d%n", parser.apply(w));
        }
    }

    public void printFilteredWordsConsume(Predicate<String> filter, Consumer<String> printer){
        for(String w : sentence.split(" ")){ //consumer gaat deze keer de string bij houden zodat die achteraf kan gebruikt worden
            if(filter.test(w)){
                printer.accept(w);
            }
        }
    }

}
