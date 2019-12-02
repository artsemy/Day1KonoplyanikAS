package by.training.epam.ex4.test;

import by.training.epam.ex4.util.EvenSearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenSearchTest {

    @Test
    public void twoEvenTest1() {
        int a = 1, b = 1, c = 1, d = 1;
        boolean actual = EvenSearch.twoEven(a, b, c, d);
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @Test
    public void twoEvenTest2() {
        int a = 1, b = 1, c = 1, d = 2;
        boolean actual = EvenSearch.twoEven(a, b, c, d);
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @Test
    public void twoEvenTest3() {
        int a = 1, b = 1, c = 2, d = 2;
        boolean actual = EvenSearch.twoEven(a, b, c, d);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    public void twoEvenTest4() {
        int a = 1, b = 2, c = 2, d = 2;
        boolean actual = EvenSearch.twoEven(a, b, c, d);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    public void twoEvenTest5() {
        int a = 2, b = 2, c = 2, d = 2;
        boolean actual = EvenSearch.twoEven(a, b, c, d);
        boolean expected = true;
        assertEquals(actual, expected);
    }

}