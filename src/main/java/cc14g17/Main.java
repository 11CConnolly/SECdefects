/*
* @description
* Main method to execute the programs under normal functionality to ensure classes work as intended
 */
package cc14g17;

/**
 * @author cc14g17
 *
 */
public class Main {

    /**
     * Test each individual CWE
     * Runs the the good method and the bad method to confirm code compiles
     *
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("Running Main method in Main.java");
        System.out.println("-------------");
        System.out.println("Running tests");
        System.out.println("-------------");
        runTestCWE20();
        runTestCWE22();
        runTestCWE89();
        runTestCWE125();
        System.out.println("----------------------");
        System.out.println("Finished running tests");
        System.out.println("----------------------");
    }

    private static void runTestCWE20() {
        CWE20_Improper_Input_Validation cwe20 = new CWE20_Improper_Input_Validation();
        cwe20.runTests("CWE20_Improper_Input_Validation");
    }

    private static void runTestCWE22() {
        CWE22_Path_Traversal cwe22 = new CWE22_Path_Traversal();
        cwe22.runTests("CWE-22: Path Traversal");
    }

    private static void runTestCWE89() {
        CWE89_SQL_Injection cwe89 = new CWE89_SQL_Injection();
        cwe89.runTests("CWE-89: SQL Injection");
    }

    private static void runTestCWE125() {
        CWE125_Out_of_Bounds_Read cwe125 = new CWE125_Out_of_Bounds_Read();
        cwe125.runTests("CWE-125: Out of Bounds Read");
    }
}