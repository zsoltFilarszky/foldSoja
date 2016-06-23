package tests;

import Tasks.FizzBuzzerClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by hackerhanry on 6/23/16.
 */

@RunWith(value = Parameterized.class)
public class TestCase_FizzBuzzWoof {

    private int _numberN;
    private String _expectedString;
    private int _inspectedIndex;

    public TestCase_FizzBuzzWoof(int _numberN, int inspectedIndex, String _expectedString) {
        this._numberN = _numberN;
        this._expectedString = _expectedString;
        _inspectedIndex=inspectedIndex;
    }

    @Parameterized.Parameters(name = "FizzBuzz: N={0}")
    public static Collection<Object[]> leapYears() {
        return Arrays.asList(new Object[][]{
                {10,4,"4"},
                {4,3,"Fizz"},
                {100,15,"FizzBuzz"},
                {5,0,"0"},
                {10,9,"Fizz"}
        });
    }

    @Test
    public void test_ValidateFizzBuzz(){
        FizzBuzzerClass fizzBuzzerClass = new FizzBuzzerClass();
        String[] result = fizzBuzzerClass.souliton(_numberN);
        Assert.assertEquals(_expectedString,result[_inspectedIndex]);
    }

}
