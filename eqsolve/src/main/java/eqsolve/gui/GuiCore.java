package eqsolve.gui;

import javax.swing.*;
import java.awt.*;

public class GuiCore {

    public static final String MENU_EQ_LINEAR_COMMAND = "menu_linear";
    public static final String MENU_EQ_QUADRATIC_COMMAND = "menu_quadratic";

    private JFrame mainFrame;
    private JPanel paramPanel;
    private JPanel statusPanel;
    private Controller controller;

    public GuiCore(Controller controller) {
        this.controller = controller;

        mainFrame = new JFrame("Equation Solver");
        mainFrame.setSize(400, 110);
        mainFrame.setLayout(new GridLayout(2, 1));
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        mainFrame.setLocationByPlatform(true);

        mainFrame.setJMenuBar(makeMenu());

        paramPanel = makeParamPanel();
        mainFrame.add(paramPanel);
        statusPanel = makeStatusPanel();
        mainFrame.add(statusPanel);
    }

    public void setVisibleParams(int n) {
        if (n > 3) return;
        for (int i = 0; i < 2 * 3; i += 2) {
            paramPanel.getComponent(i).setVisible(1 < 2 * n);
            paramPanel.getComponent(i + 1).setVisible(i < 2 * n);
        }
    }

    public JFrame getMainFrame() {
        return mainFrame;
    }

    public JPanel getParamPanel() {
        return paramPanel;
    }

    public JPanel getStatusPanel() {
        return statusPanel;
    }

    private JPanel makeParamPanel() {
        JPanel p = new JPanel();
        Dimension fsz = new Dimension(30, 20);

        JTextField f1 = new JTextField(), f2 = new JTextField(), f3 = new JTextField();
        f1.setPreferredSize(fsz); f1.getDocument().addDocumentListener(controller);
        f2.setPreferredSize(fsz); f2.getDocument().addDocumentListener(controller);
        f3.setPreferredSize(fsz); f3.getDocument().addDocumentListener(controller);

        p.setLayout(new FlowLayout());
        p.add(new JLabel("a := ")); p.add(f1);
        p.add(new JLabel("b := ")); p.add(f2);
        p.add(new JLabel("c := ")); p.add(f3);

        p.setBackground(Color.WHITE);
        return p;
    }

    private JPanel makeStatusPanel() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        p.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

        p.add(new JLabel("", SwingConstants.LEFT));
        p.add(new JLabel("", SwingConstants.RIGHT));

        p.setBackground(Color.WHITE);
        return p;
    }

    private JMenuBar makeMenu() {
        JMenuBar b = new JMenuBar();
        JMenu m1 = new JMenu("Equations");

        JRadioButtonMenuItem r11 = new JRadioButtonMenuItem("Linear equation");
        r11.setActionCommand(MENU_EQ_LINEAR_COMMAND);
        r11.addActionListener(controller);

        JRadioButtonMenuItem r12 = new JRadioButtonMenuItem("Quadratic equation");
        r12.setActionCommand(MENU_EQ_QUADRATIC_COMMAND);
        r12.addActionListener(controller);

        ButtonGroup rs = new ButtonGroup();
        rs.add(r11);
        rs.add(r12);

        m1.add(r11);
        m1.add(r12);

        b.add(m1);
        return b;
    }

}
