package be.pxl.java.generics;

public class ComparableDuoApp {
    public static void main(String[] args) {
        ComparableDuo<Integer> cd1 = new ComparableDuo<>(4,3);
        System.out.println(cd1.getHighest());
    }
}
