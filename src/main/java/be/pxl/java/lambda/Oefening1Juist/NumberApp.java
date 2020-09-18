package be.pxl.java.lambda.Oefening1Juist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberApp {
    public static void main(String[] args) {
        int[] cijfers = {541,888,2,3};
        NumberMachine numberMachine =  new NumberMachine(cijfers);
        NumberSelector numberSelector = new NumberSelector(numberMachine);

        System.out.println(numberSelector.showEvenNumbers());
        System.out.println(numberSelector.showNumbersAbove(5));
        System.out.println(numberSelector.printHexNumbers());
        System.out.println(numberSelector.printFortmat());
    }
}
