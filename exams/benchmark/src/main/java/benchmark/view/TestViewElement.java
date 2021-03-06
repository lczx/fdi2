package benchmark.view;

import javax.swing.*;
import java.awt.*;

public class TestViewElement extends JPanel {

    JCheckBox toggleBox;
    JLabel statusLabel = new JLabel();

    public TestViewElement(String name) {
        toggleBox = new JCheckBox(name);

        setLayout(new GridLayout(1, 2));
        // getMaximumSize().width := Short.MAX_VALUE
        setMaximumSize(new Dimension(Short.MAX_VALUE, 30));
        statusLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        toggleBox.setOpaque(false);
        setOpaque(false);

        add(toggleBox);
        add(statusLabel);
    }

    public boolean getEnabled() {
        return toggleBox.isSelected();
    }

    public void setStatusText(String message) {
        statusLabel.setText(message);
    }

}
