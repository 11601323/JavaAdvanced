package be.pxl.java.collections;

public enum Coin {
    CENT1 (0.01), CENT2(0.02), CENT5(0.05), CENT10(0.10), CENT20(0.20), CENT50(0.50), EURO1(1), EURO2(2);

    private double waarde;

    Coin(double waarde) {
        this.waarde = waarde;
    }

    public double getWaarde() {
        return waarde;
    }
}
