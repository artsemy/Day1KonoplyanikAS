package by.training.epam.ex2.runner;

import by.training.epam.ex2.util.DayCounter;
import by.training.epam.exception.MyException;
import by.training.epam.printer.MyPrinter;
import by.training.epam.scanner.MyScanner;

import java.util.InputMismatchException;

public class RunnerEx2 {

    public static void main(String[] args) {
        int year, month, days;
        try {
            MyPrinter.print("insert year");
            year = MyScanner.insertInt();
            MyPrinter.print("insert month");
            month = MyScanner.insertInt();
        } catch (InputMismatchException e){
            MyPrinter.print(e.getMessage());
            year = 2000;
            month = 1;
        } try {
            days = DayCounter.countDay(year, month);
        }
        catch (MyException e){
            MyPrinter.print(e.getMessage());
            days = -1;
        }
        MyPrinter.print(days);
    }

}
