package eu.unipv.zanussi.fdi2.dp.mvc.model;

import java.awt.*;
import java.util.Observable;

public class Circle extends Observable {

    private int x, y, ray;

    // ----- MY CODE -----
    private Color color;

    public void randomizeColor() {
        color = new Color((float) Math.random(), (float) Math.random(), (float) Math.random());
        setChanged();
        notifyObservers();
    }

    public Color getColor() {
        return color;
    }
    // ----- END MY CODE -----


    public Circle(int x, int y, int ray) {
        this.x = x;
        this.y = y;
        this.ray = ray;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        setChanged();
        notifyObservers();
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        setChanged();
        notifyObservers();
    }

    public int getRay() {
        return ray;
    }

    public void setRay(int ray) {
        this.ray = ray;
        setChanged();
        notifyObservers();
    }

}
