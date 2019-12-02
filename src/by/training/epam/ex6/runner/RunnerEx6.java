package by.training.epam.ex6.runner;

import by.training.epam.ex6.util.CountSecond;
import by.training.epam.exception.MyException;
import by.training.epam.printer.MyPrinter;
import by.training.epam.scanner.MyScanner;

import java.util.InputMismatchException;

public class RunnerEx6 {

    public static void main(String[] args) {
        int seconds;
        int h, m, s;
        try {
            MyPrinter.print("input seconds");
            seconds = MyScanner.insertInt();
//            if (seconds > 86399 || seconds < 0){
//                throw new MyException("bad input");
//            }
            h = CountSecond.countHours(seconds);
            int i = seconds - h*3600;
            m = CountSecond.countMinutes(i);
            i = i - m*60;
            s = CountSecond.countSeconds(i);
        } catch (InputMismatchException | MyException e) {
            MyPrinter.print(e.getMessage());
            h = m = s = 0;
        }
        MyPrinter.print("hours=" + h + " minutes=" + m + " seconds=" + s);
    }

}
