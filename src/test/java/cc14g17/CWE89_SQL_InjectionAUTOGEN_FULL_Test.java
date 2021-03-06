package cc14g17;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * AUTOMATICALLY GENERATED TEST SUITE
 * @author cc14g17
 */
public class CWE89_SQL_InjectionAUTOGEN_FULL_Test {

    private CWE89_SQL_Injection cwe89;

    @Before
    public void setUp() {
        cwe89 = new CWE89_SQL_Injection();
    }

    /*
    Start of Manual Functional Tests
     */

    @Test
    public void badLoginFunctional() {
        cwe89.badLogin("incorrect", "details");
        Assert.assertFalse(cwe89.isLoggedIn());

        cwe89.badLogin("callum", "connolly");
        Assert.assertTrue(cwe89.isLoggedIn());
    }

    @Test
    public void goodLoginFunctional() {
        cwe89.goodLogin("incorrect", "details");
        Assert.assertFalse(cwe89.isLoggedIn());

        cwe89.goodLogin("callum", "connolly");
        Assert.assertTrue(cwe89.isLoggedIn());
    }

    /*
    Start of Generated Tests
     */

    @Test
    public void badLogin1() {
        cwe89.badLogin("OR 1=1", "OR 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin2() {
        cwe89.badLogin("OR 1=0", "OR 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin3() {
        cwe89.badLogin("OR x=x", "OR x=x");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin4() {
        cwe89.badLogin("OR x=y", "OR x=y");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin5() {
        cwe89.badLogin("OR 1=1#", "OR 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin6() {
        cwe89.badLogin("OR 1=0#", "OR 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin7() {
        cwe89.badLogin("OR x=x#", "OR x=x#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin8() {
        cwe89.badLogin("OR x=y#", "OR x=y#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin9() {
        cwe89.badLogin("OR 1=1-- ", "OR 1=1-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin10() {
        cwe89.badLogin("OR 1=0-- ", "OR 1=0-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin11() {
        cwe89.badLogin("OR x=x-- ", "OR x=x-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin12() {
        cwe89.badLogin("OR x=y-- ", "OR x=y-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin13() {
        cwe89.badLogin("OR 3409=3409 AND ('pytW' LIKE 'pytW", "OR 3409=3409 AND ('pytW' LIKE 'pytW");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin14() {
        cwe89.badLogin("OR 3409=3409 AND ('pytW' LIKE 'pytY", "OR 3409=3409 AND ('pytW' LIKE 'pytY");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin15() {
        cwe89.badLogin("HAVING 1=1", "HAVING 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin16() {
        cwe89.badLogin("HAVING 1=0", "HAVING 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin17() {
        cwe89.badLogin("HAVING 1=1#", "HAVING 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin18() {
        cwe89.badLogin("HAVING 1=0#", "HAVING 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin19() {
        cwe89.badLogin("HAVING 1=1-- ", "HAVING 1=1-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin20() {
        cwe89.badLogin("HAVING 1=0-- ", "HAVING 1=0-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin21() {
        cwe89.badLogin("AND 1=1", "AND 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin22() {
        cwe89.badLogin("AND 1=0", "AND 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin23() {
        cwe89.badLogin("AND 1=1-- ", "AND 1=1-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin24() {
        cwe89.badLogin("AND 1=0-- ", "AND 1=0-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin25() {
        cwe89.badLogin("AND 1=1#", "AND 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin26() {
        cwe89.badLogin("AND 1=0#", "AND 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin27() {
        cwe89.badLogin("AND 1=1 AND '%'='", "AND 1=1 AND '%'='");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin28() {
        cwe89.badLogin("AND 1=0 AND '%'='", "AND 1=0 AND '%'='");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin29() {
        cwe89.badLogin("' OR 1=1", "' OR 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin30() {
        cwe89.badLogin("' OR 1=0", "' OR 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin31() {
        cwe89.badLogin("' OR x=x", "' OR x=x");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin32() {
        cwe89.badLogin("' OR x=y", "' OR x=y");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin33() {
        cwe89.badLogin("' OR 1=1#", "' OR 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin34() {
        cwe89.badLogin("' OR 1=0#", "' OR 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin35() {
        cwe89.badLogin("' OR x=x#", "' OR x=x#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin36() {
        cwe89.badLogin("' OR x=y#", "' OR x=y#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin37() {
        cwe89.badLogin("' OR 1=1-- ", "' OR 1=1-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin38() {
        cwe89.badLogin("' OR 1=0-- ", "' OR 1=0-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin39() {
        cwe89.badLogin("' OR x=x-- ", "' OR x=x-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin40() {
        cwe89.badLogin("' OR x=y-- ", "' OR x=y-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin41() {
        cwe89.badLogin("' OR 3409=3409 AND ('pytW' LIKE 'pytW", "' OR 3409=3409 AND ('pytW' LIKE 'pytW");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin42() {
        cwe89.badLogin("' OR 3409=3409 AND ('pytW' LIKE 'pytY", "' OR 3409=3409 AND ('pytW' LIKE 'pytY");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin43() {
        cwe89.badLogin("' HAVING 1=1", "' HAVING 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin44() {
        cwe89.badLogin("' HAVING 1=0", "' HAVING 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin45() {
        cwe89.badLogin("' HAVING 1=1#", "' HAVING 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin46() {
        cwe89.badLogin("' HAVING 1=0#", "' HAVING 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin47() {
        cwe89.badLogin("' HAVING 1=1-- ", "' HAVING 1=1-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin48() {
        cwe89.badLogin("' HAVING 1=0-- ", "' HAVING 1=0-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin49() {
        cwe89.badLogin("' AND 1=1", "' AND 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin50() {
        cwe89.badLogin("' AND 1=0", "' AND 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin51() {
        cwe89.badLogin("' AND 1=1-- ", "' AND 1=1-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin52() {
        cwe89.badLogin("' AND 1=0-- ", "' AND 1=0-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin53() {
        cwe89.badLogin("' AND 1=1#", "' AND 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin54() {
        cwe89.badLogin("' AND 1=0#", "' AND 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin55() {
        cwe89.badLogin("' AND 1=1 AND '%'='", "' AND 1=1 AND '%'='");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin56() {
        cwe89.badLogin("' AND 1=0 AND '%'='", "' AND 1=0 AND '%'='");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin57() {
        cwe89.badLogin("OR 1=1", "OR 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin58() {
        cwe89.badLogin("OR 1=0", "OR 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin59() {
        cwe89.badLogin("OR x=x", "OR x=x");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin60() {
        cwe89.badLogin("OR x=y", "OR x=y");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin61() {
        cwe89.badLogin("OR 1=1#", "OR 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin62() {
        cwe89.badLogin("OR 1=0#", "OR 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin63() {
        cwe89.badLogin("OR x=x#", "OR x=x#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin64() {
        cwe89.badLogin("OR x=y#", "OR x=y#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin65() {
        cwe89.badLogin("OR 1=1 -- ", "OR 1=1 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin66() {
        cwe89.badLogin("OR 1=0 -- ", "OR 1=0 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin67() {
        cwe89.badLogin("OR x=x -- ", "OR x=x -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin68() {
        cwe89.badLogin("OR x=y -- ", "OR x=y -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin69() {
        cwe89.badLogin("OR 3409=3409 AND ('pytW' LIKE 'pytW", "OR 3409=3409 AND ('pytW' LIKE 'pytW");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin70() {
        cwe89.badLogin("OR 3409=3409 AND ('pytW' LIKE 'pytY", "OR 3409=3409 AND ('pytW' LIKE 'pytY");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin71() {
        cwe89.badLogin("HAVING 1=1", "HAVING 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin72() {
        cwe89.badLogin("HAVING 1=0", "HAVING 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin73() {
        cwe89.badLogin("HAVING 1=1#", "HAVING 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin74() {
        cwe89.badLogin("HAVING 1=0#", "HAVING 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin75() {
        cwe89.badLogin("HAVING 1=1 -- ", "HAVING 1=1 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin76() {
        cwe89.badLogin("HAVING 1=0 -- ", "HAVING 1=0 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin77() {
        cwe89.badLogin("AND 1=1", "AND 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin78() {
        cwe89.badLogin("AND 1=0", "AND 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin79() {
        cwe89.badLogin("AND 1=1 -- ", "AND 1=1 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin80() {
        cwe89.badLogin("AND 1=0 -- ", "AND 1=0 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin81() {
        cwe89.badLogin("AND 1=1#", "AND 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin82() {
        cwe89.badLogin("AND 1=0#", "AND 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin83() {
        cwe89.badLogin("AND 1=1 AND '%'='", "AND 1=1 AND '%'='");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin84() {
        cwe89.badLogin("AND 1=0 AND '%'='", "AND 1=0 AND '%'='");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin85() {
        cwe89.badLogin("' OR 1=1", "' OR 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin86() {
        cwe89.badLogin("' OR 1=0", "' OR 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin87() {
        cwe89.badLogin("' OR x=x", "' OR x=x");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin88() {
        cwe89.badLogin("' OR x=y", "' OR x=y");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin89() {
        cwe89.badLogin("' OR 1=1#", "' OR 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin90() {
        cwe89.badLogin("' OR 1=0#", "' OR 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin91() {
        cwe89.badLogin("' OR x=x#", "' OR x=x#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin92() {
        cwe89.badLogin("' OR x=y#", "' OR x=y#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin93() {
        cwe89.badLogin("' OR 1=1 -- ", "' OR 1=1 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin94() {
        cwe89.badLogin("' OR 1=0 -- ", "' OR 1=0 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin95() {
        cwe89.badLogin("' OR x=x -- ", "' OR x=x -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin96() {
        cwe89.badLogin("' OR x=y -- ", "' OR x=y -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin97() {
        cwe89.badLogin("' OR 3409=3409 AND ('pytW' LIKE 'pytW", "' OR 3409=3409 AND ('pytW' LIKE 'pytW");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin98() {
        cwe89.badLogin("' OR 3409=3409 AND ('pytW' LIKE 'pytY", "' OR 3409=3409 AND ('pytW' LIKE 'pytY");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin99() {
        cwe89.badLogin("' HAVING 1=1", "' HAVING 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin100() {
        cwe89.badLogin("' HAVING 1=0", "' HAVING 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin101() {
        cwe89.badLogin("' HAVING 1=1#", "' HAVING 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin102() {
        cwe89.badLogin("' HAVING 1=0#", "' HAVING 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin103() {
        cwe89.badLogin("' HAVING 1=1 -- ", "' HAVING 1=1 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin104() {
        cwe89.badLogin("' HAVING 1=0 -- ", "' HAVING 1=0 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin105() {
        cwe89.badLogin("' AND 1=1", "' AND 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin106() {
        cwe89.badLogin("' AND 1=0", "' AND 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin107() {
        cwe89.badLogin("' AND 1=1 -- ", "' AND 1=1 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin108() {
        cwe89.badLogin("' AND 1=0 -- ", "' AND 1=0 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin109() {
        cwe89.badLogin("' AND 1=1#", "' AND 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin110() {
        cwe89.badLogin("' AND 1=0#", "' AND 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin111() {
        cwe89.badLogin("' AND 1=1 AND '%'='", "' AND 1=1 AND '%'='");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLogin112() {
        cwe89.badLogin("' AND 1=0 AND '%'='", "' AND 1=0 AND '%'='");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin1() {
        cwe89.goodLogin("OR 1=1", "OR 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin2() {
        cwe89.goodLogin("OR 1=0", "OR 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin3() {
        cwe89.goodLogin("OR x=x", "OR x=x");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin4() {
        cwe89.goodLogin("OR x=y", "OR x=y");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin5() {
        cwe89.goodLogin("OR 1=1#", "OR 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin6() {
        cwe89.goodLogin("OR 1=0#", "OR 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin7() {
        cwe89.goodLogin("OR x=x#", "OR x=x#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin8() {
        cwe89.goodLogin("OR x=y#", "OR x=y#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin9() {
        cwe89.goodLogin("OR 1=1-- ", "OR 1=1-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin10() {
        cwe89.goodLogin("OR 1=0-- ", "OR 1=0-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin11() {
        cwe89.goodLogin("OR x=x-- ", "OR x=x-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin12() {
        cwe89.goodLogin("OR x=y-- ", "OR x=y-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin13() {
        cwe89.goodLogin("OR 3409=3409 AND ('pytW' LIKE 'pytW", "OR 3409=3409 AND ('pytW' LIKE 'pytW");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin14() {
        cwe89.goodLogin("OR 3409=3409 AND ('pytW' LIKE 'pytY", "OR 3409=3409 AND ('pytW' LIKE 'pytY");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin15() {
        cwe89.goodLogin("HAVING 1=1", "HAVING 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin16() {
        cwe89.goodLogin("HAVING 1=0", "HAVING 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin17() {
        cwe89.goodLogin("HAVING 1=1#", "HAVING 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin18() {
        cwe89.goodLogin("HAVING 1=0#", "HAVING 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin19() {
        cwe89.goodLogin("HAVING 1=1-- ", "HAVING 1=1-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin20() {
        cwe89.goodLogin("HAVING 1=0-- ", "HAVING 1=0-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin21() {
        cwe89.goodLogin("AND 1=1", "AND 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin22() {
        cwe89.goodLogin("AND 1=0", "AND 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin23() {
        cwe89.goodLogin("AND 1=1-- ", "AND 1=1-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin24() {
        cwe89.goodLogin("AND 1=0-- ", "AND 1=0-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin25() {
        cwe89.goodLogin("AND 1=1#", "AND 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin26() {
        cwe89.goodLogin("AND 1=0#", "AND 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin27() {
        cwe89.goodLogin("AND 1=1 AND '%'='", "AND 1=1 AND '%'='");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin28() {
        cwe89.goodLogin("AND 1=0 AND '%'='", "AND 1=0 AND '%'='");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin29() {
        cwe89.goodLogin("' OR 1=1", "' OR 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin30() {
        cwe89.goodLogin("' OR 1=0", "' OR 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin31() {
        cwe89.goodLogin("' OR x=x", "' OR x=x");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin32() {
        cwe89.goodLogin("' OR x=y", "' OR x=y");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin33() {
        cwe89.goodLogin("' OR 1=1#", "' OR 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin34() {
        cwe89.goodLogin("' OR 1=0#", "' OR 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin35() {
        cwe89.goodLogin("' OR x=x#", "' OR x=x#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin36() {
        cwe89.goodLogin("' OR x=y#", "' OR x=y#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin37() {
        cwe89.goodLogin("' OR 1=1-- ", "' OR 1=1-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin38() {
        cwe89.goodLogin("' OR 1=0-- ", "' OR 1=0-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin39() {
        cwe89.goodLogin("' OR x=x-- ", "' OR x=x-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin40() {
        cwe89.goodLogin("' OR x=y-- ", "' OR x=y-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin41() {
        cwe89.goodLogin("' OR 3409=3409 AND ('pytW' LIKE 'pytW", "' OR 3409=3409 AND ('pytW' LIKE 'pytW");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin42() {
        cwe89.goodLogin("' OR 3409=3409 AND ('pytW' LIKE 'pytY", "' OR 3409=3409 AND ('pytW' LIKE 'pytY");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin43() {
        cwe89.goodLogin("' HAVING 1=1", "' HAVING 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin44() {
        cwe89.goodLogin("' HAVING 1=0", "' HAVING 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin45() {
        cwe89.goodLogin("' HAVING 1=1#", "' HAVING 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin46() {
        cwe89.goodLogin("' HAVING 1=0#", "' HAVING 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin47() {
        cwe89.goodLogin("' HAVING 1=1-- ", "' HAVING 1=1-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin48() {
        cwe89.goodLogin("' HAVING 1=0-- ", "' HAVING 1=0-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin49() {
        cwe89.goodLogin("' AND 1=1", "' AND 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin50() {
        cwe89.goodLogin("' AND 1=0", "' AND 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin51() {
        cwe89.goodLogin("' AND 1=1-- ", "' AND 1=1-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin52() {
        cwe89.goodLogin("' AND 1=0-- ", "' AND 1=0-- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin53() {
        cwe89.goodLogin("' AND 1=1#", "' AND 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin54() {
        cwe89.goodLogin("' AND 1=0#", "' AND 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin55() {
        cwe89.goodLogin("' AND 1=1 AND '%'='", "' AND 1=1 AND '%'='");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin56() {
        cwe89.goodLogin("' AND 1=0 AND '%'='", "' AND 1=0 AND '%'='");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin57() {
        cwe89.goodLogin("OR 1=1", "OR 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin58() {
        cwe89.goodLogin("OR 1=0", "OR 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin59() {
        cwe89.goodLogin("OR x=x", "OR x=x");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin60() {
        cwe89.goodLogin("OR x=y", "OR x=y");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin61() {
        cwe89.goodLogin("OR 1=1#", "OR 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin62() {
        cwe89.goodLogin("OR 1=0#", "OR 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin63() {
        cwe89.goodLogin("OR x=x#", "OR x=x#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin64() {
        cwe89.goodLogin("OR x=y#", "OR x=y#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin65() {
        cwe89.goodLogin("OR 1=1 -- ", "OR 1=1 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin66() {
        cwe89.goodLogin("OR 1=0 -- ", "OR 1=0 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin67() {
        cwe89.goodLogin("OR x=x -- ", "OR x=x -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin68() {
        cwe89.goodLogin("OR x=y -- ", "OR x=y -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin69() {
        cwe89.goodLogin("OR 3409=3409 AND ('pytW' LIKE 'pytW", "OR 3409=3409 AND ('pytW' LIKE 'pytW");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin70() {
        cwe89.goodLogin("OR 3409=3409 AND ('pytW' LIKE 'pytY", "OR 3409=3409 AND ('pytW' LIKE 'pytY");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin71() {
        cwe89.goodLogin("HAVING 1=1", "HAVING 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin72() {
        cwe89.goodLogin("HAVING 1=0", "HAVING 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin73() {
        cwe89.goodLogin("HAVING 1=1#", "HAVING 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin74() {
        cwe89.goodLogin("HAVING 1=0#", "HAVING 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin75() {
        cwe89.goodLogin("HAVING 1=1 -- ", "HAVING 1=1 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin76() {
        cwe89.goodLogin("HAVING 1=0 -- ", "HAVING 1=0 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin77() {
        cwe89.goodLogin("AND 1=1", "AND 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin78() {
        cwe89.goodLogin("AND 1=0", "AND 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin79() {
        cwe89.goodLogin("AND 1=1 -- ", "AND 1=1 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin80() {
        cwe89.goodLogin("AND 1=0 -- ", "AND 1=0 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin81() {
        cwe89.goodLogin("AND 1=1#", "AND 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin82() {
        cwe89.goodLogin("AND 1=0#", "AND 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin83() {
        cwe89.goodLogin("AND 1=1 AND '%'='", "AND 1=1 AND '%'='");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin84() {
        cwe89.goodLogin("AND 1=0 AND '%'='", "AND 1=0 AND '%'='");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin85() {
        cwe89.goodLogin("' OR 1=1", "' OR 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin86() {
        cwe89.goodLogin("' OR 1=0", "' OR 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin87() {
        cwe89.goodLogin("' OR x=x", "' OR x=x");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin88() {
        cwe89.goodLogin("' OR x=y", "' OR x=y");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin89() {
        cwe89.goodLogin("' OR 1=1#", "' OR 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin90() {
        cwe89.goodLogin("' OR 1=0#", "' OR 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin91() {
        cwe89.goodLogin("' OR x=x#", "' OR x=x#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin92() {
        cwe89.goodLogin("' OR x=y#", "' OR x=y#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin93() {
        cwe89.goodLogin("' OR 1=1 -- ", "' OR 1=1 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin94() {
        cwe89.goodLogin("' OR 1=0 -- ", "' OR 1=0 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin95() {
        cwe89.goodLogin("' OR x=x -- ", "' OR x=x -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin96() {
        cwe89.goodLogin("' OR x=y -- ", "' OR x=y -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin97() {
        cwe89.goodLogin("' OR 3409=3409 AND ('pytW' LIKE 'pytW", "' OR 3409=3409 AND ('pytW' LIKE 'pytW");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin98() {
        cwe89.goodLogin("' OR 3409=3409 AND ('pytW' LIKE 'pytY", "' OR 3409=3409 AND ('pytW' LIKE 'pytY");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin99() {
        cwe89.goodLogin("' HAVING 1=1", "' HAVING 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin100() {
        cwe89.goodLogin("' HAVING 1=0", "' HAVING 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin101() {
        cwe89.goodLogin("' HAVING 1=1#", "' HAVING 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin102() {
        cwe89.goodLogin("' HAVING 1=0#", "' HAVING 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin103() {
        cwe89.goodLogin("' HAVING 1=1 -- ", "' HAVING 1=1 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin104() {
        cwe89.goodLogin("' HAVING 1=0 -- ", "' HAVING 1=0 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin105() {
        cwe89.goodLogin("' AND 1=1", "' AND 1=1");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin106() {
        cwe89.goodLogin("' AND 1=0", "' AND 1=0");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin107() {
        cwe89.goodLogin("' AND 1=1 -- ", "' AND 1=1 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin108() {
        cwe89.goodLogin("' AND 1=0 -- ", "' AND 1=0 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin109() {
        cwe89.goodLogin("' AND 1=1#", "' AND 1=1#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin110() {
        cwe89.goodLogin("' AND 1=0#", "' AND 1=0#");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin111() {
        cwe89.goodLogin("' AND 1=1 AND '%'='", "' AND 1=1 AND '%'='");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLogin112() {
        cwe89.goodLogin("' AND 1=0 AND '%'='", "' AND 1=0 AND '%'='");
        Assert.assertFalse(cwe89.isLoggedIn());
    }
}
