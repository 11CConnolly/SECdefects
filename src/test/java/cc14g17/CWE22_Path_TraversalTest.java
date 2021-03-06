package cc14g17;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CWE22_Path_TraversalTest {

    private CWE22_Path_Traversal cwe22;

    @Before
    public void setUp() {
        cwe22 = new CWE22_Path_Traversal();
    }

    @Test
    public void badReadExploit() {
        cwe22.badRead("./../passwords/passwd.txt");
        assertFalse(cwe22.isFileRead());
        cwe22.setFileRead(false);

        cwe22.badRead("./../profiles/alice.txt");
        assertFalse(cwe22.isFileRead());
    }

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
    public void goodReadExploit() {
        cwe22.goodRead("./../passwords/passwd.txt");
        assertFalse(cwe22.isFileRead());
        cwe22.setFileRead(false);

        cwe22.goodRead("./../profiles/alice.txt");
        assertFalse(cwe22.isFileRead());
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
}