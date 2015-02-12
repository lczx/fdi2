package benchmark;

import benchmark.view.MainView;
import benchmark.view.TestControlPanel;
import benchmark.view.TestViewElement;
import benchmark.view.VerticalListView;

import javax.swing.*;

public class Application {

    public static void main(String[] args) {
        VerticalListView vl = new VerticalListView();
        vl.addElement(new TestViewElement("Test #1"));
        vl.addElement(new TestViewElement("Test #2"));

        new MainView("Findusmark JavaMark '15", new JScrollPane(vl), new TestControlPanel());
    }

}
