package be.pxl.java.generics.Opdracht2;

public interface Moveable <T> {
    public void move(T location);
    public T getCurrentLocation();
}
