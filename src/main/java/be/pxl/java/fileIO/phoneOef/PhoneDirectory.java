package be.pxl.java.fileIO.phoneOef;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

import java.nio.file.StandardOpenOption;
import java.util.*;

public class PhoneDirectory {
    private Map<String, List<String>> contacts = new HashMap<>();

    public Map<String, List<String>> getContacts(String sam) {
        return contacts;
    }

    public void createCollection(Path path) {
        try (FileReader file = new FileReader(path.toFile());
             BufferedReader reader = new BufferedReader(file)) {

            String line = null;

            while ((line = reader.readLine()) != null) {
                String[] gegevens = line.split(";");
                contacts.put(gegevens[0], Arrays.asList(gegevens).subList(1, gegevens.length));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> giveNumbers(String name) {
        return contacts.get(name);
    }

    public void addNumbers(String name, String number) throws Exception {
        if (contacts.get(name) == null) {
            System.out.println("Deze naam staat niet in de lijst");
        } else {

            for (String n : contacts.get(name)) {
                if (n == number) {
                    throw new PhoneDirectoryException("Number is the same");
                }
            }
            //List<String> tussenLijst =contacts.get(name); dit werkt niet
            List<String> tussenLijst = new ArrayList<>(contacts.get(name)); // new ArrayList moet gebeuren anders werkt dit niet!
            tussenLijst.add(number);
            contacts.put(name, tussenLijst);
        }
    }

    public void saveData(Path path) throws IOException, PhoneDirectoryException {
        try {
            if (Files.notExists(path)) {
                Files.createFile(path);
            }
        } catch(IOException e){
            throw new PhoneDirectoryException("Problem creating file");
        }
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (String key : contacts.keySet()) {
                writer.write(key);
                for (String number : contacts.get(key)) {
                    writer.write(";" + number);
                }
                writer.newLine();
            }
        } catch (Exception e) {
            throw new PhoneDirectoryException("Problem writing to file.");
        }

    }


}
