package game.model;

import java.util.Random;

public class RandomCharGrid extends GameGrid {

    public static final String VOCALS = "aeiou";

    private static boolean isVocal(char c) {
        return VOCALS.indexOf(c) != -1;
    }

    public RandomCharGrid(int width, int height) {
        super(width, height);
    }

    @Override
    protected void populateGrid() {
        // 100% dead loops and hassle free!
        Random r = new Random();

        for (int y = 0; y < getRowCount(); y++) {
            for (int x = 0; x < getColumnCount(); x++) {
                char c;
                do { // Find a non-vocal char
                    c = (char) ('a' + r.nextInt(26));
                } while (isVocal(c));

                // 'c' is not a vocal
                data[y][x] = c;
            }
        }

        // Vocals count between [45, w * h)
        int vocalsCount = 45 + r.nextInt(getRowCount() * getColumnCount() - 45);
        for (int i = 0; i < vocalsCount; i++) {
            int x, y;
            do { // Find a non vocal place in the grid
                x = r.nextInt(getColumnCount());
                y = r.nextInt(getRowCount());
            } while (isVocal(data[y][x]));

            data[y][x] = VOCALS.charAt(r.nextInt(VOCALS.length()));
        }
    }

}
