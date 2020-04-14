package cc14g17;

public abstract class AbstractCodeDefect {
    public abstract void good() throws Exception;

    public abstract void bad() throws Exception;

    // Run tests for good and bad method that they compile
    public void runTests() {
        System.out.println("Running tests for ");
        runTestCWE193();
    }

    //Individual Test Cases for each CWE
    private void runTestCWE193() {

    }

    private void runTestCWEXXX() {

    }
}
