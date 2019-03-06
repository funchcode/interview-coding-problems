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
        String input1 = "//;\n1;2;3,4:5";
        //assertTrue(calculator.hasCustomToken(input));
        calculator.hasCustomToken(input);
        calculator.hasCustomToken(input1);
    }

    @Test
    public void getSumTest() {
        String input = "1:2:,,";
        String input1 = "1:2:3,4,5";
        String input2 = "-1,2:3,4,5";

        assertEquals(3, calculator.getSum(input));
        assertEquals(15, calculator.getSum(input1));
        //assertEquals(15, calculator.getSum(input2)); // 예외발생하는가.
    }

    @Test
    public void negativeNumTest() {
        String input1 = "1";
        String input2 = "2";
        String input3 = "-10";

        assertTrue(calculator.isNegativeNum(input1));
        assertTrue(calculator.isNegativeNum(input2));
        assertTrue(calculator.isNegativeNum(input3));
    }

    @Test
    public void getSumOfStringTest() {
        String input = "//;\n1;2;3,4:5";
        assertEquals(15, calculator.getSumOfString(input));
    }

    @Test
    public void streamMethod() {
        String input = "//;\n1;2;3,4:5";
        System.out.println(calculator.getSum(calculator.hasCustomToken(input)));
    }

}