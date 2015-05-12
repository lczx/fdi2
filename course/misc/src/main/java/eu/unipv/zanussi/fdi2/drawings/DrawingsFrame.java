package eu.unipv.zanussi.fdi2.drawings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

/**
 * A window (frame) holding a {@link Drawable} component.
 */
public class DrawingsFrame {

    private Drawable drawable;

    private JPanel panel;
    private JFrame frame;

    public DrawingsFrame(Drawable drawable) {
        this.drawable = drawable;
    }

    private void draw(Graphics g) {
        // Note: Otherwise this class would be unstable.
        drawable.draw(g);
    }

    public JPanel getPanel() {
        return panel;
    }

    /** Allows binding of key listeners with this frame. */
    public void addKeyListener(KeyListener keyListener) {
        panel.addKeyListener(keyListener); // But then caught here if we click inside.
        frame.addKeyListener(keyListener); // Initially caught here.
    }

    /** Displays the window. */
    public void launchFrame() {
        // Note: this is already closed and stable.

        this.panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // Panel cleanup before redraw
                draw(g);
            }
        };

        this.frame = new JFrame();
        frame.setSize(300, 300);
        frame.setTitle("<" + drawable.getClass().getSimpleName() + ">");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

}
