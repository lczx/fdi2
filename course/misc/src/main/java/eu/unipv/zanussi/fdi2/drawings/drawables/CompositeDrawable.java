package eu.unipv.zanussi.fdi2.drawings.drawables;

import eu.unipv.zanussi.fdi2.drawings.Drawable;

import java.awt.*;

/**
 * Composes multiple {@link Drawable drawables} in a single canvas.
 */
public class CompositeDrawable implements Drawable {

    private Drawable[] drawables;

    public CompositeDrawable(Drawable... drawables) {
        // Using '...' instead of '[]' so we can pass not only arrays but also varargs.
        this.drawables = drawables;
    }

    @Override
    public void draw(Graphics g) {
        for (Drawable d : drawables) d.draw(g);
    }

}
