/*
 * @Description
 * Program with simple login functionality
 * CWE_ID: 89
 * CWE_Entry_Name: Improper Neutralization of Special Elements used in an SQL Command ('SQL Injection')
 *
 *
 */

package cc14g17;

public class CWE125_Out_of_Bounds_Read extends AbstractDefectiveProgram {

    private int[] aValues = new int[10];

    CWE125_Out_of_Bounds_Read() {
        for (int i = 0; i < aValues.length; i++) {
            aValues[i] = i;
        }
    }

    @Override
    public void bad() {
        badGetValue(0);
    }

    @Override
    public void good() {
        goodGetValue(0);
    }

    public int badGetValue(int index) throws ArrayIndexOutOfBoundsException {

        int value;

        /* FLAW This will allow a negative value to be accepted as the input array index*/
        if (index < aValues.length) {
            value = aValues[index];
        } else {
            System.out.println("Error bad value");
            value = -1;
        }

        return value;
    }

    public int goodGetValue(int index) {

        int value;

        /* FIX Include a check to ensure array index is within boundaries*/
        if (index >= 0 && index < aValues.length) {
            value = aValues[index];
        } else {
            System.out.println("Error bad value");
            value = -1;
        }

        return value;
    }
}
