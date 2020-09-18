package be.pxl.java.generics.Opdracht3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    private int played;
    private int won;
    private int lost;
    private int tied;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addPlayer(T player){
        members.add(player);
    }

    public int numberOfPlayers(){
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        if(ourScore > theirScore){
            opponent.lost++;
            this.won++;
        }
        else if(ourScore == theirScore){
            opponent.tied++;
            this.tied++;
        }
        else{
            opponent.won++;
            this.lost++;
        }
    }

    public int ranking(){
        return (won*3) + tied;
    }

    public String getName() {
        return name;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    public ArrayList<T> getMembers() {
        return members;
    }

}
