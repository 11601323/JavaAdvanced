package be.pxl.java.lambda;

import java.math.BigDecimal;

public class TextNumberApp {
    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("145 236 9852 3658");

//        tp.printNumberValues(s -> new BigDecimal(s));
//        tp.printNumberValues(BigDecimal::new);
        tp.printSum(BigDecimal::new);
    }
}
