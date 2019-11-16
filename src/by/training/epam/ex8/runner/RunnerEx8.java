package by.training.epam.ex8.runner;

import by.training.epam.ex8.util.Function;
import by.training.epam.printer.MyPrinter;
import by.training.epam.scanner.MyScanner;

import java.util.InputMismatchException;

public class RunnerEx8 {

    public static void main(String[] args) {
        int x;
        double res;
        try {
            MyPrinter.print("insert x");
            x = MyScanner.insertInt();
        } catch (InputMismatchException e) {
            MyPrinter.print("bad input");
            x = 0;
        }
        res = Function.func(x);
        MyPrinter.print(res);
    }

}
