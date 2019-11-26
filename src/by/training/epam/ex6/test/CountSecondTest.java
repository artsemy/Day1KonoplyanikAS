package by.training.epam.ex6.test;

import by.training.epam.ex6.util.CountSecond;
import by.training.epam.exception.MyException;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountSecondTest {

    @Test
    public void countHoursTest() throws MyException {
        CountSecond countSecond = new CountSecond();
        int h = 3600*5 + 1000;
        int actual = countSecond.countHours(h);
        int expected = 5;
        assertEquals(actual, expected);
    }

    @Test (expected = MyException.class)
    public void countHoursTest_Exception() throws MyException {
        CountSecond countSecond = new CountSecond();
        int h = 3600*24 + 1000;
        countSecond.countHours(h);
    }

    @Test
    public void countMinutesTest() throws MyException {
        CountSecond countSecond = new CountSecond();
        int m = 60*7 + 10;
        int actual = countSecond.countMinutes(m);
        int expected = 7;
        assertEquals(actual, expected);
    }

    @Test (expected = MyException.class)
    public void countMinutesTest_Exception() throws MyException {
        CountSecond countSecond = new CountSecond();
        int m = 60*60 + 10;
        countSecond.countMinutes(m);
    }

    @Test
    public void countSecondsTest() throws MyException {
        CountSecond countSecond = new CountSecond();
        int s = 50;
        int actual = countSecond.countSeconds(s);
        int expected = 50;
        assertEquals(actual, expected);
    }

    @Test (expected = MyException.class)
    public void countSecondsTest_Exception() throws MyException {
        CountSecond countSecond = new CountSecond();
        int s = 70;
        countSecond.countSeconds(s);
    }
}