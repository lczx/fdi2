package benchmark.control;

import benchmark.view.TestViewElement;
import benchmark.worker.Test;

public class TestController {

    private Test test;
    private TestViewElement testView;

    public TestController(Test test) {
        this.test = test;
        this.testView = new TestViewElement(test.getName());
    }

    public void doWork(int weight) {
        if (!testView.getEnabled()) return;

        testView.setStatusText("Running...");
        String result = test.execute(weight);
        testView.setStatusText(result);
    }

    public TestViewElement getViewPanel() {
        return testView;
    }

}
