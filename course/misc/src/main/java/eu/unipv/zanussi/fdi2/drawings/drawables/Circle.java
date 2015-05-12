package eu.unipv.zanussi.fdi2.drawings.drawables;

import eu.unipv.zanussi.fdi2.drawings.Drawable;

import java.awt.*;

/**
 * Circle implementation of {@link Drawable}.
 */
public class Circle implements Drawable {

    private int x, y, ray;

    public Circle(int x, int y, int ray) {
        this.x = x;
        this.y = y;
        this.ray = ray;
    }

    @Override
    public void draw(Graphics g) {
        g.fillOval(x - ray, y - ray, ray << 1, ray << 1);
    }

}
