package eu.unipv.zanussi.fdi2.swing;

import javax.swing.*;

public class ExamplesUtils {

    static JFrame createFrame() {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Example");
        return frame;
    }

}
