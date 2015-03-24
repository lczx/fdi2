package benchmark.view;

import javax.swing.*;
import java.awt.*;

public class VerticalListView extends JPanel {

    public VerticalListView() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        setBackground(Color.WHITE);
    }

    public void addElement(JComponent element) {
        // Simply wrap 'add()'
        add(element);
    }

}
