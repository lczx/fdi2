package eu.unipv.zanussi.fdi2.swing;

import javax.swing.*;
import java.awt.*;

public class ExampleC {

    public static void main(String[] args) {
        JFrame frame = ExamplesUtils.createFrame();

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        panel.setLayout(new GridLayout(3, 1));

        JTextArea area1 = new JTextArea();
        panel.add(area1);

        JTextArea area2 = new JTextArea();
        area2.setBackground(Color.CYAN);
        area2.setEditable(false);
        area2.setText("TODO TODO TODO TODO \nTODO TODO TODO TODO");
        panel.add(area2);

        area2.setBorder(BorderFactory.createEtchedBorder());

        JTextArea area3 = new JTextArea();
        area3.setBackground(Color.YELLOW);
        area3.setText("Write here...");
        JScrollPane scrollPane = new JScrollPane(area3);
        panel.add(scrollPane);

        frame.setVisible(true);
    }

}
