package be.pxl.java.lambda.Oefening2Juist;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class GameCollection {
    private ArrayList<VideoGame> videoGames = new ArrayList<>();

    public void addGame(VideoGame videoGame){
        videoGames.add(videoGame);
    }

    public ArrayList<VideoGame> selectGames(VideoGameFilter videoGameFilter){
        ArrayList<VideoGame> geselecteerdeGames = new ArrayList<>();
        for(VideoGame videoGame : videoGames){
            if(videoGameFilter.isValid(videoGame)){
                geselecteerdeGames.add(videoGame);
            }
        }
        return geselecteerdeGames;
    }

    public ArrayList<VideoGame> kiesGames(Predicate<VideoGame> filter){
        ArrayList<VideoGame> geselecteerdeGames = new ArrayList<>();
        for(VideoGame videoGame : videoGames){
            if(filter.test(videoGame)){
                geselecteerdeGames.add(videoGame);
            }
        }
        return geselecteerdeGames;
    }

    public String printGames(Function<String,String> processor){
        String games = "";
        for(VideoGame videoGame : videoGames){
           games += processor.apply(videoGame.getName());
        }
        return games;
    }

}
