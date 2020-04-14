package cc14g17;

public class Main {

    public static void main(String[] args) {
        /*
        * Create classes
        * Run Tests
        * etc.
         */
        CWE193_Off_by_One_Error cwe = new CWE193_Off_by_One_Error();
        cwe.good(10);
        cwe.bad(10);
        System.out.println("Finished running code");
    }
}