package game;

import game.gui.MainView;

public class Application {

    public static void main(String[] args) {
        MainView.initializeLookAndFeel();
        new GameController(new MainView("The Game"));
    }

}
