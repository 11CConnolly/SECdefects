package cc14g17;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * AUTOMATICALLY GENERATED TEST SUITE
 * @author cc14g17
 */
public class CWE22_Path_TraversalAUTOGEN_FULL_Test {

    private CWE22_Path_Traversal cwe22;

    @Before
    public void setUp() {
        cwe22 = new CWE22_Path_Traversal();
    }

    /*
    Start of Manual Functional Tests
     */

    @Test
    public void badReadFunctional() {
        cwe22.badRead("alice.txt");
        assertTrue(cwe22.isFileRead());
        cwe22.setFileRead(false);

        cwe22.badRead("bob.txt");
        assertTrue(cwe22.isFileRead());
        cwe22.setFileRead(false);
    }

    @Test
    public void goodReadFunctional() {
        cwe22.goodRead("alice.txt");
        assertTrue(cwe22.isFileRead());
        cwe22.setFileRead(false);

        cwe22.goodRead("bob.txt");
        assertTrue(cwe22.isFileRead());
        cwe22.setFileRead(false);
    }

    /*
    Start of Generated Tests
     */

    @Test
    public void badRead1() {
        cwe22.badRead("..//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead2() {
        cwe22.badRead("../..//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead3() {
        cwe22.badRead("../../..//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead4() {
        cwe22.badRead("../../../..//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead5() {
        cwe22.badRead("../../../../..//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead6() {
        cwe22.badRead("../../../../../..//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead7() {
        cwe22.badRead("../../../../../../..//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead8() {
        cwe22.badRead("../../../../../../../..//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead9() {
        cwe22.badRead("../passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead10() {
        cwe22.badRead("../../passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead11() {
        cwe22.badRead("../../../passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead12() {
        cwe22.badRead("../../../../passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead13() {
        cwe22.badRead("../../../../../passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead14() {
        cwe22.badRead("../../../../../../passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead15() {
        cwe22.badRead("../../../../../../../passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead16() {
        cwe22.badRead("../../../../../../../../passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead17() {
        cwe22.badRead("..%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead18() {
        cwe22.badRead("..%2f..%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead19() {
        cwe22.badRead("..%2f..%2f..%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead20() {
        cwe22.badRead("..%2f..%2f..%2f..%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead21() {
        cwe22.badRead("..%2f..%2f..%2f..%2f..%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead22() {
        cwe22.badRead("..%2f..%2f..%2f..%2f..%2f..%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead23() {
        cwe22.badRead("..%2f..%2f..%2f..%2f..%2f..%2f..%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead24() {
        cwe22.badRead("..%2f..%2f..%2f..%2f..%2f..%2f..%2f..%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead25() {
        cwe22.badRead("%2e%2e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead26() {
        cwe22.badRead("%2e%2e/%2e%2e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead27() {
        cwe22.badRead("%2e%2e/%2e%2e/%2e%2e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead28() {
        cwe22.badRead("%2e%2e/%2e%2e/%2e%2e/%2e%2e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead29() {
        cwe22.badRead("%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead30() {
        cwe22.badRead("%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead31() {
        cwe22.badRead("%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead32() {
        cwe22.badRead("%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead33() {
        cwe22.badRead("%2e%2e%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead34() {
        cwe22.badRead("%2e%2e%2f%2e%2e%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead35() {
        cwe22.badRead("%2e%2e%2f%2e%2e%2f%2e%2e%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead36() {
        cwe22.badRead("%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead37() {
        cwe22.badRead("%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead38() {
        cwe22.badRead("%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead39() {
        cwe22.badRead("%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead40() {
        cwe22.badRead("%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead41() {
        cwe22.badRead("..%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead42() {
        cwe22.badRead("..%252f..%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead43() {
        cwe22.badRead("..%252f..%252f..%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead44() {
        cwe22.badRead("..%252f..%252f..%252f..%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead45() {
        cwe22.badRead("..%252f..%252f..%252f..%252f..%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead46() {
        cwe22.badRead("..%252f..%252f..%252f..%252f..%252f..%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead47() {
        cwe22.badRead("..%252f..%252f..%252f..%252f..%252f..%252f..%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead48() {
        cwe22.badRead("..%252f..%252f..%252f..%252f..%252f..%252f..%252f..%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead49() {
        cwe22.badRead("%252e%252e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead50() {
        cwe22.badRead("%252e%252e/%252e%252e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead51() {
        cwe22.badRead("%252e%252e/%252e%252e/%252e%252e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead52() {
        cwe22.badRead("%252e%252e/%252e%252e/%252e%252e/%252e%252e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead53() {
        cwe22.badRead("%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead54() {
        cwe22.badRead("%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead55() {
        cwe22.badRead("%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead56() {
        cwe22.badRead("%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead57() {
        cwe22.badRead("%252e%252e%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead58() {
        cwe22.badRead("%252e%252e%252f%252e%252e%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead59() {
        cwe22.badRead("%252e%252e%252f%252e%252e%252f%252e%252e%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead60() {
        cwe22.badRead("%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead61() {
        cwe22.badRead("%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead62() {
        cwe22.badRead("%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead63() {
        cwe22.badRead("%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead64() {
        cwe22.badRead("%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead65() {
        cwe22.badRead("..\\/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead66() {
        cwe22.badRead("..\\..\\/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead67() {
        cwe22.badRead("..\\..\\..\\/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead68() {
        cwe22.badRead("..\\..\\..\\..\\/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead69() {
        cwe22.badRead("..\\..\\..\\..\\..\\/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead70() {
        cwe22.badRead("..\\..\\..\\..\\..\\..\\/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead71() {
        cwe22.badRead("..\\..\\..\\..\\..\\..\\..\\/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void badRead72() {
        cwe22.badRead("..\\..\\..\\..\\..\\..\\..\\..\\/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead1() {
        cwe22.goodRead("..//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead2() {
        cwe22.goodRead("../..//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead3() {
        cwe22.goodRead("../../..//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead4() {
        cwe22.goodRead("../../../..//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead5() {
        cwe22.goodRead("../../../../..//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead6() {
        cwe22.goodRead("../../../../../..//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead7() {
        cwe22.goodRead("../../../../../../..//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead8() {
        cwe22.goodRead("../../../../../../../..//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead9() {
        cwe22.goodRead("../passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead10() {
        cwe22.goodRead("../../passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead11() {
        cwe22.goodRead("../../../passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead12() {
        cwe22.goodRead("../../../../passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead13() {
        cwe22.goodRead("../../../../../passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead14() {
        cwe22.goodRead("../../../../../../passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead15() {
        cwe22.goodRead("../../../../../../../passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead16() {
        cwe22.goodRead("../../../../../../../../passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead17() {
        cwe22.goodRead("..%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead18() {
        cwe22.goodRead("..%2f..%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead19() {
        cwe22.goodRead("..%2f..%2f..%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead20() {
        cwe22.goodRead("..%2f..%2f..%2f..%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead21() {
        cwe22.goodRead("..%2f..%2f..%2f..%2f..%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead22() {
        cwe22.goodRead("..%2f..%2f..%2f..%2f..%2f..%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead23() {
        cwe22.goodRead("..%2f..%2f..%2f..%2f..%2f..%2f..%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead24() {
        cwe22.goodRead("..%2f..%2f..%2f..%2f..%2f..%2f..%2f..%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead25() {
        cwe22.goodRead("%2e%2e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead26() {
        cwe22.goodRead("%2e%2e/%2e%2e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead27() {
        cwe22.goodRead("%2e%2e/%2e%2e/%2e%2e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead28() {
        cwe22.goodRead("%2e%2e/%2e%2e/%2e%2e/%2e%2e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead29() {
        cwe22.goodRead("%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead30() {
        cwe22.goodRead("%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead31() {
        cwe22.goodRead("%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead32() {
        cwe22.goodRead("%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead33() {
        cwe22.goodRead("%2e%2e%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead34() {
        cwe22.goodRead("%2e%2e%2f%2e%2e%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead35() {
        cwe22.goodRead("%2e%2e%2f%2e%2e%2f%2e%2e%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead36() {
        cwe22.goodRead("%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead37() {
        cwe22.goodRead("%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead38() {
        cwe22.goodRead("%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead39() {
        cwe22.goodRead("%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead40() {
        cwe22.goodRead("%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f%2e%2e%2f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead41() {
        cwe22.goodRead("..%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead42() {
        cwe22.goodRead("..%252f..%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead43() {
        cwe22.goodRead("..%252f..%252f..%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead44() {
        cwe22.goodRead("..%252f..%252f..%252f..%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead45() {
        cwe22.goodRead("..%252f..%252f..%252f..%252f..%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead46() {
        cwe22.goodRead("..%252f..%252f..%252f..%252f..%252f..%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead47() {
        cwe22.goodRead("..%252f..%252f..%252f..%252f..%252f..%252f..%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead48() {
        cwe22.goodRead("..%252f..%252f..%252f..%252f..%252f..%252f..%252f..%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead49() {
        cwe22.goodRead("%252e%252e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead50() {
        cwe22.goodRead("%252e%252e/%252e%252e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead51() {
        cwe22.goodRead("%252e%252e/%252e%252e/%252e%252e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead52() {
        cwe22.goodRead("%252e%252e/%252e%252e/%252e%252e/%252e%252e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead53() {
        cwe22.goodRead("%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead54() {
        cwe22.goodRead("%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead55() {
        cwe22.goodRead("%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead56() {
        cwe22.goodRead("%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e//passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead57() {
        cwe22.goodRead("%252e%252e%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead58() {
        cwe22.goodRead("%252e%252e%252f%252e%252e%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead59() {
        cwe22.goodRead("%252e%252e%252f%252e%252e%252f%252e%252e%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead60() {
        cwe22.goodRead("%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead61() {
        cwe22.goodRead("%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead62() {
        cwe22.goodRead("%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead63() {
        cwe22.goodRead("%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead64() {
        cwe22.goodRead("%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f%252e%252e%252f/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead65() {
        cwe22.goodRead("..\\/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead66() {
        cwe22.goodRead("..\\..\\/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead67() {
        cwe22.goodRead("..\\..\\..\\/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead68() {
        cwe22.goodRead("..\\..\\..\\..\\/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead69() {
        cwe22.goodRead("..\\..\\..\\..\\..\\/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead70() {
        cwe22.goodRead("..\\..\\..\\..\\..\\..\\/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead71() {
        cwe22.goodRead("..\\..\\..\\..\\..\\..\\..\\/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }

    @Test
    public void goodRead72() {
        cwe22.goodRead("..\\..\\..\\..\\..\\..\\..\\..\\/passwords/passwd.txt");
        Assert.assertFalse(cwe22.isFileRead());
    }
}
