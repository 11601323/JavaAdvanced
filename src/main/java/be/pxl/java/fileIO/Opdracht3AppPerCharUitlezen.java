package be.pxl.java.fileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Opdracht3AppPerCharUitlezen {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("file.txt")){
            int charachter;
            while((charachter = fileReader.read()) != -1){
                System.out.println((char) charachter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
