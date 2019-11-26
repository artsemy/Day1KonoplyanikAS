package by.training.epam.ex2.test;

import by.training.epam.ex2.util.DayCounter;
import by.training.epam.exception.MyException;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayCounterTest {

    @Test
    public void countDayTest() throws MyException {
        int actual = DayCounter.countDay(2000, 2);
        int expected = 29;
        assertEquals(actual, expected);
    }

    @Test (expected = MyException.class)
    public void countDayTest_Exception() throws MyException{
        int actual = DayCounter.countDay(2000, 20);
    }

}