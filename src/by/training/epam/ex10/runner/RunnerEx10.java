package by.training.epam.ex10.runner;

import by.training.epam.ex10.util.MyFunction;
import by.training.epam.exception.MyException;
import by.training.epam.printer.MyPrinter;
import by.training.epam.scanner.MyScanner;

import java.util.InputMismatchException;

public class RunnerEx10 {

    public static void main(String[] args) {
        double a, b, h;
        try {
            MyPrinter.print("insert a, b, h");
            a = MyScanner.insertDouble();
            b = MyScanner.insertDouble();
            h = MyScanner.insertDouble();
        } catch (InputMismatchException e){
            MyPrinter.print("bad input");
            a = 0;
            b = 1;
            h = 0.5;
        }
        try {
            MyFunction.printValues(a, b, h);
        } catch (MyException e){
            MyPrinter.print(e.getMessage());
        }
    }

}
