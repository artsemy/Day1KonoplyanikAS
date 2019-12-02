package by.training.epam.ex5.test;

import by.training.epam.ex5.util.PerfectNumberSearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class PerfectNumberSearchTest {

    @Test
    public void isPerfectTest1() {
        int a = 496;
        boolean actual = PerfectNumberSearch.isPerfect(a);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    public void isPerfectTest2() {
        int a = 497;
        boolean actual = PerfectNumberSearch.isPerfect(a);
        boolean expected = false;
        assertEquals(actual, expected);
    }

}