package be.pxl.java.generics;

public class MyNumberDuo<E extends Number> extends Duo<E> {
    //Generieke subklasse van het type Number
    public MyNumberDuo(E first, E second) {
        super(first, second);
    }
}
