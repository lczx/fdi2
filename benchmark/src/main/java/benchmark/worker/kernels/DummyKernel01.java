package benchmark.worker.kernels;

import benchmark.worker.Kernel;

public class DummyKernel01 implements Kernel {

    public DummyKernel01() {
        System.out.println(getUnitName() + " initialized");
    }

    @Override
    public String getUnitName() {
        return "Kernel #1";
    }

    @Override
    public void run(int weight) {
        System.out.println(getUnitName() + " running with N = " + weight);
    }

}
