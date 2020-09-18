package be.pxl.java.lambda;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TextPrinter {
    private String sentence;

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public void printProcessedWords(WordProcessor processor){
        for(String w : sentence.split(" ")){
            System.out.println(processor.proccess(w));
        }
    }

    public void printFilteredWords(WordFilter filter){
        for(String w : sentence.split(" ")){
            if(filter.isValid(w)){
                System.out.println(w);
            }
        }
    }

    public void printNumberValues(NumberParser parser){
        for(String w : sentence.split(" ")){
            System.out.format("%d%n", parser.parse(w));
        }
    }
    public void printSum(NumberParser parser){
        BigDecimal sum = BigDecimal.valueOf(0);
        for(String w : sentence.split(" ")){
            sum = parser.parse(w).add(sum);
        }
        System.out.println(sum);
    }

}
