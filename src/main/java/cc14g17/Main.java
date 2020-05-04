/*
* @description
* Main method to execute the programs under normal functionality to ensure they work as intended
 */
package cc14g17;

public class Main {

    public static void main(String[] args) {
        System.out.println("Running Main method Main.java");
        System.out.println("Running tests");
        runTestCWE20();
        runTestCWE89();
        System.out.println("Finished running tests");
    }

    /*
    * Test Each individual CWE
    * Test the good method and the bad method to confirm code compiles
    * Test the bad method then to confirm that the exploit is triggered.
     */

    private static void runTestCWE20() {
        CWE20_Improper_Input_Validation cwe20 = new CWE20_Improper_Input_Validation();
        cwe20.runTests("CWE20_Improper_Input_Validation");
    }

    private static void runTestCWE89() {
        CWE89_SQL_Injection cwe89 = new CWE89_SQL_Injection();
        cwe89.runTests("CWE-89: SQL Injection");
    }
}