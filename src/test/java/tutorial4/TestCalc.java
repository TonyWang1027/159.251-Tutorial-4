package tutorial4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestCalc {

    @Test
    public void testAddTwoValues() {
        Calc calc = new Calc();
        int value1 = 10;
        int value2 = 5;
        assertEquals(15, calc.add(value1, value2));
    }
}
