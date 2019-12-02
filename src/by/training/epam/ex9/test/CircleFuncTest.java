package by.training.epam.ex9.test;

import by.training.epam.ex9.util.CircleFunc;
import by.training.epam.exception.MyException;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleFuncTest {

    @Test
    public void findCircumferenceTest() throws MyException {
        int r = 1;
        double actual = CircleFunc.findCircumference(r);
        double expected = 6.28;
        assertEquals(actual, expected, 0.01);
    }

    @Test (expected = MyException.class)
    public void findCircumferenceTest_Exception() throws MyException {
        int r = -1;
        CircleFunc.findCircumference(r);
    }

    @Test
    public void findAreaTest() throws MyException {
        int r = 1;
        double actual = CircleFunc.findArea(r);
        double expected = 3.14;
        assertEquals(actual, expected, 0.01);
    }

    @Test (expected = MyException.class)
    public void findAreaTest_Exception() throws MyException {
        int r = -1;
        CircleFunc.findArea(r);
    }

}