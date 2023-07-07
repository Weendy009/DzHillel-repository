package Home_Work.Dz21.classes.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleMathLibraryTest {
    private final SimpleMathLibrary mathLibrary = new SimpleMathLibrary();

    @Test
    public void testPlus() {
        double result = mathLibrary.plus(0.9, 1.1);
        if (result == 2) {
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
        assertEquals(2, result, 0.0001);
    }

    @Test
    public void testMinus() {
        double result = mathLibrary.minus(7.0, 5.0);
        if (result == 2.0) {
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
        assertEquals(2.0, result, 0.0001);
    }
}
