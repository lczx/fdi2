package eu.unipv.zanussi.fdi2.drawings.drawables;

import eu.unipv.zanussi.fdi2.drawings.Drawable;

import java.awt.*;

/**
 * Allows to color a {@link Drawable} object.
 * Note: this works with every 'Drawable'.
 */
public class ColoredDrawable implements Drawable {

    private Drawable drawable;
    private Color color;

    public ColoredDrawable(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        drawable.draw(g);
    }

}
