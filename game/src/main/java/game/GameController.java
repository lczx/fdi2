package game;

import game.gui.GameUIListener;
import game.gui.MainView;
import game.model.Game;
import game.model.GameProvider;

import java.io.File;
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
        view.setStatusMessage(MainView.GUITXT_EMPTY);

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
            MainView.GUITXT_SUCCESS : MainView.GUITXT_FAILURE);
        view.selectInputText();
    }

    @Override
    public void saveResultsToFile(File file) {
        // TODO: Add something to save results to file.
    }

    private void endCurrentGame() {
        int points = game.getPointsCount();
        view.setGameRunning(false);
        view.setStatusMessage(String.format(MainView.GUITXT_RESULTS, points));
    }
}
