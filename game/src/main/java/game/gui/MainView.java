package game.gui;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MainView extends JFrame {

    public static final String GUI_TEXT_EMPTY = " ";
    public static final String GUI_TEXT_SUCCESS = "[Match]";
    public static final String GUI_TEXT_FAILURE = "[Epic Fail]";
    public static final String GUI_TEXT_RESULTS = "Finished with %d points.";

    JButton startButton = new JButton("New Game");
    JButton saveButton = new JButton("Save");
    JTextField inputBox = new JTextField();
    JLabel statusLabel = new JLabel("Press \"New Game\" to start...");
    JTable gameGrid = new Grid();

    public MainView(String caption) throws HeadlessException {
        setTitle(caption);
        setSize(300, 210);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        initializeComponents();
        setVisible(true);
    }

    public void addGameListener(final GameUIListener listener) {
        final JFrame parent = this;

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { listener.startNewGame(); }
        });

        inputBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { listener.processWord(inputBox.getText()); }
        });

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                File f = MainView.selectFileGui(parent);
                if (f != null) listener.saveResultsToFile(f);
            }
        });
    }

    public void setStatusMessage(String message) {
        statusLabel.setText(message);
    }

    public void setGridModel(TableModel model) {
        gameGrid.setModel(model);
    }

    public void setGameRunning(boolean running) {
        if (running) {
            inputBox.setEnabled(true);
            saveButton.setVisible(false);
        } else {
            inputBox.setEnabled(false);
            saveButton.setVisible(true);
        }
    }

    public void selectInputText() {
        inputBox.selectAll();
    }

    private void initializeComponents() {
        gameGrid.setPreferredSize(new Dimension(145, 145));

        getContentPane().setBackground(Color.WHITE);

        setLayout(new GridBagLayout());
        add(startButton, new GuiConstraints(0, 0, 1, 1));
        add(inputBox, new GuiConstraints(0, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL));
        add(gameGrid, new GuiConstraints(1, 0, 1, 3));
        add(statusLabel, new GuiConstraints(0, 3, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE));
        add(saveButton, new GuiConstraints(1, 3, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 0, 0, 1)));

        inputBox.setEnabled(false);
        saveButton.setVisible(false);
        pack();
    }

    public static void initializeLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println("Cannot set Look and Feel");
            e.printStackTrace();
        }
    }

    public static File selectFileGui(JFrame parent) {
        JFileChooser fc = new JFileChooser();
        int retVal = fc.showSaveDialog(parent);
        if (retVal == JFileChooser.APPROVE_OPTION)
            return fc.getSelectedFile();

        return null;
    }

    /**
     * Utility class for fast definition of GridBagConstraints.
     */
    private class GuiConstraints extends GridBagConstraints {

        public GuiConstraints(int gridX, int gridY) {
            this.gridx = gridX;
            this.gridy = gridY;
            this.insets = new Insets(5, 5, 5, 5);
        }

        public GuiConstraints(int gridX, int gridY, int gridWidth, int gridHeight) {
            this(gridX, gridY);
            this.gridwidth = gridWidth;
            this.gridheight = gridHeight;
        }

        public GuiConstraints(int gridX, int gridY, int gridWidth, int gridHeight, int anchor, int fill) {
            this(gridX, gridY, gridWidth, gridHeight);
            this.anchor = anchor;
            this.fill = fill;
        }

        public GuiConstraints(int gridX, int gridY, int gridWidth, int gridHeight, int anchor, int fill, Insets insets) {
            this(gridX, gridY, gridWidth, gridHeight, anchor, fill);
            this.insets = insets;
        }

    }

}
