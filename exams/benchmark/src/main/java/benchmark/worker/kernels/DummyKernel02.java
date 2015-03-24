package benchmark.worker.kernels;

import benchmark.worker.Kernel;

public class DummyKernel02 implements Kernel {

    public DummyKernel02() {
        System.out.println(getUnitName() + " initialized");
    }

    @Override
    public String getUnitName() {
        return "Kernel #2";
    }

    @Override
    public void run(int weight) {
        System.out.println(getUnitName() + " running with N = " + weight);
    }

}
