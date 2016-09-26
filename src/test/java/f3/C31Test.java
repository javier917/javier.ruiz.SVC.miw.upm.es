package f3;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;

public class C31Test {
    private C31 c31;

    @Before
    public void before() {
        c31 = new C31();
    }

    @Test
    public void testM1() {
        assertTrue("m1".equals(c31.m1()));
    }

    @Test
    public void testM2() {
        assertTrue("m2".equals(c31.m2()));
    }

}
