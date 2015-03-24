package game.gui;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class Grid extends JTable {

    public Grid() {
        DefaultTableCellRenderer tr = new DefaultTableCellRenderer();
        tr.setHorizontalAlignment(SwingConstants.CENTER);
        setDefaultRenderer(Object.class, tr);
        setBorder(BorderFactory.createLineBorder(Color.GRAY));
        setFocusable(false);
        setRowSelectionAllowed(false);
        setShowGrid(false);
    }

}
