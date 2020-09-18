package be.pxl.java.generics.Opdracht2;

public class Elephant implements Moveable<Location> {
    private Location plaats;

    @Override
    public void move(Location location) {
        plaats = location;
    }

    @Override
    public Location getCurrentLocation() {
       return plaats;
    }
}
