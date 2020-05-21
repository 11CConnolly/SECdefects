package cc14g17;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CWE89_SQL_InjectionTest {

    private CWE89_SQL_Injection cwe89;

    @Before
    public void setUp() { cwe89 = new CWE89_SQL_Injection(); }

    @Test
    public void badLoginExploit() {
        cwe89.badLogin("injection", "' OR 1=1 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void badLoginFunctional() {
        cwe89.badLogin("incorrect", "details");
        Assert.assertFalse(cwe89.isLoggedIn());

        cwe89.badLogin("callum", "connolly");
        Assert.assertTrue(cwe89.isLoggedIn());
    }

    @Test
    public void goodLoginExploit() {
        cwe89.goodLogin("injection", "' OR 1=1 -- ");
        Assert.assertFalse(cwe89.isLoggedIn());
    }

    @Test
    public void goodLoginFunctional() {
        cwe89.goodLogin("incorrect", "details");
        Assert.assertFalse(cwe89.isLoggedIn());

        cwe89.goodLogin("callum", "connolly");
        Assert.assertTrue(cwe89.isLoggedIn());
    }
}