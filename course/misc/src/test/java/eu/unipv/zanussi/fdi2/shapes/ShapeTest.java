package eu.unipv.zanussi.fdi2.shapes;

public class ShapeTest {

    public static void main(String[] args) {
        Shape2D[] sh = new Shape2D[3];

        sh[0] = new Rectangle(1, 1);
        sh[1] = new Rectangle(2, 1);
        sh[2] = new Circle(1);

        Shapes shapes = new Shapes(); // Yeah instance of utility class...
        System.out.println(shapes.getSumAreas(sh));
    }

}
