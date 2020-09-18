package be.pxl.java.lambda.Oefening1;



public class NumberSelector {
    private NumberMachine numberMachine;

    public NumberSelector(NumberMachine numberMachine) {
        this.numberMachine = numberMachine;
    }

    public String showEvenNumbers(){
        class Filter implements NumberFilter {
            @Override
            public boolean check(int number) {
                return number % 2 == 0;
            }
        }
        NumberFilter filter = new Filter();
        return numberMachine.processNumbers(filter);
    }

    public String showNumbersAbove(int minNumber){

        return numberMachine.processNumbers(number -> number > minNumber);
    }

    public String printHexNumbers(){
        return numberMachine.convertNumbers(number -> Integer.toHexString(number));//Integer.toHexString zet getal om in hexadecimaal
    }



}
