package Tasks;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hackerhanry on 6/16/16.
 */
public class SimpleMethodContainerClassTest {

    private SimpleMethodContainerClass generateClass(){
        return new SimpleMethodContainerClass();
    }

    @Test
    public void testCalculateTwoDegreeEquation() throws Exception {
       SimpleMethodContainerClass.IsTheGivenYearLeapYear(10);
    }

    @Test
    public void testCalculateTwoNumbers() throws Exception {

    }

    @Test
    public void testIsTheGivenYearLeapYear() throws Exception {

    }

    @Test
    public void testIsTriangleCreatable() throws Exception {

    }

    @Test
    public void testCalculateNumborOfSpecificChar() throws Exception {

    }
}