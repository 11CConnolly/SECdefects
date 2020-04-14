package cc14g17;

import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CWE193_Off_by_One_ErrorTest {

    private CWE193_Off_by_One_Error cwe;

    @Before
    public void setUp() {
        cwe = new CWE193_Off_by_One_Error();
    }


    // Test code under normal execution
    @Test
    public void good() {
        cwe.good(10);
    }

    // Exploit code
    @Test
    public void bad() throws Exception {
        try {
            cwe.bad(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}