package eu.unipv.zanussi.fdi2.drawings;

import java.awt.*;

/**
 * Drawable element inferface.
 */
public interface Drawable {

    /**
     * Draws this drawable element to the given canvas.
     * @param g The 2D graphics canvas
     */
    void draw(Graphics g);

}
