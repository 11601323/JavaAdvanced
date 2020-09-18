package be.pxl.java.collections.Oefening1Juiste;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Player {
    private String name;
    private Set<Card> hand = new TreeSet<>();


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public boolean hasSuit(Suit suit){

        return hand.stream().anyMatch(s -> s.getSuit() == suit);
    }

    @Override
    public String toString() {
        return hand.stream()
                .map(Card::toString) // map gaat de tostring van elke Kaart steeds uitvoeren
                .reduce("",(kaarten, nieuweKaart) -> kaarten +  nieuweKaart + "\n"); //deze toString() wordt dan steeds aan elkaar geplakt met een enter
    }
}
