package be.pxl.java.collections.Oefening2;

public enum Coin {
    CENT_1 (0.01), CENT_2(0.02), CENT_5(0.05), CENT_10(0.10), CENT_20(0.20), CENT_50(0.50), EURO_1(1), EURO_2(2);

    private double waarde;

    Coin(double waarde) {
        this.waarde = waarde;
    }

    public double getWaarde() {
        return waarde;
    }
}
