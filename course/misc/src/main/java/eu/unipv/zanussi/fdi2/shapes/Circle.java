package eu.unipv.zanussi.fdi2.shapes;

public class Circle implements Shape2D {

    private float ray;

    public Circle(float ray) {
        this.ray = ray;
    }
    public void setCircle(float ray) {
        this.ray = ray;
    }

    @Override
    public float getArea() {
        return (float) (ray * ray * Math.PI);
    }

}
