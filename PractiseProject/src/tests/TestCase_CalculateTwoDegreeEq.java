package tests;

import Tasks.SimpleMethodContainerClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;



/**
 * Created by hackerhanry on 6/18/16.
 */

@RunWith(value = Parameterized.class)
public class TestCase_CalculateTwoDegreeEq {

    private double A,B,C;
    private Double[] expectedResults;

    @Parameterized.Parameters(name = "CalculateTwoDegree: {0}x^2+{1}x+{2}=0")
    public static Collection<Object[]> leapYears() {
        return Arrays.asList(new Object[][]{
                {1, -3, -4,new Double[]{4d,-1d}},
                {1,0,-4,new Double[]{+2d,-2d}},
                {1,-7,0,new Double[]{7d,0d}},
                {1,0,10,null}
        });
    }

    public TestCase_CalculateTwoDegreeEq(double a, double b, double c, Double[] expectedResults) {
        A = a;
        B = b;
        C = c;
        this.expectedResults = expectedResults;
    }

    @Test
    public void test_CalculateTwoDegreeEq() throws Exception{
        Assert.assertEquals(expectedResults, SimpleMethodContainerClass.CalculateTwoDegreeEquation(A,B,C));
    }
}
