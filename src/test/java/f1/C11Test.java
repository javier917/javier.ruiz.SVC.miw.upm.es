package f1;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;



public class C11Test {
    private C11 c11;

    @Before
    public void before() {
        c11 = new C11();
    }

    @Test
    public void testM1() {
        assertTrue("m1".equals(c11.m1()));
    }

    @Test
    public void testM2() {
        assertTrue("m2".equals(c11.m2()));
    }
}
