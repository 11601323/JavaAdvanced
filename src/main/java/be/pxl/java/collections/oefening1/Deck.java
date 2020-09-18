package be.pxl.java.collections.oefening1;

import java.util.*;

public class Deck {
    private Queue<Card> cards = new LinkedList<>();



    public Deck() {
        ArrayList<Card> kaarten = new ArrayList<>();
        for(Suit suit : Suit.values()){
            for(Value value : Value.values()) {
                kaarten.add(new Card(suit,value));
            }
        }
        Collections.shuffle(kaarten);
        cards.addAll(kaarten);
    }

    public Card dealCard(){
        return cards.poll();
    }
    public int getSize(){
        return cards.size();
    }
    @Override
    public String toString() {
        String kaarten = "";
        for(Card card : cards){
            kaarten += card.getValue() + " of " + card.getSuit() + "\t";
        }
        return kaarten;
    }
}
