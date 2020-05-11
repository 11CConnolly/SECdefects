/*
 * @Description
 * Program with simple withdraw functionality
 * CWE_ID: 20
 * CWE_Entry_Name: Improper Input Validation
 *
 * The product does not validate or incorrectly validates input that
 * can affect the control flow or data flow of a program.
 *
 */
package cc14g17;

public class CWE20_Improper_Input_Validation extends AbstractDefectiveProgram {

    private static final int LIMIT = 200;
    private double balance;

    // Perform necessary
    CWE20_Improper_Input_Validation() {
        this.balance = 0;
    }

    @Override
    public void bad() {
        badWithdraw(5);
    }

    @Override
    public void good() {
        goodWithdraw(5);
    }

    //Allows a user to order a quantity of some product
    void badWithdraw(int amount) {
        /* FLAW negative quantity of orders should not be allowed otherwise attacker
        * can increase balance arbitrarily*/
        if (amount >= LIMIT)
            return;
        balance = balance - amount;
    }

    void goodWithdraw(int amount) {
        /* FIX only allow positive quantities by including another validation of input*/
        if (amount < 0 || amount >= LIMIT)
            return;
        balance = balance - amount;
    }

    //Getter and Setter methods
    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }
}
