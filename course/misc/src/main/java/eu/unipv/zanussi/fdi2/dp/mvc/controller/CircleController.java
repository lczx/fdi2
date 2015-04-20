package eu.unipv.zanussi.fdi2.dp.mvc.controller;

import eu.unipv.zanussi.fdi2.dp.mvc.model.Circle;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class CircleController implements MouseListener, MouseMotionListener {

    private Circle circle;
    private boolean dragging;

    private int dragDeltaX, dragDeltaY;

    public CircleController(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();

        int x = circle.getX();
        int y = circle.getY();
        int ray = circle.getRay();

        int dx = mouseX - x;
        int dy = mouseY - y;

        if (dx * dx + dy * dy <= ray * ray) {
            this.dragDeltaX = dx;
            this.dragDeltaY = dy;
            dragging = true;
        } else
            dragging = false;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();

        if (dragging) { // This activates 'Observable'
            circle.setX(mouseX - dragDeltaX);
            circle.setY(mouseY - dragDeltaY);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // ----- OUR CODE -----
        if (dragging) circle.randomizeColor();
        // ----- END OUR CODE -----
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
