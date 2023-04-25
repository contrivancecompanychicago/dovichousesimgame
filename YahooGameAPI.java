import com.yahoo.fantasy.api.GameAPI;

public class YahooGameAPI extends Explorer {

    public static void main(String[] args) {
        // Create a new instance of the GameAPI class.
        GameAPI gameAPI = new GameAPI();

        // Call the getGame() method with the desired game_key.
        Game game = gameAPI.getGame("nfl");

        // Check the returned Game object for the desired information.
        System.out.println("Game name: " + game.getName());
        System.out.println("Yahoo! game code: " + game.getGameCode());
        System.out.println("Season: " + game.getSeason());
    }
}
