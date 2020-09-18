package be.pxl.java.collections.oefening1;

public class Card implements Comparable<Card> {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public int compareTo(Card card) {
        return 0;
    }
}
