package tests;

import Tasks.SimpleMethodContainerClass;
import javafx.beans.binding.ObjectExpression;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by hackerhanry on 6/16/16.
 */

@RunWith(value = Parameterized.class)
public class TestCase_IsLeapYear {
    private int year;
    private Boolean expected;


    @Parameterized.Parameters(name = "IsLeapYear(param={0})?->{1} ")
    public static Collection<Object[]> leapYears() {
        return Arrays.asList(new Object[][]{
                {2012, true},
                {2015, false},
                {2013, false},
                {2016, true}
        });
    }

    public TestCase_IsLeapYear(int year, Boolean expected) {
        this.year = year;
        this.expected = expected;
    }


    @Test
    public void test_IsTheGivenYearLeapYear() throws Exception {
        Assert.assertEquals(expected, SimpleMethodContainerClass.IsTheGivenYearLeapYear(year));
    }

}

