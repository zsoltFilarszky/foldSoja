package tests;

import Tasks.SimpleMethodContainerClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static junit.framework.TestCase.*;
import java.util.Arrays;
import java.util.Collection;


@RunWith(value = Parameterized.class)
public class TestCase_TriangleCreatable{

    private int numberA,numberB,numberC;
    private boolean expected;

    public TestCase_TriangleCreatable(int numberA, int numberB, int numberC, boolean expected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
        this.expected = expected;
    }


    @Parameterized.Parameters(name = "IsCreatable({0},{1},{2}) -> {3} ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 10, false},
                {4, 5, 6, true},
                {3,3,3,true},
                {1,2,3,false},
                {100,1,50,false}
        });
    }

    @Test
    public void test_IsTriangleCreatable() throws Exception {
        assertEquals(expected, SimpleMethodContainerClass.IsTriangleCreatable(numberA, numberB, numberC));
    }
}
