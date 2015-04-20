package eu.unipv.zanussi.fdi2.swing;

import javax.swing.*;
import java.awt.*;

public class ExampleD {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = ExamplesUtils.createFrame();

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Sortings");

        JMenuItem menuItem01 = new JMenuItem("A-Z");
        menu.add(menuItem01);

        JMenuItem menuItem02 = new JMenuItem("Z-A");
        menu.add(menuItem02);

        JMenuItem menuItem03 = new JMenuItem("Random");
        menu.add(menuItem03);

        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        frame.getContentPane().add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2, 1));
        panel1.add(new JTextField("Write here"));
        panel1.add(new JButton("Add"));
        panel.add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 1));
        JTextArea area = new JTextArea("List...");
        area.setEnabled(false);
        panel2.add(area);
        panel.add(panel2);

        frame.setVisible(true);
    }

}
