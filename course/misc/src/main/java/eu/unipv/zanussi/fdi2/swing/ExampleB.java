package eu.unipv.zanussi.fdi2.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleB {

    public static void main(String[] args) {
        JFrame frame = ExamplesUtils.createFrame();

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        frame.getContentPane().add(panel);

        panel.setLayout(new GridLayout(2, 2));

        JButton button1 = new JButton("Button 1");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("A");
            }
        });
        panel.add(button1);

        JButton button2 = new JButton("Button 2");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("B");
            }
        });
        panel.add(button2);

        JButton button3 = new JButton("Button 3");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("C");
            }
        });
        panel.add(button3);

        frame.setVisible(true);
    }

}
