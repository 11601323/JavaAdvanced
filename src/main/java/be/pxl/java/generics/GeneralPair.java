package be.pxl.java.generics;

public class GeneralPair<E> implements Pair<E> {

    //Implementeren van een geniereke interface waarbij het datatype pas bepaalt wordt bij het maken van een instantie
    private E left;
    private E Right;

    public GeneralPair(E left, E right) {
        this.left = left;
        Right = right;
    }

    @Override
    public E getLeft() {
        return null;
    }

    @Override
    public E getRight() {
        return null;
    }

    @Override
    public void setLeft(E left) {

    }

    @Override
    public void setRight(E right) {

    }
}
