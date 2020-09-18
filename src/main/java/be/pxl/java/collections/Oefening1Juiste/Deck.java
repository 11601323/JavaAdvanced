package be.pxl.java.collections.Oefening1Juiste;

import java.util.*;

public class Deck {
    private Queue<Card> cards = new ArrayDeque<>();

    public Deck() {
        List<Card> list = new ArrayList<Card>();
        for(Suit suit : Suit.values()){
            for(Value value: Value.values()){
                list.add(new Card(suit,value));
            }
        }
        Collections.shuffle(list);
        cards.addAll(list);
    }

    public Card dealCard(){
        return cards.poll();
    }

    public int getSize(){
        return cards.size();
    }

    @Override
    public String toString() {
        return cards.stream()
                .map(Card::toString) // map gaat de tostring van elke Kaart steeds uitvoeren
                .reduce("",(kaarten, nieuweKaart) -> kaarten +  nieuweKaart + "\n"); //deze toString() wordt dan steeds aan elkaar geplakt met een enter
    }
}
