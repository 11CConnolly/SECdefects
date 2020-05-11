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
        runTestCWE22();
        System.out.println("Finished running tests");
    }

    /*
    * Test Each individual CWE
    * Test the good method and the bad method to confirm code compiles
    * Test the bad method then to confirm that the exploit is triggered.
     */

    private static void testAllCWE() {
        runTestCWE20();
        runTestCWE22();
        runTestCWE78();
        runTestCWE89();
        runTestCWE190();
        runTestCWE400();
        runTestCWE476();
        runTestCWE798();
    }

    private static void runTestCWE20() {
        CWE20_Improper_Input_Validation cwe20 = new CWE20_Improper_Input_Validation();
        cwe20.runTests("CWE20_Improper_Input_Validation");
    }

    private static void runTestCWE22() {
        CWE22_Path_Traversal cwe22 = new CWE22_Path_Traversal();
        cwe22.runTests("CWE-22: Path Traversal");
    }

    private static void runTestCWE78() {
        CWE78_OS_Command_Injection cwe78 = new CWE78_OS_Command_Injection();
        cwe78.runTests("CWE-78: OS Command Injection");
    }


    private static void runTestCWE89() {
        CWE89_SQL_Injection cwe89 = new CWE89_SQL_Injection();
        cwe89.runTests("CWE-89: SQL Injection");
    }

    private static void runTestCWE190() {
        CWE125_Out_of_Bounds_Read cwe125 = new CWE125_Out_of_Bounds_Read();
        cwe125.runTests("CWE-125: Out of Bounds Read");
    }

    private static void runTestCWE400() {
        CWE400_Uncontrolled_Resource_Consumption cwe400 = new CWE400_Uncontrolled_Resource_Consumption();
        cwe400.runTests("CWE-400: Uncontrolled Resource Consumption");
    }

    private static void runTestCWE476() {
        CWE476_NULL_Pointer_Dereference cwe476 = new CWE476_NULL_Pointer_Dereference();
        cwe476.runTests("CWE-476: NULL Pointer Dereference");
    }

    private static void runTestCWE798() {
        CWE798_Hard_Coded_Credentials cwe798 = new CWE798_Hard_Coded_Credentials();
        cwe798.runTests("CWE-798: Hard-coded Credentials");
    }
}