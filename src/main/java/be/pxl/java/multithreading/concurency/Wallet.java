package be.pxl.java.multithreading.concurency;

import be.pxl.java.collections.Coin;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Wallet {
    public static void main(String[] args) {
        Map<Coin, Integer> wall =  new LinkedHashMap();
        Map<Coin,Integer> wallet = Collections.synchronizedMap(wall);
        wallet.put(Coin.CENT1, 2);
        wallet.put(Coin.CENT2, 3);
        wallet.put(Coin.CENT5, 8);
        wallet.put(Coin.CENT10, 1);
        wallet.put(Coin.CENT20, 0);
        wallet.put(Coin.CENT50, 9);
        wallet.put(Coin.EURO1, 7);
        wallet.put(Coin.EURO2, 1);

        int sum = 0;
        for(Coin c: wallet.keySet()){
            System.out.println(c.name() + " : " + wallet.get(c));
            sum += c.getWaarde() * wallet.get(c);
        }

        System.out.println((sum) +"€");
    }
}
