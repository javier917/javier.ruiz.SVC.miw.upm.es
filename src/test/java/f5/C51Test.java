package f5;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class C51Test {
    private C51 c51;

    @Before
    public void before() {
        c51 = new C51();
    }

    @Test
    public void testM1() {
        assertTrue("m1".equals(c51.m1()));
    }

    @Test
    public void testM2() {
        assertTrue("m2".equals(c51.m2()));
    }
}
