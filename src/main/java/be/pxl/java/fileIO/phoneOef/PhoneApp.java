package be.pxl.java.fileIO.phoneOef;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class PhoneApp {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // TODO load collection from file
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        Path path = Paths.get("resources\\phonedirectory.txt");
        phoneDirectory.createCollection(path);
        phoneDirectory.getContacts("Sam").forEach((k,v) -> System.out.println(v));

        boolean running = true;
        while (running) {
            System.out.println("Geef een naam: ");
            String naam = input.nextLine();

            // TODO do stuff

            System.out.println("Geef een telefoonnummer: ");
            String telnr = input.nextLine();

            phoneDirectory.addNumbers(naam, telnr);
            // TODO do stuff

            System.out.println("Wilt u nog namen toevoegen? (j/n)");
            running = input.nextLine().equals("j");
        }


        // TODO save contacts to file
        phoneDirectory.saveData(path);
        input.close();
    }



}
