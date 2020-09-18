package be.pxl.java.collections.Oefening1Juiste;

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
    public int compareTo(Card otherCard) {
        int thisCardValue = value.ordinal();
        int otherCardValue = otherCard.value.ordinal();
        int thisCardSuit = suit.ordinal();
        int otherCardSuit = otherCard.getSuit().ordinal();

        if (thisCardSuit > otherCardSuit // dus thisCardSuit(0 --> Hearts) otherCardSuit(1 --> Diamonds) --> this.Cardsuit gaat hoger liggen
                || (thisCardSuit == otherCardSuit && thisCardValue > otherCardValue)) {
            return 1;
        } else if (thisCardSuit < otherCardSuit
                || (thisCardSuit == otherCardSuit && thisCardValue < otherCardValue)) {
            return -1;
        } else {
            return 0;
        }

        // -1 = andere kaart LAGER plaatsen
        //  0 = andere kaart NIET plaatsen
        //  1 = andere kaart HOGER plaatsen

    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
