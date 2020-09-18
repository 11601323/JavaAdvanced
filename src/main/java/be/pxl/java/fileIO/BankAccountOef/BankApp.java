package be.pxl.java.fileIO.BankAccountOef;


import java.io.*;

public class BankApp {
    public static void main(String[] args) {
        Spaarrekening per1 = new Spaarrekening(500,"Tom", "BE54141453");

        try(FileOutputStream file = new FileOutputStream(per1.getNaam());
            ObjectOutputStream out = new ObjectOutputStream(file);){
            out.writeObject(per1);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream file = new FileInputStream(per1.getNaam());
            ObjectInputStream in = new ObjectInputStream(file);){
            Spaarrekening per = (Spaarrekening) in.readObject();
            System.out.println(per.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
