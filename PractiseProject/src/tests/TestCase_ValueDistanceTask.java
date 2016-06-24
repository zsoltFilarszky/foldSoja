package tests;

import Tasks.ArrayValueDistanceTaskClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by hackerhanry on 6/24/16.
 */
@RunWith(Parameterized.class)
public class TestCase_ValueDistanceTask {

    private int[] _inputArray;
    private int _expectedMaxValue;

    public TestCase_ValueDistanceTask(int[] inputArray, int expectedMaxValue) {
        this._inputArray = inputArray;
        this._expectedMaxValue = expectedMaxValue;
    }

    @Parameterized.Parameters(name = "MaxValue of input array: {1} ")
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {new int[]{8, 2, 4, 9, 5, 8, 0, 3, 8, 2}, 24},
                {new int[]{1,-3,3},6}
        });
    }

    @Test
    public void test_MaxDistanceTest() throws Exception{
        ArrayValueDistanceTaskClass avdInstance = new ArrayValueDistanceTaskClass();
        Assert.assertEquals(_expectedMaxValue,avdInstance.solution(_inputArray));
    }

    @Test
    public void test_MaxDistanceSol2() throws Exception{
        ArrayValueDistanceTaskClass avdInstance = new ArrayValueDistanceTaskClass();
        Assert.assertEquals(_expectedMaxValue, avdInstance.solutionFromStackOverFlow(_inputArray));
    }
}
