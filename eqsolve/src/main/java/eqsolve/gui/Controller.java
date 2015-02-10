package eqsolve.gui;

import eqsolve.equation.Equation;
import eqsolve.equation.LinearEquation;
import eqsolve.equation.QuadraticEquation;
import eqsolve.solver.LinearSolver;
import eqsolve.solver.QuadraticSolver;
import eqsolve.solver.Solver;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Controller implements ActionListener, DocumentListener {

    private GuiCore view;

    private Equation equation;
    private Solver solver;

    public Controller() {
        view = new GuiCore(this);

        // Select first equation menu item and trigger event.
        JMenuItem firstSelector = view.getMainFrame().getJMenuBar().getMenu(0).getItem(0);
        firstSelector.doClick();
    }

    @Override
    public void insertUpdate(DocumentEvent e) { paramsChanged(); }

    @Override
    public void removeUpdate(DocumentEvent e) { paramsChanged(); }

    @Override
    public void changedUpdate(DocumentEvent e) { }

    private void paramsChanged() {
        JPanel parPanel = view.getParamPanel();

        for (int i = 0; i < equation.getParamListSize(); ++i) {
            String text = ((JTextField) (parPanel.getComponent(2 * i + 1))).getText();
            double value = 0;
            try { value = Double.valueOf(text); } catch (NumberFormatException ex) {
                if (!text.equals(""))
                    System.err.println("Malformed input, expected a number.");
            }
            equation.setParam(i, value);
        }

        JLabel labelEq = ((JLabel) view.getStatusPanel().getComponent(0));
        JLabel labelOut = ((JLabel) view.getStatusPanel().getComponent(1));

        labelEq.setText(equation.getCurrentFormula());

        String output;
        try {
            output = Arrays.toString(solver.solve(equation));
        } catch (RuntimeException e) {
            output = e.getMessage();
        }
        labelOut.setText(output);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(GuiCore.MENU_EQ_LINEAR_COMMAND)) {
            this.equation = new LinearEquation();
            this.solver = new LinearSolver();
        } else if (e.getActionCommand().equals(GuiCore.MENU_EQ_QUADRATIC_COMMAND)) {
            this.equation = new QuadraticEquation();
            this.solver = new QuadraticSolver();
        }

        view.setVisibleParams(equation.getParamListSize());
        paramsChanged();
    }

}
