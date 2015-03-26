import factory.AbstractFactory;
import colors.Color;
import shapes.Shape;

public class Pattern {

    public static void main(String[] args) {
        AbstractFactory sf = FactoryProducer.getFactory("shape");

        Shape shape1 = sf.getShape("circle");
        shape1.draw();

        Shape shape2 = sf.getShape("rectangle");
        shape2.draw();

        Shape shape3 = sf.getShape("square");
        shape3.draw();

        AbstractFactory cf = FactoryProducer.getFactory("color");

        Color color1 = cf.getColor("red");
        color1.fill();

        Color color2 = cf.getColor("green");
        color2.fill();

        Color color3 = cf.getColor("blue");
        color3.fill();
    }

}
