package be.pxl.java.lambda.Oefening2Juist;

public class GamesApp {
    public static void main(String[] args) {
        VideoGame fifa = new VideoGame("Fifa", 5, 9, new String[]{"Sport"} );
        VideoGame Basket = new VideoGame("Basket", 5, 9, new String[]{"Sport"} );
        VideoGame valorant = new VideoGame("Valorant", 0, 9, new String[]{"Schooter","Sciencefiction"});

        GameCollection gameCollection = new GameCollection();
        gameCollection.addGame(fifa);
        gameCollection.addGame(Basket);
        gameCollection.addGame(valorant);

        GameBrowser gameBrowser = new GameBrowser(gameCollection);

        System.out.println(gameBrowser.showGamesForSearch("Fifa"));
        System.out.println(gameBrowser.showFreeGames());
        System.out.println(gameBrowser.showGamesInGenre("Sport"));
        System.out.println(gameBrowser.showGamesPred());
        System.out.println(gameBrowser.printGamesFunction());
    }
}
