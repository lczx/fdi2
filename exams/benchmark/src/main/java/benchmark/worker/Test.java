package benchmark.worker;

public interface Test {

    /** Executes this test and returns a status string. */
    String execute(int weight);

    /** The name to be displayed for this test. */
    String getName();

}
