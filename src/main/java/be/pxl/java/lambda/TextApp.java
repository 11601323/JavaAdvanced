package be.pxl.java.lambda;

import java.math.BigDecimal;

public class TextApp {
    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("Hello this is an example of a sentence containing words");

        System.out.println("***Words containing 'e' ***");
        tp.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid(String s) {
                return s.contains("e");
            }
        });

        System.out.println("***Words containing 'e' with lambda!***");
        tp.printFilteredWords((String s) -> s.contains("e")); //kan ook gewoon e zijn in plaats van String e

        System.out.println("***Long words***");
        tp.printFilteredWords(s -> s.length() > 4);

        System.out.println("***Words starting with a***");
        tp.printFilteredWords(s -> s.startsWith("a"));

        final String c = "e";
        System.out.println("***Words starting with e, use final***"); // lambda kan enkel constante gebruiken, geen andere variabelen die buiten de scope liggen
        tp.printFilteredWords(s -> s.contains(c));

        System.out.println("***Words with e on the second spot***");
        tp.printFilteredWords(s -> s.length()>2 && s.charAt(1) == 'e' );

        System.out.println("***Words that have the e two times");
        tp.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid(String s) {
                int e = 0;

                for (int i = 0; i < s.length(); i++){

                    if(s.substring(i, i+1).equals("e")){
                        e++;
                    }
                }
                return e == 2;
            }
        });

        System.out.println("");

        System.out.println("***Woord processor***");
        tp.printProcessedWords(s -> String.format("<<%s>>",s));

        System.out.println("***Woord processor met util interface***");
        tp.printProcessedWords((s -> TextUtil.quote(s)));
        System.out.println("***Woord processor met util interface en methode reference***");
        tp.printProcessedWords(TextUtil::quote);


        System.out.println("***Woorden in reverse***");
        tp.printProcessedWords(TextUtil::reverse);

        System.out.println("***text scramble, gebonden methodereferentie");
        TextScrambler scrambler = new TextScrambler();
        tp.printProcessedWords(scrambler::scramble);

        System.out.println("***Gebruik van ongebonden methodreferentie");
        tp.printProcessedWords(String::toLowerCase);

        BigDecimal a = BigDecimal.valueOf(5);
        BigDecimal b = BigDecimal.valueOf(4);

    }

}
