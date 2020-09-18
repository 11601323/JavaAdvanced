package be.pxl.java.collections.Oefening1Juiste;

//import jdk.swing.interop.SwingInterOpUtils;

public class CardGame {
    public static final int CARDS_TO_ADD = 5;

    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(Suit.HEARTS.ordinal());
        Player player = new Player("Sam");

        System.out.println(deck.dealCard());

        for(int i=0;i<CARDS_TO_ADD;i++) {
            player.addCard(deck.dealCard());
        }

        System.out.println();
        System.out.println(player.getName() + "'s hand:");
        System.out.println(player);

        System.out.println("HEARTS available? " + player.hasSuit(Suit.HEARTS));

        System.out.println("Cards left in deck: " + deck.getSize());
        System.out.println(deck);
    }
}
