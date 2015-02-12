package benchmark;

import benchmark.control.ViewManager;
import benchmark.view.MainView;
import benchmark.view.TestControlPanel;
import benchmark.view.VerticalListView;
import benchmark.worker.TestVs;
import benchmark.worker.kernels.DummyKernel01;
import benchmark.worker.kernels.DummyKernel02;

public class Application {

    public static void main(String[] args) {
        MainView.setLookAndFeel();

        VerticalListView uiTaskHolder = new VerticalListView();
        TestControlPanel uiControlPanel = new TestControlPanel();

        ViewManager viewManager = new ViewManager(uiTaskHolder, uiControlPanel);
        registerTestSuite(viewManager);

        new MainView("Findusmark JavaMark '15", uiTaskHolder, uiControlPanel);
    }

    public static void registerTestSuite(ViewManager r) {
        r.addTest(new TestVs(new DummyKernel01(), new DummyKernel02()));
    }

}
