/*
* @description
* CWE: 193
* The array index check is 1 off from the max array index
*
 */

package cc14g17;

public class CWE193_Off_by_One_Error extends AbstractCodeDefect {

    // Constructor method for CWE error
    CWE193_Off_by_One_Error(){

    }

    @Override
    public void good() throws Exception {

    }

    @Override
    public void bad() throws Exception {

    }

    public void bad(int inputLength) {
        int[] intArray = new int[10];
        for (int i = 0; i <= inputLength; i++) {
            /* FLAW index outside of array, off by one */
            intArray[i] = i;
        }

    }

    public void good(int inputLength) {
        int[] intArray = new int[10];
        /* FIX use < to ensure no out of bounds access */
        for (int i = 0; i < inputLength; i++) {
            System.out.println("intArray[" + i + "] = " + (intArray[i] = i));
        }
    }
}
