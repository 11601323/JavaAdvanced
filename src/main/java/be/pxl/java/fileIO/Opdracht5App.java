package be.pxl.java.fileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.zip.DeflaterOutputStream;

public class Opdracht5App {
    public static void main(String[] args) {
        try(PrintStream file = new PrintStream("MyFile.txt");
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream("Myfile.txt")){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
