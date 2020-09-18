package be.pxl.java.fileIO.PhoneOef2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class testStriker {
    public static void main(String[] args) {
        Striker striker = new Striker(50);
        Striker striker2 = new Striker(70);
        Striker striker3 = new Striker(90);

        List<Striker> list = new ArrayList<>();
        list.add(striker);
        list.add(striker2);
        list.add(striker3);

        list.stream().sorted(Comparator.comparing(Striker::getFinish).reversed()).map(s -> s.getFinish()).limit(2).forEach(System.out::println);
        list.stream().filter(s -> s.getFinish() > 40 && s.getFinish() < 70 ).map(s -> s.getFinish()).forEach(System.out::println);
    }
}
