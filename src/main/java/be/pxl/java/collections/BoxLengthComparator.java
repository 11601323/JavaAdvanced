package be.pxl.java.collections;

import java.util.Comparator;

public class BoxLengthComparator implements Comparator<Box> {
    @Override
    public int compare(Box box1, Box box2) {
        return box1.getLength() - box2.getLength();
    }
}
