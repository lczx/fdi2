package factory;

import colors.*;
import shapes.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null)
            return null;

        if (color.equalsIgnoreCase("red"))
            return new Red();
        else if (color.equalsIgnoreCase("green"))
            return new Green();
        else if (color.equalsIgnoreCase("blue"))
            return new Blue();

        return null;
    }

}
