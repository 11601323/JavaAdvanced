package be.pxl.java.fileIO;

import java.io.*;

public class CivilService {
    public static void main(String[] args) {
        try(FileInputStream file = new FileInputStream("TomVanbriel");
                     ObjectInputStream in = new ObjectInputStream(file);){
            Person per = (Person) in.readObject();
            System.out.println(per.getFirstname() + per.getLastname());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
