package be.pxl.java.fileIO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class Opdracht5ByteStream {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Give String");
        String input = keyboard.nextLine();

        try(PrintStream ps = new PrintStream(new DeflaterOutputStream(new FileOutputStream("tempfile")))){
            ps.print(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        try(InputStreamReader is = new InputStreamReader(new InflaterInputStream(new FileInputStream("tempfile")))) {
            System.out.println("Print text from file:");
            System.out.println(is.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
