package be.pxl.java.lambda.Oefening2;

public class GameApp {
    public static void main(String[] args) {
        VideoGame game1 = new VideoGame("MW2",50, 10, new String[]{"Action", "Schooter"});
        VideoGame game2 = new VideoGame("Fifa",50, 10, new String[]{"Sport"});
        VideoGame game3 = new VideoGame("Valorant",0, 10, new String[]{"Schooter"});
        GameCollection gameCollection = new GameCollection();
        gameCollection.addGame(game1);
        gameCollection.addGame(game2);
        gameCollection.addGame(game3);

        GameBrowser browser = new GameBrowser(gameCollection);
        System.out.println("Search games: ");
        browser.showGamesForSearch("Fifa").forEach(System.out::println);
        System.out.println();
        System.out.println("Free games: ");
        browser.showFreegames().forEach(System.out::println);
        System.out.println();
        System.out.println("Genre games:");
        browser.showGamesInGenre("Schooter").forEach(System.out::println);




    }
}
