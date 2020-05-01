/*
 * @Description
 * Program with simple withdraw functionality
 * CWE_ID: 20
 * CWE_Entry_Name: Improper Input Validation
 *
 */
package cc14g17;

public class CWE20_Improper_Input_Validation extends AbstractDefectiveProgram {

    private static final int WITHDRAW_LIMIT = 200;

    private double balance;

    CWE20_Improper_Input_Validation() {
        this.balance = 0;
    }

    @Override
    public void bad() throws Exception {
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
        if (amount >= WITHDRAW_LIMIT)
            return;
        balance = balance - amount;
    }

    void goodWithdraw(int amount) {
        /* FIX only allow positive quantities by including another validation of input*/
        if (amount < 0 || amount >= WITHDRAW_LIMIT)
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
