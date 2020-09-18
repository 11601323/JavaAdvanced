package be.pxl.java.generics.opgave3;

import java.util.ArrayList;

public class Team <T extends Player>{
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private ArrayList<T>  members = new ArrayList<>();

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
            this.won = this.won + 1;
            opponent.lost = opponent.lost + 1;
        }
        else if(ourScore < theirScore){
            this.lost = this.lost + 1;
            opponent.won = opponent.won + 1 ;
        }
        else{
            this.tied = this.tied  + 1;
            opponent.tied = opponent.tied +1;
        }
        this.played ++;
        opponent.played++;
    }
    public int ranking(){
        return  (this.won *3) + this.tied;
    }

}
