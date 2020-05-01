/*
* @description
* Main method to execute the programs under normal functionality to ensure they work as intended
 */
package cc14g17;

public class Main {

    public static void main(String[] args) {
        /*
        * Create classes
        * Run Tests
        * etc.
         */
        //runTestCWE20();
        runTestCWE89();
        System.out.println("Finished");
    }

    /*
    * Test Each individual CWE
    * Test the good method and the bad method to confirm code compiles
    * Test the bad method then to confirm that the exploit is triggered.
     */
    private static void runTestCWE20() {
        CWE20_Improper_Input_Validation cwe20 = new CWE20_Improper_Input_Validation();
        cwe20.runTests("CWE20_Improper_Input_Validation");
        System.out.println("Finished Running code");
        
    }

    private static void runTestCWE89() {
        CWE89_SQL_Injection cwe89 = new CWE89_SQL_Injection();
        try {
            cwe89.bad();
        } catch (Exception e) {
            e.printStackTrace();
        }
        cwe89.good();
    }
}