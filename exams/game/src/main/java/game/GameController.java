package game;

import game.gui.GameUIListener;
import game.gui.MainView;
import game.io.GameModelWriter;
import game.model.Game;
import game.model.GameProvider;

import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class GameController implements GameUIListener {

    public static final int GAME_LENGTH_MILLISECONDS = 10000;

    MainView view;
    Game game;
    Timer currentTimer;

    public GameController(MainView view) {
        this.view = view;
        view.addGameListener(this);
    }

    @Override
    public void startNewGame() {
        game = GameProvider.newGame();

        view.setGameRunning(true);
        view.setGridModel(game.getGridModel());
        view.setStatusMessage(MainView.GUI_TEXT_EMPTY);

        if (currentTimer != null) currentTimer.cancel();
        currentTimer = new Timer();
        currentTimer.schedule(new TimerTask() {
            public void run() { endCurrentGame(); }
        }, GAME_LENGTH_MILLISECONDS);
    }

    @Override
    public void processWord(String word) {
        if (game == null) return;
        view.setStatusMessage(game.takeWord(word) ?
            MainView.GUI_TEXT_SUCCESS : MainView.GUI_TEXT_FAILURE);
        view.selectInputText();
    }

    @Override
    public void saveResultsToFile(File file) {
        try {
            GameModelWriter writer = new GameModelWriter(file);
            writer.writeModel(game);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void endCurrentGame() {
        int points = game.getPointsCount();
        view.setGameRunning(false);
        view.setStatusMessage(String.format(MainView.GUI_TEXT_RESULTS, points));
    }
}
