package be.pxl.java.fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Opdracht2AppGegevensNaarBestand {
    public static void main(String[] args) {
        try(FileWriter file = new FileWriter("MyNewFile.txt", true)){
            file.write("Eerste zin");
            file.write("Tweede zin");
            Path path = Paths.get("MyNewFile.txt");
            System.out.println(Files.readAllLines(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
