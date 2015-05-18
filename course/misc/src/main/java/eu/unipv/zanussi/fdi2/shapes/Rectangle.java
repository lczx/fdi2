package eu.unipv.zanussi.fdi2.shapes;

public class Rectangle implements Shape2D {

    private float width, height;

    public Rectangle(float width, float height) {
        setRectangle(width, height);
    }

    public void setRectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float getArea() {
        return width * height;
    }

}
