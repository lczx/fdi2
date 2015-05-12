package eu.unipv.zanussi.fdi2.drawings.drawables;

import eu.unipv.zanussi.fdi2.drawings.Drawable;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Implementation of {@link Drawable} that consists in a highly reusable crosshair
 * pointing to an horizontally enlarged face of Vittorio Ferrari.
 */
public class Crosshair implements Drawable {

    private int x, y;

    public Crosshair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics g_) {
        // Horrible implementation, made on the go...
        Graphics2D g = (Graphics2D) g_;
        g.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );

        g.setColor(new Color(0, 0, 0));
        g.fillOval(x - 50, y - 50, 100, 100);
        try {
            //BufferedImage image = ImageIO.read(new File("common/image.png"));
            BufferedImage image = ImageIO.read(
                    getClass().getClassLoader().getResourceAsStream("image.png"));
            g.drawImage(image, x - 45, y - 45, null);
        } catch (IOException e) {
            System.out.println(System.getProperty("user.dir"));
            System.out.println(e.getLocalizedMessage());
        }
        g.setColor(new Color(255, 255, 255, 50));
        g.fillOval(x - 45, y - 45, 90, 90);

        g.setColor(new Color(0, 0, 0, 100));

        g.setStroke(new BasicStroke(2));
        g.drawLine(x - 45, y, x + 45, y);
        g.drawLine(x, y - 45, x, y + 45);


        for (int i = 1; i < 6; i++)
            g.drawLine(
                    x - 2,          y + 5 + 5 * i,
                    x - 1 + 15 / i, y + 5 + 5 * i);

        for (int i = -6; i <= 6; i++)
            g.drawLine(
                    x + 5 * i, y - ((i % 2) == 0 ? 4 : 2),
                    x + 5 * i, y + ((i % 2) == 0 ? 4 : 2));
    }

}
