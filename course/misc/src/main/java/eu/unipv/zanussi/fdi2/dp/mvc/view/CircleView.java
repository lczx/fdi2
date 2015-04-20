package eu.unipv.zanussi.fdi2.dp.mvc.view;

import eu.unipv.zanussi.fdi2.dp.mvc.model.Circle;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class CircleView extends JPanel implements Observer {

    private Circle circle;

    public CircleView(Circle circle) {
        this.circle = circle;
        circle.addObserver(this); // This is simple to forget!
        circle.randomizeColor();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Panel cleanup before redraw.

        // ----- MY CODE -----
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(circle.getColor());
        // ----- END MY CODE -----

        int ray = circle.getRay();
        g.fillOval(circle.getX() - ray, circle.getY() - ray, 2 * ray, 2 * ray);
    }

    @Override
    public void update(Observable o, Object arg) {
        // 'update(...)' from Observer, repaint on observed changed
        repaint();
    }

}
