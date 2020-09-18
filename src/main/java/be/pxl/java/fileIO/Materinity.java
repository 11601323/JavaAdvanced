package be.pxl.java.fileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Month;

import static java.time.LocalDate.*;


public class Materinity {
    public static void main(String[] args) {
        Person per = new Person("Tom", "Vanbriel",  LocalDate.of(1997,4,4));
        try(FileOutputStream file = new FileOutputStream(per.getFirstname() + per.getLastname());
            ObjectOutputStream out = new ObjectOutputStream(file);){
            out.writeObject(per);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
