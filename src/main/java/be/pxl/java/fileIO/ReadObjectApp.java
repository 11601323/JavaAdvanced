package be.pxl.java.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDateTime;

public class ReadObjectApp {
    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream("Myfile.ser");
             ObjectInputStream in = new ObjectInputStream(file);){

            String text = (String) in.readObject();
            LocalDateTime date = (LocalDateTime) in.readObject();

            System.out.println(text);
            System.out.printf("%td/%<tm/%<tY %<tH:%<tM:%<tS%n",date);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
