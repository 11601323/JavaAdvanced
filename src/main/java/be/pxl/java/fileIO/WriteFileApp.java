package be.pxl.java.fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteFileApp {
    public static void main(String[] args) {
//        FileWriter file = null;
//        try{
//            file = new FileWriter("MyFile.txt");
//            file.write("Hello");
//            file.write("World");
//
//        }catch (IOException ex){
//            System.out.println("Ooops, Something went wrong");
//            System.out.println(ex.getMessage());
//        }
//        finally {
//            try {
//                if(file!= null) file.close();
//            } catch (IOException e) {
//               System.err.println("Error closing file");
//            }
//        }
        try(FileWriter file = new FileWriter("MyFile.txt")){
            file.write("Hello");
            file.write("World");

        }catch (IOException ex){
            System.out.println("Ooops, Something went wrong");
            System.out.println(ex.getMessage());
        }

        //Als het path van de filewriter met Path wordt gemaakt dan moet ge toFile doen
        /*
        Path path = Paths.get("File.txt");
        try {
            FileWriter file2 = new FileWriter(path.toFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

    }
}
