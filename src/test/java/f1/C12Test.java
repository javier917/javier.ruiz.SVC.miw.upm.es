package f1;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class C12Test {
    private C12 c12;

    @Before
    public void before() {
        c12 = new C12();
    }

    @Test
    public void testM1() {
        assertTrue("mA".equals(c12.mA()));
    }
}
