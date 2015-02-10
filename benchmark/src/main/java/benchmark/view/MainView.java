package benchmark.view;

import javax.swing.*;
import java.awt.*;

public class MainView {

    JFrame mainFrame;
    JComponent topPanel;
    JComponent bottomPanel;

    public MainView(String caption, JComponent topPanel, JComponent bottomPanel) {
        mainFrame = new JFrame(caption);
        this.topPanel = topPanel;
        this.bottomPanel = bottomPanel;

        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setSize(300, 400);
        mainFrame.setLocationByPlatform(true);

        initializeComponents();
        mainFrame.setVisible(true);
    }

    private void initializeComponents() {
        mainFrame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;        c.gridy = 0;
        c.gridwidth = 1;    c.gridheight = 1;
        c.weightx = 1;      c.weighty = 1;
        mainFrame.add(topPanel, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;        c.gridy = 1;
        c.gridwidth = 1;    c.gridheight = 1;
        c.weightx = 1;      c.weighty = 0;
        mainFrame.add(bottomPanel, c);
    }

}
