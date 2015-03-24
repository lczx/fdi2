package drawapi;

public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[c: green, r: " + radius + ", p: " + x + ", " + y + "]");
    }

}
