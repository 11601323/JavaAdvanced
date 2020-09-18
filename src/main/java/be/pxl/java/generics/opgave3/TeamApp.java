package be.pxl.java.generics.opgave3;

public class TeamApp {
    public static void main(String[] args) {
        Team<VolleybalPlayer> volleybalTeam = new Team<>("VolleybalTeam1");
        volleybalTeam.addPlayer(new VolleybalPlayer("Stef"));

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("SoccerTeam1");
        soccerPlayerTeam.addPlayer(new SoccerPlayer("Tom"));

        Team<VolleybalPlayer> volleybalTeam2 = new Team<>("VolleybalTeam2");
        System.out.println(volleybalTeam2.getName());


        volleybalTeam.matchResult(volleybalTeam2, 5, 4);

        System.out.println("Aantal gewonnen wedstrijden team 1: " + volleybalTeam.getWon() + "   Aantal verloren wedstrijden team 2: " + volleybalTeam2.getLost());
        System.out.println("Aantal punten team 1: " + volleybalTeam.ranking() + "   Aantal punten team 2: " + volleybalTeam2.ranking());
    }
}
