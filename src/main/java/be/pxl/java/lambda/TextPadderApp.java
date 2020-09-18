package be.pxl.java.lambda;

public class TextPadderApp {
    public static void main(String[] args) {
        TextPadder padder = new TextPadder(20);
        TextPrinter tp = new TextPrinter("Hello this is an example of a sentence containing words");
        System.out.println("***Lambda***");
        tp.printProcessedWords(s -> padder.pad(s));

        System.out.println("***Method reference***");
        tp.printProcessedWords(padder::pad);

        System.out.println("***Methode van ongebonden object***");
        tp.printProcessedWords(s -> s.toUpperCase());
        System.out.println("***Method reference***");
        tp.printProcessedWords(String::toUpperCase);


    }
}
