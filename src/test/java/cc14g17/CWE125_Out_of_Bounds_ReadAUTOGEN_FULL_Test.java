package cc14g17;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * AUTOMATICALLY GENERATED TEST SUITE
 * @author cc14g17
 */
public class CWE125_Out_of_Bounds_ReadAUTOGEN_FULL_Test {

    private CWE125_Out_of_Bounds_Read cwe125;

    @Before
    public void setUp() {
        cwe125 = new CWE125_Out_of_Bounds_Read();
    }

    /*
    Start of Manual Functional Tests
     */

    @Test
    public void badGetValueExploit() {
        Assert.assertEquals(-1, cwe125.badGetValue(-1));
        Assert.assertEquals(-1, cwe125.badGetValue(10));
    }

    @Test
    public void badGetValueFunctional() {
        Assert.assertEquals(0, cwe125.badGetValue(0));
        Assert.assertEquals(1, cwe125.badGetValue(1));
        Assert.assertEquals(8, cwe125.badGetValue(8));
        Assert.assertEquals(9, cwe125.badGetValue(9));
    }

    @Test
    public void goodGetValueExploit() {
        Assert.assertEquals(-1, cwe125.goodGetValue(-1));
        Assert.assertEquals(-1, cwe125.goodGetValue(10));
    }

    @Test
    public void goodGetValueFunctional() {
        Assert.assertEquals(0, cwe125.goodGetValue(0));
        Assert.assertEquals(1, cwe125.goodGetValue(1));
        Assert.assertEquals(8, cwe125.goodGetValue(8));
        Assert.assertEquals(9, cwe125.goodGetValue(9));
    }

    /*
    Start of Generated Tests
     */

    @Test
    public void badGetValue1() {
        cwe125.badGetValue(0);
    }

    @Test
    public void badGetValue2() {
        cwe125.badGetValue(1);
    }

    @Test
    public void badGetValue3() {
        cwe125.badGetValue(2);
    }

    @Test
    public void badGetValue4() {
        cwe125.badGetValue(3);
    }

    @Test
    public void badGetValue5() {
        cwe125.badGetValue(4);
    }

    @Test
    public void badGetValue6() {
        cwe125.badGetValue(5);
    }

    @Test
    public void badGetValue7() {
        cwe125.badGetValue(6);
    }

    @Test
    public void badGetValue8() {
        cwe125.badGetValue(7);
    }

    @Test
    public void badGetValue9() {
        cwe125.badGetValue(8);
    }

    @Test
    public void badGetValue10() {
        cwe125.badGetValue(9);
    }

    @Test
    public void badGetValue11() {
        cwe125.badGetValue(10);
    }

    @Test
    public void badGetValue12() {
        cwe125.badGetValue(100);
    }

    @Test
    public void badGetValue13() {
        cwe125.badGetValue(1000);
    }

    @Test
    public void badGetValue14() {
        cwe125.badGetValue(10000);
    }

    @Test
    public void badGetValue15() {
        cwe125.badGetValue(100000);
    }

    @Test
    public void badGetValue16() {
        cwe125.badGetValue(1000000);
    }

    @Test
    public void badGetValue17() {
        cwe125.badGetValue(10000000);
    }

    @Test
    public void badGetValue18() {
        cwe125.badGetValue(100000000);
    }

    @Test
    public void badGetValue19() {
        cwe125.badGetValue(1000000000);
    }

    @Test
    public void badGetValue20() {
        cwe125.badGetValue(255);
    }

    @Test
    public void badGetValue21() {
        cwe125.badGetValue(65535);
    }

    @Test
    public void badGetValue22() {
        cwe125.badGetValue(256);
    }

    @Test
    public void badGetValue23() {
        cwe125.badGetValue(65536);
    }

    @Test
    public void badGetValue24() {
        cwe125.badGetValue(127);
    }

    @Test
    public void badGetValue25() {
        cwe125.badGetValue(32767);
    }

    @Test
    public void badGetValue26() {
        cwe125.badGetValue(2147483647);
    }

    @Test
    public void badGetValue27() {
        cwe125.badGetValue(-1);
    }

    @Test
    public void badGetValue28() {
        cwe125.badGetValue(-2);
    }

    @Test
    public void badGetValue29() {
        cwe125.badGetValue(-3);
    }

    @Test
    public void badGetValue30() {
        cwe125.badGetValue(-4);
    }

    @Test
    public void badGetValue31() {
        cwe125.badGetValue(-5);
    }

    @Test
    public void badGetValue32() {
        cwe125.badGetValue(-6);
    }

    @Test
    public void badGetValue33() {
        cwe125.badGetValue(-7);
    }

    @Test
    public void badGetValue34() {
        cwe125.badGetValue(-8);
    }

    @Test
    public void badGetValue35() {
        cwe125.badGetValue(-9);
    }

    @Test
    public void badGetValue36() {
        cwe125.badGetValue(-10);
    }

    @Test
    public void badGetValue37() {
        cwe125.badGetValue(-100);
    }

    @Test
    public void badGetValue38() {
        cwe125.badGetValue(-1000);
    }

    @Test
    public void badGetValue39() {
        cwe125.badGetValue(-10000);
    }

    @Test
    public void badGetValue40() {
        cwe125.badGetValue(-100000);
    }

    @Test
    public void badGetValue41() {
        cwe125.badGetValue(-1000000);
    }

    @Test
    public void badGetValue42() {
        cwe125.badGetValue(-10000000);
    }

    @Test
    public void badGetValue43() {
        cwe125.badGetValue(-100000000);
    }

    @Test
    public void badGetValue44() {
        cwe125.badGetValue(-255);
    }

    @Test
    public void badGetValue45() {
        cwe125.badGetValue(-65535);
    }

    @Test
    public void badGetValue46() {
        cwe125.badGetValue(-256);
    }

    @Test
    public void badGetValue47() {
        cwe125.badGetValue(-65536);
    }

    @Test
    public void badGetValue48() {
        cwe125.badGetValue(-127);
    }

    @Test
    public void badGetValue49() {
        cwe125.badGetValue(-32767);
    }

    @Test
    public void badGetValue50() {
        cwe125.badGetValue(-2147483647);
    }

    @Test
    public void goodGetValue1() {
        cwe125.goodGetValue(0);
    }

    @Test
    public void goodGetValue2() {
        cwe125.goodGetValue(1);
    }

    @Test
    public void goodGetValue3() {
        cwe125.goodGetValue(2);
    }

    @Test
    public void goodGetValue4() {
        cwe125.goodGetValue(3);
    }

    @Test
    public void goodGetValue5() {
        cwe125.goodGetValue(4);
    }

    @Test
    public void goodGetValue6() {
        cwe125.goodGetValue(5);
    }

    @Test
    public void goodGetValue7() {
        cwe125.goodGetValue(6);
    }

    @Test
    public void goodGetValue8() {
        cwe125.goodGetValue(7);
    }

    @Test
    public void goodGetValue9() {
        cwe125.goodGetValue(8);
    }

    @Test
    public void goodGetValue10() {
        cwe125.goodGetValue(9);
    }

    @Test
    public void goodGetValue11() {
        cwe125.goodGetValue(10);
    }

    @Test
    public void goodGetValue12() {
        cwe125.goodGetValue(100);
    }

    @Test
    public void goodGetValue13() {
        cwe125.goodGetValue(1000);
    }

    @Test
    public void goodGetValue14() {
        cwe125.goodGetValue(10000);
    }

    @Test
    public void goodGetValue15() {
        cwe125.goodGetValue(100000);
    }

    @Test
    public void goodGetValue16() {
        cwe125.goodGetValue(1000000);
    }

    @Test
    public void goodGetValue17() {
        cwe125.goodGetValue(10000000);
    }

    @Test
    public void goodGetValue18() {
        cwe125.goodGetValue(100000000);
    }

    @Test
    public void goodGetValue19() {
        cwe125.goodGetValue(1000000000);
    }

    @Test
    public void goodGetValue20() {
        cwe125.goodGetValue(255);
    }

    @Test
    public void goodGetValue21() {
        cwe125.goodGetValue(65535);
    }

    @Test
    public void goodGetValue22() {
        cwe125.goodGetValue(256);
    }

    @Test
    public void goodGetValue23() {
        cwe125.goodGetValue(65536);
    }

    @Test
    public void goodGetValue24() {
        cwe125.goodGetValue(127);
    }

    @Test
    public void goodGetValue25() {
        cwe125.goodGetValue(32767);
    }

    @Test
    public void goodGetValue26() {
        cwe125.goodGetValue(2147483647);
    }

    @Test
    public void goodGetValue27() {
        cwe125.goodGetValue(-1);
    }

    @Test
    public void goodGetValue28() {
        cwe125.goodGetValue(-2);
    }

    @Test
    public void goodGetValue29() {
        cwe125.goodGetValue(-3);
    }

    @Test
    public void goodGetValue30() {
        cwe125.goodGetValue(-4);
    }

    @Test
    public void goodGetValue31() {
        cwe125.goodGetValue(-5);
    }

    @Test
    public void goodGetValue32() {
        cwe125.goodGetValue(-6);
    }

    @Test
    public void goodGetValue33() {
        cwe125.goodGetValue(-7);
    }

    @Test
    public void goodGetValue34() {
        cwe125.goodGetValue(-8);
    }

    @Test
    public void goodGetValue35() {
        cwe125.goodGetValue(-9);
    }

    @Test
    public void goodGetValue36() {
        cwe125.goodGetValue(-10);
    }

    @Test
    public void goodGetValue37() {
        cwe125.goodGetValue(-100);
    }

    @Test
    public void goodGetValue38() {
        cwe125.goodGetValue(-1000);
    }

    @Test
    public void goodGetValue39() {
        cwe125.goodGetValue(-10000);
    }

    @Test
    public void goodGetValue40() {
        cwe125.goodGetValue(-100000);
    }

    @Test
    public void goodGetValue41() {
        cwe125.goodGetValue(-1000000);
    }

    @Test
    public void goodGetValue42() {
        cwe125.goodGetValue(-10000000);
    }

    @Test
    public void goodGetValue43() {
        cwe125.goodGetValue(-100000000);
    }

    @Test
    public void goodGetValue44() {
        cwe125.goodGetValue(-255);
    }

    @Test
    public void goodGetValue45() {
        cwe125.goodGetValue(-65535);
    }

    @Test
    public void goodGetValue46() {
        cwe125.goodGetValue(-256);
    }

    @Test
    public void goodGetValue47() {
        cwe125.goodGetValue(-65536);
    }

    @Test
    public void goodGetValue48() {
        cwe125.goodGetValue(-127);
    }

    @Test
    public void goodGetValue49() {
        cwe125.goodGetValue(-32767);
    }

    @Test
    public void goodGetValue50() {
        cwe125.goodGetValue(-2147483647);
    }
}
