package benchmark.worker;

public class TestVs implements Test {

    private Kernel kernelA, kernelB;

    public TestVs(Kernel kernelA, Kernel kernelB) {
        this.kernelA = kernelA;
        this.kernelB = kernelB;
    }

    @Override
    public String getName() {
        return kernelA.getUnitName() + " vs. " + kernelB.getUnitName();
    }

    @Override
    public String execute(int weight) {
        long k1Time = measureKernelTime(kernelA, weight);
        long k2Time = measureKernelTime(kernelB, weight);
        long diff = Math.abs(k1Time - k2Time);

        if (k1Time == k2Time) return "It was a tie!";

        return (k1Time < k2Time ? kernelA.getUnitName() : kernelB.getUnitName()) +
                " (" + diff / 1000 + "us faster)";
    }

    private long measureKernelTime(Kernel kernel, int weight) {
        long startTime = System.nanoTime();
        kernel.run(weight);
        return System.nanoTime() - startTime;
    }

}
