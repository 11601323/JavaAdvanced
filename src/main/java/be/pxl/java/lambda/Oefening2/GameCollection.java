package be.pxl.java.lambda.Oefening2;

import java.util.ArrayList;

public class GameCollection {
    private ArrayList<VideoGame> videoGames = new ArrayList<>();

    public void addGame(VideoGame game){
        videoGames.add(game);
    }

    public ArrayList<VideoGame> selectGames(GameFilter gameFilter){
        ArrayList<VideoGame> filteredGames = new ArrayList<>();
        for(VideoGame videoGame : videoGames){
            if(gameFilter.isValid(videoGame)){
                filteredGames.add(videoGame);
            }
        }
        return filteredGames;
    }
}
