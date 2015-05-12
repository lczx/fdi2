package eu.unipv.zanussi.fdi2.drawings.drawables;

import eu.unipv.zanussi.fdi2.drawings.Drawable;

import java.awt.*;

/**
 * Label implementation of {@link Drawable}, a fancy (horrible) label.
 */
public class Label implements Drawable {

    private String text;
    private int x, y;

    public Label(String text, int x, int y) {
        this.text = text;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics g) {
        int strWidth = g.getFontMetrics().stringWidth(this.text);

        g.drawRect(x, y, 20 + strWidth, 20);
        g.drawString(text, x + 10, y + 15);
    }

}
