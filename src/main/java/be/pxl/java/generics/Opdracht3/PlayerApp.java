package be.pxl.java.generics.Opdracht3;

public class PlayerApp {
    public static void main(String[] args) {
        SoccerPlayer soccerPlayer = new SoccerPlayer("Tom");
        BaseballPlayer baseballPlayer = new BaseballPlayer("Stefan");

        Team<SoccerPlayer> barcelona = new Team<>("Fc Barcelona");
        Team<SoccerPlayer> real = new Team<>("Real Madrid");
        Team<VolleybalPlayer> volleybalPlayerTeam = new Team<>("VolleybalTeam");
        barcelona.addPlayer(soccerPlayer);

        real.matchResult(barcelona, 5,4);

        System.out.println(real.ranking());

    }
}
