package be.pxl.java.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Opdracht4App {
    public static void main(String[] args) {
        try(BufferedWriter file = new BufferedWriter(new FileWriter("file.txt"))){
            file.write("Eerste zin");
            file.write("Tweede zin");
            Path path = Paths.get("file.txt");
            System.out.println(Files.readAllLines(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
