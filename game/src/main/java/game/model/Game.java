package game.model;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Game logic and model
 */
public class Game {

    GameGrid gridModel;
    SortedSet<WordMatch> matches = new TreeSet<WordMatch>();

    public Game(GameGrid gridModel) {
        this.gridModel = gridModel;
    }

    public GameGrid getGridModel() {
        return gridModel;
    }

    public SortedSet<WordMatch> getMatches() {
        return matches;
    }

    public boolean takeWord(String word) {
        boolean found = gridModel.findWord(word);
        if (found) matches.add(new WordMatch(word));
        return found;
    }

    public int getPointsCount() {
        int count = 0;
        for (WordMatch match : matches)
            count += match.getPoints();
        return count;
    }

}
