package eu.unipv.zanussi.fdi2.shapes;

public class Shapes {

    public float getSumAreas(Shape2D[] shapes) {
        float sum = 0;

        // DO NOT USE INSTANCEOF
        /*for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Rectangle)
                sum += shapes[i].getArea();
            else if (shapes[i] instanceof Circle)
                sum += shapes[i].getArea();
        }*/

        for (int i = 0; i < shapes.length; i++)
            sum += shapes[i].getArea();

        // can also be made with "Shape2D x : shapes"

        return sum;
    }

}
