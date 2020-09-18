package be.pxl.java.fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileApp {
    public static void main(String[] args) {
        //FileReeader (per character afdrukken)
        try (FileReader file = new FileReader("MyFile.txt")){
            int character;
            while ((character = file.read()) != -1){
                System.out.println((char) character);
            }
        } catch (IOException ex) {
            System.out.println("Ooops, Something went wrong");
            System.out.println(ex.getMessage());
        }

        //BufferReader (per regel afdrukken)
//        try (FileReader file = new FileReader("MyFile.txt");
//             BufferedReader reader = new BufferedReader(file)){
//            String line = null;
//            while ((line = reader.readLine()) != null){
//                System.out.println(line);
//            }
//        } catch (IOException ex) {
//            System.out.println("Ooops, Something went wrong");
//            System.out.println(ex.getMessage());
//        }

        //andere manier maar korter hier ziet ge dat de filereader ingepakt is in de buffered reader
        Path path = Paths.get("MyFile.txt");
        try (BufferedReader reader = Files.newBufferedReader(path)){
            String line = null;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Ooops, Something went wrong");
            System.out.println(ex.getMessage());
        }
    }
}
