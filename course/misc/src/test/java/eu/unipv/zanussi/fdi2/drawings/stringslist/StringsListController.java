package eu.unipv.zanussi.fdi2.drawings.stringslist;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class StringsListController implements KeyListener {

    private StringsList list;
    private Placer placer;
    private JPanel panel;

    public StringsListController(StringsList list, Placer placer, JPanel panel) {
        this.list = list;
        this.placer = placer;
        this.panel = panel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN:
                list.up();
                break;
            case KeyEvent.VK_UP:
                list.down();
                break;
            case KeyEvent.VK_LEFT:
                placer.setPlacer(new VerticalPlacer());
                break;
            case KeyEvent.VK_RIGHT:
                placer.setPlacer(new DiagonalPlacer());
                break;
        }
        panel.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
