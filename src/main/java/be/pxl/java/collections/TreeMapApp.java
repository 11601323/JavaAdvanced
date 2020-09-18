package be.pxl.java.collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapApp {
    public static void main(String[] args) {
        SortedMap<String, Dossier> dossiers = new TreeMap<>();
        dossiers.put("John", new Dossier("Nice Guy"));
        dossiers.put("Ellen", new Dossier("Goodlooking Woman"));
        dossiers.put("Sue", new Dossier("Mother of 4 children"));

        System.out.println(dossiers.get(dossiers.firstKey()));
        System.out.println(dossiers.get(dossiers.lastKey()));

    }
}
