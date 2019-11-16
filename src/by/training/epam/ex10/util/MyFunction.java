package by.training.epam.ex10.util;

import by.training.epam.exception.MyException;
import by.training.epam.printer.MyPrinter;

public class MyFunction {

    public static void printValues(double a, double b, double h) throws MyException {
        double x = a, f;
        if (a > b || h < 0 || h > Math.abs(a-b)){
            throw new MyException("bad input");
        }
        while (x <= b) {
            f = findValue(x);
            MyPrinter.print(x + " : "  + f);
            x += h;
        }
    }

    public static double findValue(double x){
        return Math.tan(x);
    }

}
