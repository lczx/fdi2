package benchmark.view;

import javax.swing.*;
import java.awt.*;

public class MainView {

    JFrame mainFrame;
    JComponent mainPanel;
    JComponent slavePanel;

    public MainView(String caption, JComponent mainPanel, JComponent slavePanel) {
        mainFrame = new JFrame(caption);
        this.mainPanel = mainPanel;
        this.slavePanel = slavePanel;

        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setSize(350, 500);
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
        mainFrame.add(new JScrollPane(mainPanel), c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;        c.gridy = 1;
        c.gridwidth = 1;    c.gridheight = 1;
        c.weightx = 1;      c.weighty = 0;
        mainFrame.add(slavePanel, c);
    }

    public static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println("Could not set system look and feel.");
        }
    }

}
