package be.pxl.java.fileIO.phoneOef;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Map<String, List<String>> contacts = new HashMap<>();
        String [] nu = {"1541", "45664"};
        contacts.put("Tom", Arrays.asList(nu));

        contacts.get("Tom").forEach(System.out::println);
        List<String> list = new ArrayList(contacts.get("Tom")); //(List)contacts.get("Tom");
        list.add("1642");
        String[] na = {"1111","1112"};
        contacts.put("Tom", Arrays.asList(na));
        contacts.get("Tom").forEach(System.out::println);
        System.out.println(contacts.size());
    }
}
