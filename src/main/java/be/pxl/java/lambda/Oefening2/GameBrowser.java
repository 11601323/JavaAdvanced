package be.pxl.java.lambda.Oefening2;

import java.util.ArrayList;

public class GameBrowser {
    private GameCollection gameCollection;

    public GameBrowser(GameCollection gameCollection) {
        this.gameCollection = gameCollection;
    }

    public ArrayList<VideoGame> showGamesForSearch(String search){
        class Filter implements GameFilter {
            @Override
            public boolean isValid(VideoGame game) {
                return game.getName().toLowerCase().contains(search.toLowerCase());
            }
        }
        Filter filter = new Filter();
        return gameCollection.selectGames(filter);
    }

    public ArrayList<VideoGame> showFreegames(){
        return gameCollection.selectGames(game -> game.getPrice() == 0);
    }

    public ArrayList<VideoGame> showGamesInGenre(String genre){
        return gameCollection.selectGames(game -> game.getGenres().contains(genre.toLowerCase()));
    }
}
