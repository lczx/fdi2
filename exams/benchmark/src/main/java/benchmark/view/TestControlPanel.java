package benchmark.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TestControlPanel extends JPanel {

    public static final String STATUS_READY = "Ready";
    public static final String STATUS_RUNNING = "Running...";

    JButton initButton = new JButton("Start");
    SpinnerNumberModel weightSelectorModel = new SpinnerNumberModel(5000, 0, 100000, 100);
    JLabel statusLabel = new JLabel(STATUS_READY);

    public TestControlPanel() {
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);

        setLayout(new GridLayout(1, 3, 5, 0));
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        statusLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        add(initButton);
        add(new JSpinner(weightSelectorModel));
        add(statusLabel);
    }

    public void addStartListener(ActionListener listener) {
        initButton.addActionListener(listener);
    }

    public int getSelectedTestWeight() {
        return weightSelectorModel.getNumber().intValue();
    }

    public void setStatusText(String message) {
        statusLabel.setText(message);
    }

}
