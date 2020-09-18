package be.pxl.java.collections.oefening1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CardApp {
    public static final int CARDS_TO_ADD = 5;
    public static void main(String[] args) {
//        ArrayList<Card> kaarten = new ArrayList<>();
//
//        for(Suit suit : Suit.values()){
//            for(Value value : Value.values()) {
//                kaarten.add(new Card(suit,value));
//            }
//        }
//        Collections.shuffle(kaarten);
//        kaarten.forEach(k -> System.out.println(k.getSuit()+ " " + k.getValue()));

        Deck deck = new Deck();

        Player player = new Player("Sam");



        for(int i=0;i<CARDS_TO_ADD;i++) {
            player.addCard(deck.dealCard());
        }
        player.getHand().forEach(c -> System.out.println(c.getValue()));
//        System.out.println(player.toString());
//        System.out.println();
//        System.out.println(player.getName() + "'s hand:");
//        System.out.println(player);
//
//        System.out.println("HEARTS available? " + player.hasSuit(Suit.HEARTS));
//
//        System.out.println("Cards left in deck: " + deck.getSize());
//        System.out.println(deck);
    }
}
