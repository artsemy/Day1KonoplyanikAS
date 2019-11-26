package by.training.epam.ex3.test;

import by.training.epam.ex3.util.SquareAndCircle;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareAndCircleTest {

    @Test
    public void inscribedSquareAreaTest() {
        SquareAndCircle squareAndCircle = new SquareAndCircle();
        double d = 1;
        double expected = squareAndCircle.inscribedSquareArea(d);
        double actual = 2;
        assertEquals(actual, expected, 0.00001);
    }

    @Test
    public void inscribedCircleRadiosTest() {
        SquareAndCircle squareAndCircle = new SquareAndCircle();
        double d = 2;
        double expected = squareAndCircle.inscribedCircleRadios(d);
        double actual = 1;
        assertEquals(actual, expected, 0.00001);
    }

    @Test
    public void squareSideTest() {
        SquareAndCircle squareAndCircle = new SquareAndCircle();
        double d = 4;
        double expected = squareAndCircle.squareSide(d);
        double actual = 2;
        assertEquals(actual, expected, 0.00001);
    }

    @Test
    public void areaDifferenceTest() {
        SquareAndCircle squareAndCircle = new SquareAndCircle();
        double d1 = 4, d2 = 2;
        double expected = squareAndCircle.areaDifference(d1, d2);
        double actual = 2;
        assertEquals(actual, expected, 0.00001);
    }
}