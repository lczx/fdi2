package game.io;

import game.model.Game;
import game.model.WordMatch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GameModelWriter {

    private FileWriter fw;
    private PrintWriter outStream;

    /*public GameModelWriter(String fileName) throws IOException {
        this(new File(fileName));
    }

    public GameModelWriter(String fileName, boolean append) throws IOException {
        this(new File(fileName), append);
    }*/

    public GameModelWriter(File file) throws IOException {
        this(file, false);
    }

    public GameModelWriter(File file, boolean append) throws IOException {
        fw = new FileWriter(file, append);
        outStream = new PrintWriter(fw);
    }

    public void writeModel(Game game) {
        for (WordMatch w : game.getMatches())
            outStream.println(w.getWord() + '\t' + w.getPoints() + " points");
        outStream.println();
        outStream.println("Total: " + game.getPointsCount());
    }

    public void close() throws IOException {
        outStream.close();
        fw.close();
    }

}
