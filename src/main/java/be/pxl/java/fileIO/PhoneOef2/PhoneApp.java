package be.pxl.java.fileIO.PhoneOef2;

import java.nio.file.Paths;
import java.util.Scanner;

public class PhoneApp {
    public static void main(String[] args) throws PhoneDirectoryException {
        Scanner input = new Scanner(System.in);
        // TODO create a collection
        PhoneDirectory phoneDirectory = new PhoneDirectory(Paths.get("resources\\phonedirectory.txt"));
        // TODO load collection from file
        phoneDirectory.fillPhoneDirectory();

        boolean running = true;
        while (running) {
            System.out.println("Geef een naam: ");
            String naam = input.nextLine();

            // TODO do stuff

            System.out.println("Geef een telefoonnummer: ");
            String telnr = input.nextLine();

            // TODO do stuff
            phoneDirectory.addNumber(naam,telnr);

            System.out.println("Wilt u nog namen toevoegen? (j/n)");
            running = input.nextLine().equals("j");
        }

        phoneDirectory.writeDataAway();
        // TODO save contacts to file

        input.close();
    }
}
