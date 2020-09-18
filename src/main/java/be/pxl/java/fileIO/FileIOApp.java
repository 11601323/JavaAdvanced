package be.pxl.java.fileIO;





import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIOApp {
    public static void main(String[] args) throws IOException{
        //Path --------------------
        Path p1 = Paths.get("C:\\pata");
        Path p2 = p1.resolve("folder1");
        Path p3 = p2.resolve("file1.txt");//resolve voegt dit aan het path toe

        System.out.println(p3);
        System.out.println();

        Path p4 = Paths.get("file2.txt");
        System.out.println(p4.toAbsolutePath());
        System.out.println();
        //System.out.println(p4.toRealPath());

        Path p5 = Paths.get("C:\\data\\subfolder1\\file1.txt");
        Path p6 = Paths.get("C:\\data\\subfolder1\\file3.txt");
        Path p7 = p5.relativize(p6); // zoekt het relative path ten opzichten van het opgegeven path
        System.out.println(p7);
        System.out.println();

        Path path = Paths.get("C:\\data\\subfolder1\\file1.txt");
        System.out.println(path.getRoot() + "     root".toUpperCase());
        System.out.println(path.getFileName() + "      filename".toUpperCase());
        System.out.println(path.getParent() + "    parent".toUpperCase());
        System.out.println();

        System.out.println("Elk mapje afprinten van het path:");
        for(Path p: path){
            System.out.println(p);
        }
        System.out.println();

        //File system ----------------------
        FileSystem fs = FileSystems.getDefault();
        System.out.println(fs.getSeparator()); //print het scheidingsteken af
        for(Path p : fs.getRootDirectories()){
            System.out.println(p); //print alle root directories af

        }
        System.out.println();




    }
}
