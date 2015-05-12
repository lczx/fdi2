package eu.unipv.zanussi.fdi2.drawings;

import eu.unipv.zanussi.fdi2.drawings.drawables.Circle;
import eu.unipv.zanussi.fdi2.drawings.drawables.ColoredDrawable;
import eu.unipv.zanussi.fdi2.drawings.drawables.CompositeDrawable;
import eu.unipv.zanussi.fdi2.drawings.drawables.Rectangle;

import java.awt.*;


public class DrawablesTest {

    public static void main(String[] args) {
        DrawingsFrame f1 = new DrawingsFrame(new Rectangle(10, 10, 100, 100));
        f1.launchFrame();

        DrawingsFrame f2 = new DrawingsFrame(new Circle(100, 100, 50));
        f2.launchFrame();

        DrawingsFrame f3 = new DrawingsFrame(new CompositeDrawable(
                new Rectangle(10, 10, 50, 50),
                new Rectangle(110, 10, 50, 50),
                new Circle(200, 200, 50)
                // can also pass an array instead of vararg!
        ));
        f3.launchFrame();

        DrawingsFrame f4 = new DrawingsFrame(new CompositeDrawable(
                new ColoredDrawable(new Rectangle(10, 10, 50, 50), Color.GREEN),
                new ColoredDrawable(new Circle(200, 200, 50), Color.ORANGE),
                new Rectangle(110, 10, 50, 50) // HAHA PREVIOUS COLOR
        ));
        f4.launchFrame();
    }

}
