package by.training.epam.ex3.runner;

import by.training.epam.ex3.util.SquareAndCircle;
import by.training.epam.exception.MyException;
import by.training.epam.printer.MyPrinter;
import by.training.epam.scanner.MyScanner;

import java.util.InputMismatchException;

public class RunnerEx3 {

    public static void main(String[] args) {
        SquareAndCircle saq = new SquareAndCircle();
        double area, d;
        MyPrinter.print("insert area");
        try {
            area = MyScanner.insertDouble();
            if (area <= 0){
                throw new MyException("bad area");
            }
        } catch (InputMismatchException | MyException e){
            MyPrinter.print(e.getMessage());
            area = 1;
        }
        d = saq.squareSide(area);
        d = saq.inscribedCircleRadios(d);
        double area2 = saq.inscribedSquareArea(d);
        MyPrinter.print("area = " + area2);
        d = saq.areaDifference(area, area2);
        MyPrinter.print("difference : " + d);
    }

}
