package by.training.epam.ex8.test;

import by.training.epam.ex8.util.Function;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionTest {

    @Test
    public void funcTest1() {
        int n = 3;
        double actual = Function.func(n);
        double expected = 9;
        assertEquals(actual, expected, 0.0001);
    }

    @Test
    public void funcTest2() {
        int n = 1;
        double actual = Function.func(n);
        double expected = -0.2;
        assertEquals(actual, expected, 0.0001);
    }

}