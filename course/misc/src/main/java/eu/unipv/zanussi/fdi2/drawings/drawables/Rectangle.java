package eu.unipv.zanussi.fdi2.drawings.drawables;

import eu.unipv.zanussi.fdi2.drawings.Drawable;

import java.awt.*;

/**
 * Rectangle implementation fo {@link Drawable}.
 */
public class Rectangle implements Drawable {

    private int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.fillRect(x, y, width, height);
    }
    
}
