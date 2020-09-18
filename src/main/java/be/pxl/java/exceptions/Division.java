package be.pxl.java.exceptions;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try {

            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.format("%d/%d=%d", num, den, div);
            keyboard.close();
        }
        catch (RuntimeException re){
            System.out.println("Invalid input");
        }
        //        catch (ArithmeticException|NumberFormatException t) { //zelfde als de runtime exception te doen
//            System.out.println("invalid input");
//        }
//        catch (NumberFormatException nfe){ //gebeurd als ge geen cijfer ingeeft
//            System.out.println("Invalid number");
//            System.out.println(nfe.getMessage()); //omschrijving van de exception
//            nfe.printStackTrace(); //waar ging het fout dat de exception kwam
//        }
//        catch (ArithmeticException ae){ //gebeurt als ge door null deelt
//            System.out.println("Gekunt niet delen door null");
//        }
        finally {
            keyboard.close();
            System.out.println("\nThe End");
        }
    }
}
