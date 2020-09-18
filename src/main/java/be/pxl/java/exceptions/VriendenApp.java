package be.pxl.java.exceptions;

import java.util.Scanner;

public class VriendenApp {

    public static void main(String[] args) {
        System.out.println("Vind zelf uw vrienden uit en voeg ze toe aan een lijstje!");
        Scanner scanner = new Scanner(System.in);
        Vriendengroep vriendengroep = new Vriendengroep();
        boolean ended = false;

        while(!ended) {
            try {
                System.out.print("Naam: ");
                String naam = scanner.nextLine();
                if(!naam.equalsIgnoreCase("stop")) {
                    System.out.print("Geboortedatum dag:");
                    int dag = Integer.parseInt(scanner.nextLine());
                    System.out.print("Geboortedatum maand:");
                    int maand = Integer.parseInt(scanner.nextLine());
                    System.out.print("Geboortedatum jaar:");
                    int jaar = Integer.parseInt(scanner.nextLine());

                    Person nieuweVriend = new Person(naam, dag, maand, jaar);
                    vriendengroep.voegVriendToe(nieuweVriend);
                } else {
                    ended = true;
                }
            } catch(NaamException exception) {
                System.out.println(exception.getMessage());
            } catch(TeVeelVriendenException exception) {
                System.out.println(exception.getMessage());
            }
        }

        System.out.println(vriendengroep);
    }

}
