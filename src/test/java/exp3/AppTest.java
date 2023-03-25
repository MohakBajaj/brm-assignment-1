package exp3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithSum() {
        assertEquals(new App().sum(1, 2), 3);
    }

    @Test
    public void shouldAnswerWithSub() {
        assertEquals(new App().sub(1, 2), -1);
    }

    @Test
    public void shouldAnswerWithMul() {
        assertEquals(new App().mul(1, 2), 2);
    }

    @Test
    public void shouldAnswerWithDiv() {
        assertEquals(new App().div(4, 2), 2);
    }

    @Test
    public void shouldAnswerWithMod() {
        assertEquals(new App().mod(5, 2), 1);
    }
}
