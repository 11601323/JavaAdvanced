package be.pxl.java.fileIO;

import javax.annotation.processing.Filer;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Opdracht4PerLijnUItlezen {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("resources\\Opdracht4File.txt");
        if(Files.exists(path)){
            System.out.println("File bestaat al");
        }
        else {
            Files.createFile(path);
        }

        System.out.println();
        try(FileWriter writer = new FileWriter("resources\\Opdracht4File.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer)){
            bufferedWriter.write("Opdracht 4");
            bufferedWriter.newLine();
            bufferedWriter.write("Tweede zin");
        } catch (IOException e) {
            e.printStackTrace();
        }


        try(FileReader reader = new FileReader("resources\\Opdracht4File.txt");
            BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
