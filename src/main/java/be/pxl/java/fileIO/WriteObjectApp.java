package be.pxl.java.fileIO;

import java.io.*;
import java.time.LocalDateTime;

public class WriteObjectApp {
    public static void main(String[] args) {
        String text = new String("This is some text");
        LocalDateTime date = LocalDateTime.now();

        try (FileOutputStream file = new FileOutputStream("Myfile.ser");
             ObjectOutputStream out = new ObjectOutputStream(file)){
            out.writeObject(text);
            out.writeObject(date);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
