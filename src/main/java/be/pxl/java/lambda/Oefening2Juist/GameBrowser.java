package be.pxl.java.lambda.Oefening2Juist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Consumer;

public class GameBrowser {
    private GameCollection gameCollection;

    public GameBrowser(GameCollection gameCollection) {
        this.gameCollection = gameCollection;
    }

    public ArrayList<VideoGame> showGamesForSearch(String search){
        return gameCollection.selectGames(new VideoGameFilter() {
            @Override
            public boolean isValid(VideoGame game) {
                return game.getName().toLowerCase().equals(search.toLowerCase());
            }
        });
    }

    public ArrayList<VideoGame> showFreeGames(){
        return gameCollection.selectGames(g -> g.getPrice() == 0);
    }

    public ArrayList<VideoGame> showGamesInGenre(String search){
        return gameCollection.selectGames(g -> g.getGenres().contains(search.toLowerCase()));
    }

    public ArrayList<VideoGame> showGamesPred(){
        return gameCollection.kiesGames(g -> g.getPrice() ==0);
    }

    public String printGamesFunction(){
        return gameCollection.printGames(g -> String.format("<<%s>>", g));
    }

}
