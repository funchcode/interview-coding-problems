import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    StringCalculator calculator;

    @Before
    public void setCalculator() {
        calculator = new StringCalculator();
    }

    @Test
    public void customTokenTest() {
        String input = "//;\n1;2;3";
        //assertTrue(calculator.hasCustomToken(input));
        calculator.hasCustomToken(input);
    }

}