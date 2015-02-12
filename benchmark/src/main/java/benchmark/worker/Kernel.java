package benchmark.worker;

public interface Kernel {

    /** Runs this kernel with the given weight. */
    void run(int weight);

    /** The name of this kernel unit. */
    String getUnitName();

}
