package be.pxl.java.collections.Oefening2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Portomonee {
    private Map<Coin, Integer> inhoud = new LinkedHashMap<>();

    public void addCoin(Coin coin, int aantal){
        if(inhoud.get(coin) != null){
            inhoud.put(coin, inhoud.get(coin) + aantal);
        }
        else {
            inhoud.put(coin, aantal);
        }

    }

    public void deleteCoin(Coin coin, int aantal){
        if(inhoud.get(coin) != null){
            inhoud.put(coin, inhoud.get(coin) - aantal);
        }
        else {
            inhoud.put(coin, aantal);
        }
    }

    public double totaalWaarde(){
        double totaal = 0;
        for(Coin c : inhoud.keySet()){
            totaal += c.getWaarde() * inhoud.get(c);
        }
        return totaal;
    }

    @Override
    public String toString() {
        String output = "";
        for(Coin c : inhoud.keySet()){
            output += c.name() + " " + inhoud.get(c) + "\n";
        }
        return output;
    }
}
