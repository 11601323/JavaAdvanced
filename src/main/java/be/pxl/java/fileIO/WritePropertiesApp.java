package be.pxl.java.fileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesApp {
    public static void main(String[] args) {
        try(FileOutputStream out = new FileOutputStream("Application.properties");){ //properties bestand aanmaken
            Properties atts = new Properties(); //properties instellen
            atts.setProperty("Attribute1", "Value1");
            atts.setProperty("Attribute2", "Value2");
            atts.setProperty("Attribute3", "Value3");
            atts.store(out, "Application properties"); //properties wegschrijven naar bestand




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
