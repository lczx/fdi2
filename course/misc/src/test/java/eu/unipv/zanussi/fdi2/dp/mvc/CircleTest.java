package eu.unipv.zanussi.fdi2.dp.mvc;

import eu.unipv.zanussi.fdi2.dp.mvc.controller.CircleController;
import eu.unipv.zanussi.fdi2.dp.mvc.model.Circle;
import eu.unipv.zanussi.fdi2.dp.mvc.view.CircleView;

import javax.swing.*;

public class CircleTest {

    public static void main(String[] args) {
        Circle circle = new Circle(100, 100, 30);
        CircleView view = new CircleView(circle);

        CircleController controller = new CircleController(circle);
        view.addMouseListener(controller);
        view.addMouseMotionListener(controller);

        JFrame frame = new JFrame();
        frame.setTitle("Circle");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(view);
        frame.setVisible(true);
    }

}
