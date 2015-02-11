package gui;

import java.io.File;

// May use this later
public interface GameUIListener {

    public void startNewGame();

    public void processWord(String word);

    public void saveResultsToFile(File file);

}
