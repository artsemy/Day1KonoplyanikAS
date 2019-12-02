package by.training.epam.ex1.runner;

import by.training.epam.ex1.util.LastDigit;
import by.training.epam.printer.MyPrinter;
import by.training.epam.scanner.MyScanner;

import java.util.InputMismatchException;

public class RunnerEx1 {

    public static void main(String[] args) {
        int number;
        MyPrinter.print("insert number");
        try {
            number = MyScanner.insertInt();
        } catch (InputMismatchException e){
            MyPrinter.print(e.getMessage());
            number = 0;
        }
        int result = LastDigit.lastOfSquare(number);
        MyPrinter.print(result);
    }

}
