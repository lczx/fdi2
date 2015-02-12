package benchmark.control;

import benchmark.view.TestControlPanel;
import benchmark.view.VerticalListView;
import benchmark.worker.Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class ViewManager implements ActionListener {

    VerticalListView viewTestHolder;
    TestControlPanel viewControlPanel;
    LinkedList<TestController> testControllers = new LinkedList<TestController>();

    public ViewManager(VerticalListView viewTestHolder, TestControlPanel viewControlPanel) {
        this.viewTestHolder = viewTestHolder;
        this.viewControlPanel = viewControlPanel;
        viewControlPanel.addStartListener(this);
    }

    public void addTest(Test test) {
        TestController tc = new TestController(test);
        viewTestHolder.addElement(tc.getViewPanel());
        testControllers.add(tc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        viewControlPanel.setStatusText(TestControlPanel.STATUS_RUNNING);
        int workWeight = viewControlPanel.getSelectedTestWeight();

        for (TestController tc : testControllers)
            tc.doWork(workWeight);

        viewControlPanel.setStatusText(TestControlPanel.STATUS_READY);
    }

}
