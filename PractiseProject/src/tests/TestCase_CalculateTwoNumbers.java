package tests;

import Tasks.SimpleMethodContainerClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.*;

/**
 * Created by hackerhanry on 6/18/16.
 */
@RunWith(value = Parameterized.class)
public class TestCase_CalculateTwoNumbers {
    private int firstNumber,secondNumber;
    private char operand;
    private double expectedResult;

    public TestCase_CalculateTwoNumbers(int firstNumber, int secondNumber, char operand, double expectedResult) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operand = operand;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name = "CalculateTwoNumbers: {0}{2}{1}={3}")
    public static Collection<Object[]> leapYears() {
        return Arrays.asList(new Object[][]{
                {1,1,'+',2},
                {3,3,'-',0},
                {10,10,'*',100},
                {10,3,'/',10./3},
                {10,1,'^',Double.NaN},
                {10,0,'/',Double.NaN}
        });
    }

    @Test
    public void test_CalculateTwoNumbers() throws Exception {
        assertEquals(expectedResult, SimpleMethodContainerClass.CalculateTwoNumbers(firstNumber, secondNumber, operand));
    }

}
