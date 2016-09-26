package f2;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;

public class C21Test {
    private C21 c21;

    @Before
    public void before() {
        c21 = new C21();
    }

    @Test
    public void testM1() {
        assertTrue("m1".equals(c21.m1()));
    }

    @Test
    public void testM2() {
        assertTrue("m2".equals(c21.m2()));
    }
}
