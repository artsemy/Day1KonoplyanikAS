package by.training.epam.ex5.runner;

import by.training.epam.ex5.util.PerfectNumberSearch;
import by.training.epam.printer.MyPrinter;
import by.training.epam.scanner.MyScanner;

import java.util.InputMismatchException;

public class RunnerEx5 {

    public static void main(String[] args) {
        int number;
        boolean b;
        try {
            MyPrinter.print("insert number");
            number = MyScanner.insertInt();
        } catch (InputMismatchException e) {
            MyPrinter.print("bad input");
            number = 1;
        }
        b = PerfectNumberSearch.isPerfect(number);
        MyPrinter.print(String.valueOf(b));
    }

}
