package eu.unipv.zanussi.fdi2.drawings;

import eu.unipv.zanussi.fdi2.drawings.drawables.Crosshair;
import eu.unipv.zanussi.fdi2.drawings.drawables.Label;

public class DrawingsFrameTest {

    public static void main(String[] args) {
        DrawingsFrame f1 = new DrawingsFrame(new Label("CptFindus was slain by Albert", 10, 10));
        f1.launchFrame();

        DrawingsFrame f2 = new DrawingsFrame(new Crosshair(80, 70));
        f2.launchFrame();
    }

}
