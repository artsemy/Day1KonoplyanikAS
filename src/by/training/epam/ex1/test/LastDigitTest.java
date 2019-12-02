package by.training.epam.ex1.test;

import by.training.epam.ex1.util.LastDigit;

import static org.junit.Assert.*;

public class LastDigitTest {

    @org.junit.Test
    public void lastOfSquareTest() {
        int n = 9;
        int actual = LastDigit.lastOfSquare(n);
        int expected = 1;
        assertEquals(actual, expected);
    }

}