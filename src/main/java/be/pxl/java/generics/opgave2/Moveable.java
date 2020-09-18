package be.pxl.java.generics.opgave2;

public interface Moveable <T> {
    public void move(T Location);

     T getCurrentLocation();
}
