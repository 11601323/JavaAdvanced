package be.pxl.java.collections;

public class Box implements Comparable<Box> {
    private int width;
    private int length;
    private int height;

    public Box(){

    }
    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume(){
        return width * length * height;
    }

    @Override
    public String toString() {
        return String.format("Box [width=%s, length=%s, height=%s]", width, length, height);
    }

    @Override
    public int compareTo(Box other) {
        return this.getVolume() - other.getVolume();
    }
}
