package be.pxl.java.generics;

public class DuoApp {
    public static void main(String[] args) {
        Duo<String> sd = new Duo<String>("Hello", "World");
        Duo<Integer> id = new Duo<>(7,5);

        String s1 = sd.getFirst();
        String s2 = sd.getSecond();

        Integer i1 = id.getFirst();
        Integer i2 = id.getSecond();
    }
}
