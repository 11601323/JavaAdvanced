package be.pxl.java.collections.oefening1;

import java.util.Set;
import java.util.TreeSet;

public class Player {
    private Set<Card> hand;
    private String name;

    public Set<Card> getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
        hand = new TreeSet<>();
    }
    public void addCard(Card card){
        hand.add(card);
    }
    public boolean hasSuit(Suit suit){
        if(hand.stream().filter(card -> card.getSuit() == suit).count() > 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        String mijnKaarten = "";
        for(Card card : hand){
            mijnKaarten += card.getValue() + " of " + card.getSuit() + "\t";
        }
        return mijnKaarten;
    }
}
