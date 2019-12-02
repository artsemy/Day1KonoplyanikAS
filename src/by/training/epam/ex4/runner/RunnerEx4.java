package by.training.epam.ex4.runner;

import by.training.epam.ex4.util.EvenSearch;
import by.training.epam.printer.MyPrinter;
import by.training.epam.scanner.MyScanner;

import java.util.InputMismatchException;

public class RunnerEx4 {

    public static void main(String[] args) {
        int a, b, c, d;
        boolean bool;
        try {
            MyPrinter.print("insert a, b, c, d:");
            a = MyScanner.insertInt();
            b = MyScanner.insertInt();
            c = MyScanner.insertInt();
            d = MyScanner.insertInt();
        } catch (InputMismatchException e){
            MyPrinter.print("bad insert");
            a = b = c = d = 1;
        }
        bool = EvenSearch.twoEven(a, b, c, d);
        MyPrinter.print(String.valueOf(bool));
    }

}
