package game.model;

/**
 * New games generator for dependency injection into {@link game.GameController}.
 */
public class GameProvider {

    public static Game newGame() {
        return new Game(new RandomCharGrid(9, 9));
    }

}
