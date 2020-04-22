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
        CWE20_Improper_Input_Validation cwe20 = new CWE20_Improper_Input_Validation();
        cwe20.runTests("CWE20_Improper_Input_Validation");
        System.out.println("Finished Running code");
    }

    /*
    * Test Each individual CWE
    * Test the good method and the bad method to confirm code compiles
    * Test the bad method then to confirm that the exploit is triggered.
     */
    private void runTestCWE20() {
        
    }

    private void runTestCWEXXX() {

    }
}