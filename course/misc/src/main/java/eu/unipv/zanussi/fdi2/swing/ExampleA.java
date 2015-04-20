package eu.unipv.zanussi.fdi2.swing;

import javax.swing.*;
import java.awt.*;

public class ExampleA {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = ExamplesUtils.createFrame();

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.WHITE);
        frame.getContentPane().add(panel1);

        panel1.setLayout(new FlowLayout());

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.RED);
        frame.getContentPane().add(panel2, BorderLayout.SOUTH);

        JButton button1 = new JButton("Button 1");
        panel1.add(button1);

        JButton button2 = new JButton("Button 2");
        panel1.add(button2);

        JButton button3 = new JButton("Button 3");
        panel1.add(button3);

        JButton button4 = new JButton("Button 4");
        panel1.add(button4);

        frame.setVisible(true);
    }

}
