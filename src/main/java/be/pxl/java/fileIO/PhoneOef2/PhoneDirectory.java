package be.pxl.java.fileIO.PhoneOef2;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class PhoneDirectory {
    private Path path;
    private Map<String, List<String>> phoneNumbers = new LinkedHashMap();

    public PhoneDirectory(Path path) {
        this.path = path;
    }

    public void fillPhoneDirectory(){

        try(FileReader reader = new FileReader(path.toFile());
            BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                String[] rij = line.split(";");
                phoneNumbers.put(rij[0], Arrays.asList(rij).subList(1,rij.length));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addNumber(String name, String number) throws PhoneDirectoryException {
        List<String> list = new ArrayList<>();
        if(phoneNumbers.keySet().equals(name) && phoneNumbers.get(name).contains(number)){
            throw new PhoneDirectoryException("Nummer bestaat al");
        }
        else if(phoneNumbers.get(name) != null){
            list.addAll(phoneNumbers.get(name));
            list.add(number);
            phoneNumbers.put(name, list);
        }
        else{
            list.add(number);
            phoneNumbers.put(name, list);
        }
    }

    public void writeDataAway(){
        try(FileWriter writer = new FileWriter(path.toFile());
            BufferedWriter bufferedWriter = new BufferedWriter(writer)){
            for(String key : phoneNumbers.keySet()){
                bufferedWriter.write(key);
                for(String number : phoneNumbers.get(key)){
                    bufferedWriter.write(";" + number);
                }
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
