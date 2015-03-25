public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket game finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket game initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket game started. Enjoy the game!");
    }

}
