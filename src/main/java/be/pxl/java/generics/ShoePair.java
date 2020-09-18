package be.pxl.java.generics;

public class ShoePair implements Pair<Shoe> {

    //dus een implementatie van een generieke interface waarbij het datatype bepaalt wordt in de klasse!
    private Shoe leftShoe;
    private  Shoe rightShoe;

    public ShoePair(Shoe leftShoe, Shoe rightShoe) {
        this.leftShoe = leftShoe;
        this.rightShoe = rightShoe;
    }

    @Override
    public Shoe getLeft() {
        return null;
    }

    @Override
    public Shoe getRight() {
        return null;
    }

    @Override
    public void setLeft(Shoe left) {

    }

    @Override
    public void setRight(Shoe right) {

    }
}
