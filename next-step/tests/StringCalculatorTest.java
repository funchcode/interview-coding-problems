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


    //책 코드////////////////////////////////////////////////
    @Test
    public void add_숫자하나() throws Exception {
        assertEquals(1, calculator.add("1"));
    }

    @Test
    public void add_쉼표구분자() throws Exception {
        assertEquals(3, calculator.add("1,2"));
    }

    @Test
    public void split() {
        assertArrayEquals(new String[] {"1"}, "1".split(","));
        assertArrayEquals(new String[] {"1", "2"}, "1,2".split(","));
    }

    @Test
    public void add_쉼표_또는_구분자() throws Exception{
        assertEquals(6, calculator.add("1,2:3"));
    }

    @Test
    public void add_custom_구분자() throws Exception {
        assertEquals(6, calculator.add("//;\n1;2;3"));
    }

    @Test
    public void add_negative() throws Exception {
        calculator.add("-1,2,3");
    }
}