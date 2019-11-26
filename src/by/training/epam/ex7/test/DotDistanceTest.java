package by.training.epam.ex7.test;

import by.training.epam.ex7.bean.MyDot;
import by.training.epam.ex7.util.DotDistance;
import by.training.epam.exception.MyException;
import org.junit.Test;

import static org.junit.Assert.*;

public class DotDistanceTest {

    @Test
    public void findDistanceTest() {
        MyDot d1 = new MyDot(1, 1);
        MyDot d2 = new MyDot(1, 2);
        DotDistance dotDistance = new DotDistance();
        double actual = dotDistance.findDistance(d1, d2);
        double expected = 1;
        assertEquals(actual, expected, 0.0001);
    }

    @Test
    public void nearestToZeroTest() throws MyException {
        MyDot d1 = new MyDot(1, 1);
        MyDot d2 = new MyDot(1, 2);
        DotDistance dotDistance = new DotDistance();
        MyDot actual = dotDistance.nearestToZero(d1, d2);
        MyDot expected = new MyDot(1,1);
        assertEquals(actual, expected);
    }

    @Test (expected = MyException.class)
    public void nearestToZeroTest_Exception() throws MyException {
        MyDot d1 = new MyDot(1, 1);
        MyDot d2 = new MyDot(1, 1);
        DotDistance dotDistance = new DotDistance();
        dotDistance.nearestToZero(d1, d2);
    }
}