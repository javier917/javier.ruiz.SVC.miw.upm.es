package f5;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class C52Test {
    private C52 c52;

    @Before
    public void before() {
        c52 = new C52();
    }
    @Test
    public void testMA() {
        assertTrue("mA".equals(c52.mA()));
    }
}
