package be.pxl.java.exceptions.vriendengroepOef;

import java.util.Scanner;

public class VriendenApp {
    public static void main(String[] args) {
        int dag;
        int maand;
        int jaar;
        String naam = "";
        Scanner keyboard = new Scanner(System.in);
        Vriendengroep vrienden = new Vriendengroep();

        System.out.println("Geef naam: ");
        naam = keyboard.next();

        while(!naam.toUpperCase().equals("stop".toUpperCase())){

            System.out.println("Geef dag: ");
            dag = keyboard.nextInt();

            System.out.println("Geef maand: ");
            maand = keyboard.nextInt();

            System.out.println("Geef jaar: ");
            jaar = keyboard.nextInt();

            Persoon per = new Persoon(naam, dag,maand,jaar);

            try {
                vrienden.voegVriendToe(per);
            } catch (NaamException e) {
                System.out.println("Deze vriend is er al");
            } catch (TeVeelVriendenException e) {
                System.out.println("Te veel vrienden");
            }

            System.out.println("Geef naam: ");
            naam = keyboard.next();
        }


        System.out.println(vrienden.toString());
    }
}
