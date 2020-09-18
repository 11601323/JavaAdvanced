package be.pxl.java.fileIO.PhoneOef2;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
    public static void main(String[] args) {
        System.out.println(Dier.valueOf("VARKEN"));

        List<String> list = new ArrayList<>();
        list.add("Hallo");
        list.add("Hallo");
        list.add("Test");

        System.out.println(list.stream().distinct().count());
    }
}
