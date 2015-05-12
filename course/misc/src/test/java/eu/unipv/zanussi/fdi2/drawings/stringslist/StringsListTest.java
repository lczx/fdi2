package eu.unipv.zanussi.fdi2.drawings.stringslist;

import eu.unipv.zanussi.fdi2.drawings.DrawingsFrame;

import javax.swing.*;

public class StringsListTest {

    public static void main(String[] args) {
        StringsList stringsList = new StringsList(
                "White",
                "Red",
                "Green",
                "Blue"
        );

        stringsList.setIndex(2);

        stringsList.up(); // 3
        stringsList.up(); // 4 -> 3

        stringsList.down(); // 2
        stringsList.down(); // 1
        stringsList.down(); // 0
        stringsList.down(); // -1 -> 0

        Placer placer = new Placer();
        stringsList.setPlacer(placer);
        placer.setPlacer(new VerticalPlacer());

        DrawingsFrame frame = new DrawingsFrame(stringsList);
        frame.launchFrame();

        JPanel panel = frame.getPanel();

        StringsListController controller = new StringsListController(stringsList, placer, panel);

        frame.addKeyListener(controller);
    }
}
