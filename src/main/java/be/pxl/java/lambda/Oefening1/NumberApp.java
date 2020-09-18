package be.pxl.java.lambda.Oefening1;

import java.util.ArrayList;
import java.util.List;

public class NumberApp {
    public static void main(String[] args) {
        int[] nummers = {7,8,40};
        NumberMachine numberMachine = new NumberMachine(nummers);
        NumberSelector numberSelector = new NumberSelector(numberMachine);
        System.out.println(numberSelector.showEvenNumbers());
        System.out.println(numberSelector.printHexNumbers());
    }
}
