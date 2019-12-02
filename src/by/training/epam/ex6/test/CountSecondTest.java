package by.training.epam.ex6.test;

import by.training.epam.ex6.util.CountSecond;
import by.training.epam.exception.MyException;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountSecondTest {

    @Test
    public void countHoursTest() throws MyException {
        int h = 3600*5 + 1000;
        int actual = CountSecond.countHours(h);
        int expected = 5;
        assertEquals(actual, expected);
    }

    @Test (expected = MyException.class)
    public void countHoursTest_Exception() throws MyException {
        int h = 3600*24 + 1000;
        CountSecond.countHours(h);
    }

    @Test
    public void countMinutesTest() throws MyException {
        int m = 60*7 + 10;
        int actual = CountSecond.countMinutes(m);
        int expected = 7;
        assertEquals(actual, expected);
    }

    @Test (expected = MyException.class)
    public void countMinutesTest_Exception() throws MyException {
        int m = 60*60 + 10;
        CountSecond.countMinutes(m);
    }

    @Test
    public void countSecondsTest() throws MyException {
        int s = 50;
        int actual = CountSecond.countSeconds(s);
        int expected = 50;
        assertEquals(actual, expected);
    }

    @Test (expected = MyException.class)
    public void countSecondsTest_Exception() throws MyException {
        int s = 70;
        CountSecond.countSeconds(s);
    }

}