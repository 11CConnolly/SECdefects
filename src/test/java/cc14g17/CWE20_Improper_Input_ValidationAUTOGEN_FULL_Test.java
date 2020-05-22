package cc14g17;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * AUTOMATICALLY GENERATED TEST SUITE
 * @author cc14g17
 */
public class CWE20_Improper_Input_ValidationAUTOGEN_FULL_Test {

    private CWE20_Improper_Input_Validation cwe20;

    @Before
    public void setUp() {
        cwe20 = new CWE20_Improper_Input_Validation();
    }

    /*Start of Functional Tests*/
    @Test
    public void badWithdrawFunctional() {
        cwe20.badWithdraw(0);
        Assert.assertEquals(0, cwe20.getBalance(), 0.001);

        cwe20.badWithdraw(100);
        Assert.assertEquals(-100, cwe20.getBalance(), 0.001);

        cwe20.badWithdraw(1000);
        Assert.assertEquals(-100, cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdrawFunctional() {
        cwe20.goodWithdraw(0);
        Assert.assertEquals(0, cwe20.getBalance(), 0.001);

        cwe20.goodWithdraw(100);
        Assert.assertEquals(-100, cwe20.getBalance(), 0.001);

        cwe20.goodWithdraw(1000);
        Assert.assertEquals(-100, cwe20.getBalance(), 0.001);
    }

    /*Start of Generated Tests*/

    @Test
    public void badWithdraw1() {
        cwe20.badWithdraw(0);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw2() {
        cwe20.badWithdraw(1);
        Assert.assertEquals(-1,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw3() {
        cwe20.badWithdraw(2);
        Assert.assertEquals(-2,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw4() {
        cwe20.badWithdraw(3);
        Assert.assertEquals(-3,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw5() {
        cwe20.badWithdraw(4);
        Assert.assertEquals(-4,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw6() {
        cwe20.badWithdraw(5);
        Assert.assertEquals(-5,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw7() {
        cwe20.badWithdraw(6);
        Assert.assertEquals(-6,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw8() {
        cwe20.badWithdraw(7);
        Assert.assertEquals(-7,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw9() {
        cwe20.badWithdraw(8);
        Assert.assertEquals(-8,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw10() {
        cwe20.badWithdraw(9);
        Assert.assertEquals(-9,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw11() {
        cwe20.badWithdraw(10);
        Assert.assertEquals(-10,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw12() {
        cwe20.badWithdraw(100);
        Assert.assertEquals(-100,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw13() {
        cwe20.badWithdraw(1000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw14() {
        cwe20.badWithdraw(10000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw15() {
        cwe20.badWithdraw(100000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw16() {
        cwe20.badWithdraw(1000000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw17() {
        cwe20.badWithdraw(10000000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw18() {
        cwe20.badWithdraw(100000000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw19() {
        cwe20.badWithdraw(1000000000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw20() {
        cwe20.badWithdraw(255);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw21() {
        cwe20.badWithdraw(65535);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw22() {
        cwe20.badWithdraw(256);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw23() {
        cwe20.badWithdraw(65536);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw24() {
        cwe20.badWithdraw(127);
        Assert.assertEquals(-127,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw25() {
        cwe20.badWithdraw(32767);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw26() {
        cwe20.badWithdraw(2147483647);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw27() {
        cwe20.badWithdraw(-1);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw28() {
        cwe20.badWithdraw(-2);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw29() {
        cwe20.badWithdraw(-3);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw30() {
        cwe20.badWithdraw(-4);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw31() {
        cwe20.badWithdraw(-5);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw32() {
        cwe20.badWithdraw(-6);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw33() {
        cwe20.badWithdraw(-7);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw34() {
        cwe20.badWithdraw(-8);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw35() {
        cwe20.badWithdraw(-9);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw36() {
        cwe20.badWithdraw(-10);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw37() {
        cwe20.badWithdraw(-100);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw38() {
        cwe20.badWithdraw(-1000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw39() {
        cwe20.badWithdraw(-10000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw40() {
        cwe20.badWithdraw(-100000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw41() {
        cwe20.badWithdraw(-1000000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw42() {
        cwe20.badWithdraw(-10000000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw43() {
        cwe20.badWithdraw(-100000000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw44() {
        cwe20.badWithdraw(-255);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw45() {
        cwe20.badWithdraw(-65535);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw46() {
        cwe20.badWithdraw(-256);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw47() {
        cwe20.badWithdraw(-65536);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw48() {
        cwe20.badWithdraw(-127);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw49() {
        cwe20.badWithdraw(-32767);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void badWithdraw50() {
        cwe20.badWithdraw(-2147483647);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw1() {
        cwe20.goodWithdraw(0);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw2() {
        cwe20.goodWithdraw(1);
        Assert.assertEquals(-1,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw3() {
        cwe20.goodWithdraw(2);
        Assert.assertEquals(-2,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw4() {
        cwe20.goodWithdraw(3);
        Assert.assertEquals(-3,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw5() {
        cwe20.goodWithdraw(4);
        Assert.assertEquals(-4,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw6() {
        cwe20.goodWithdraw(5);
        Assert.assertEquals(-5,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw7() {
        cwe20.goodWithdraw(6);
        Assert.assertEquals(-6,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw8() {
        cwe20.goodWithdraw(7);
        Assert.assertEquals(-7,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw9() {
        cwe20.goodWithdraw(8);
        Assert.assertEquals(-8,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw10() {
        cwe20.goodWithdraw(9);
        Assert.assertEquals(-9,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw11() {
        cwe20.goodWithdraw(10);
        Assert.assertEquals(-10,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw12() {
        cwe20.goodWithdraw(100);
        Assert.assertEquals(-100,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw13() {
        cwe20.goodWithdraw(1000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw14() {
        cwe20.goodWithdraw(10000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw15() {
        cwe20.goodWithdraw(100000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw16() {
        cwe20.goodWithdraw(1000000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw17() {
        cwe20.goodWithdraw(10000000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw18() {
        cwe20.goodWithdraw(100000000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw19() {
        cwe20.goodWithdraw(1000000000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw20() {
        cwe20.goodWithdraw(255);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw21() {
        cwe20.goodWithdraw(65535);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw22() {
        cwe20.goodWithdraw(256);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw23() {
        cwe20.goodWithdraw(65536);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw24() {
        cwe20.goodWithdraw(127);
        Assert.assertEquals(-127,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw25() {
        cwe20.goodWithdraw(32767);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw26() {
        cwe20.goodWithdraw(2147483647);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw27() {
        cwe20.goodWithdraw(-1);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw28() {
        cwe20.goodWithdraw(-2);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw29() {
        cwe20.goodWithdraw(-3);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw30() {
        cwe20.goodWithdraw(-4);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw31() {
        cwe20.goodWithdraw(-5);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw32() {
        cwe20.goodWithdraw(-6);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw33() {
        cwe20.goodWithdraw(-7);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw34() {
        cwe20.goodWithdraw(-8);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw35() {
        cwe20.goodWithdraw(-9);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw36() {
        cwe20.goodWithdraw(-10);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw37() {
        cwe20.goodWithdraw(-100);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw38() {
        cwe20.goodWithdraw(-1000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw39() {
        cwe20.goodWithdraw(-10000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw40() {
        cwe20.goodWithdraw(-100000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw41() {
        cwe20.goodWithdraw(-1000000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw42() {
        cwe20.goodWithdraw(-10000000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw43() {
        cwe20.goodWithdraw(-100000000);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw44() {
        cwe20.goodWithdraw(-255);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw45() {
        cwe20.goodWithdraw(-65535);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw46() {
        cwe20.goodWithdraw(-256);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw47() {
        cwe20.goodWithdraw(-65536);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw48() {
        cwe20.goodWithdraw(-127);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw49() {
        cwe20.goodWithdraw(-32767);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }

    @Test
    public void goodWithdraw50() {
        cwe20.goodWithdraw(-2147483647);
        Assert.assertEquals(0,cwe20.getBalance(), 0.001);
    }
}
