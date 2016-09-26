package f3;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class C32Test {
    private C32 c32;

    @Before
    public void before() {
        c32 = new C32();
    }

    @Test
    public void testC32() {
        assertTrue("mA".equals(c32.mA()));
    }
}
