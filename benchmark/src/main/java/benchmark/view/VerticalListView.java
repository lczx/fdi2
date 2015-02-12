package benchmark.view;

import javax.swing.*;

public class VerticalListView extends JPanel {

    public VerticalListView() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    public void addElement(JComponent element) {
        // Simply wrap 'add()'
        add(element);
    }

}
