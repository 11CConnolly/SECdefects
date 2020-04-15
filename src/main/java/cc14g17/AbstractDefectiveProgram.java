package cc14g17;

public abstract class AbstractDefectiveProgram {
    public abstract void bad() throws Exception;

    public abstract void good();

    // Run tests for good and bad method that they compile
    void runTests(String cweName) {
        IO.printLine("Running tests for " + cweName);

        good();
        IO.printLine("Finished good() for " + cweName);

        try {
            bad();
            IO.printLine("Finished bad() for " + cweName);
        } catch (Exception e) {
            IO.printLine("Caught an exception for bad() of " + cweName);
            e.printStackTrace();
        }
    }
}
