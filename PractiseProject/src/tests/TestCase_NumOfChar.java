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
public class TestCase_NumOfChar {
    private String word;
    private char character;
    private int expectedNumber;

    public TestCase_NumOfChar(String word, char character, int expectedNumber) {
        this.word = word;
        this.character = character;
        this.expectedNumber = expectedNumber;
    }

    @Parameterized.Parameters(name = "{1} char in {0} : {2} piece ")
    public static Collection<Object[]> leapYears() {
        return Arrays.asList(new Object[][]{
                {"asdasd", 'a', 2},
                {"nemtom", 'm', 2},
                {"fdhdfhdhdfhdg", 'a', 0}
        });
    }

    @Test
    public void test_NumberofChars() throws Exception {
        Assert.assertEquals(expectedNumber, SimpleMethodContainerClass.CalculateNumborOfSpecificChar(word, character));
    }
}
