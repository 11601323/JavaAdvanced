package be.pxl.java.fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesApp {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("Application.properties");){
            Properties atts = new Properties();
            atts.load(in);
            atts.list(System.out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
