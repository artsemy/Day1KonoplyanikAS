package by.training.epam.ex9.runner;

import by.training.epam.ex9.util.CircleFunc;
import by.training.epam.exception.MyException;
import by.training.epam.printer.MyPrinter;
import by.training.epam.scanner.MyScanner;

import java.util.InputMismatchException;

public class RunnerEx9 {

    public static void main(String[] args) {
        int r;
        double res;
        try {
            MyPrinter.print("insert R");
            r = MyScanner.insertInt();
        } catch (InputMismatchException e){
            MyPrinter.print("bad input");
            r = 1;
        }
        try {
            res = CircleFunc.findCircumference(r);
            MyPrinter.print("Circumference = " + res);
            res = CircleFunc.findArea(r);
            MyPrinter.print("Area = " + res);
        } catch (MyException e) {
            MyPrinter.print(e.getMessage());
        }
    }

}
