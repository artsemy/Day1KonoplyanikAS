package by.training.epam.ex10.test;

import by.training.epam.ex10.util.MyFunction;
import by.training.epam.exception.MyException;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyFunctionTest {

    @Test (expected = MyException.class)
    public void printValuesTest_Exception1() throws MyException {
        double a = 3, b = 1, h = 0.1;
        MyFunction.printValues(a, b, h);
    }

    @Test (expected = MyException.class)
    public void printValuesTest_Exception2() throws MyException {
        double a = 1, b = 3, h = -1;
        MyFunction.printValues(a, b, h);
    }

    @Test (expected = MyException.class)
    public void printValuesTest_Exception3() throws MyException {
        double a = 1, b = 3, h = 2.1;
        MyFunction.printValues(a, b, h);
    }

}