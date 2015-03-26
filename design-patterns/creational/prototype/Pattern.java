import shapes.Shape;

public class Pattern {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cs1 = ShapeCache.getShape("1");
        System.out.println("Shape: " + cs1.getType());

        Shape cs2 = ShapeCache.getShape("2");
        System.out.println("Shape: " + cs2.getType());

        Shape cs3 = ShapeCache.getShape("3");
        System.out.println("Shape: " + cs3.getType());
    }

}
