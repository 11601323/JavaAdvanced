package be.pxl.java.collections.Oefening2;

public class CoinApp  {
    public static void main(String[] args) {
        Portomonee portomonee = new Portomonee();

        portomonee.addCoin(Coin.CENT_1, 5);
        portomonee.addCoin(Coin.CENT_2, 3);
        portomonee.addCoin(Coin.CENT_2, 10);

        System.out.println(portomonee.toString());
        System.out.println(portomonee.totaalWaarde());
    }
}
