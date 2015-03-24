package game.model;

import org.jetbrains.annotations.NotNull;

public class WordMatch implements Comparable<WordMatch> {

    private String word;

    public WordMatch(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public int getPoints() {
        int pts = 0;
        for (char c : word.toCharArray()) {
            if (c == 'q') pts += 3;
            else if (c == 'z' || c == 'h') pts += 2;
            else pts++;
        }
        return pts;
    }

    @Override
    public int compareTo(@NotNull WordMatch that) {
        return this.getPoints() - that.getPoints();
    }

    @Override
    public int hashCode() {
        return word.hashCode();
    }

}
