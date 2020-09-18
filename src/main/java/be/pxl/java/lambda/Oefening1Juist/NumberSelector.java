package be.pxl.java.lambda.Oefening1Juist;

public class NumberSelector {
    private NumberMachine numberMachine;

    public NumberSelector(NumberMachine numberMachine) {
        this.numberMachine = numberMachine;
    }

    public String showEvenNumbers(){
        return numberMachine.processNumbers(new NumberFilter() {
            @Override
            public boolean check(int number) {
                return number % 2 == 0;
            }
        });
    }

    public String showNumbersAbove(int value){
        return numberMachine.processNumbers(s -> s > value);
    }

    public String printHexNumbers(){
        return numberMachine.converNumbers(s -> Integer.toHexString(s));
    }

    public String printFortmat(){
        return numberMachine.converNumbers(s -> String.format("<<%s>>", s));
    }
}
