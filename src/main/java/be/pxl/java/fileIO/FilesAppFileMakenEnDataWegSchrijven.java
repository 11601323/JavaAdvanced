package be.pxl.java.fileIO;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.DosFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FilesAppFileMakenEnDataWegSchrijven {
    public static void main(String[] args) {
        System.out.println("---------Files----------------");
        try{
            //define path
            Path path = Paths.get("C:\\pata\\folder\\file.txt");
            //create parent directories
            Files.createDirectories(path.getParent());
            //create if not exist
            if(Files.notExists(path)){
                Files.createFile(path);
                System.out.println("File created");
            }
            else{
                System.out.println("File allready exists");
            }

            //write lines off text to file
            List<String> lines = new ArrayList<>();
            lines.add("Hello");
            lines.add("World");
            Files.write(path, lines, Charset.forName("UTF-8"), StandardOpenOption.APPEND);

            System.out.println(Files.readAllLines(path));
            //retrieve attributes of file
            DosFileAttributes attrs = Files.readAttributes(path, DosFileAttributes.class);

            System.out.println(attrs.size());
            System.out.println(attrs.creationTime());
            System.out.println(attrs.lastAccessTime());
            System.out.println(attrs.lastModifiedTime());
            System.out.println(attrs.isArchive());
            System.out.println(attrs.isHidden());
            System.out.println(attrs.isReadOnly());
            System.out.println(Files.getOwner(path));
            //read lines of text from file
            Files.lines(path).forEach(System.out::println);

            //binaire gegevens schrijven en lezen naar bestand
            /*byte[] bytes = {1,2,3};
            Files.write(path,bytes);
            byte[] bytes2 = Files.readAllBytes(path);
            for(byte byt : bytes2){
                System.out.println(byt);
            }*/

            //copy file
            Path path2 = Paths.get("C:\\pata\\folder\\file_copy.txt");
            Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);

            //rename file of move file
            Path path3 = Paths.get("C:\\pata\\folder\\file_copy_move.txt");
            Files.move(path2, path3);

            //Delete file
            Files.deleteIfExists(path);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
