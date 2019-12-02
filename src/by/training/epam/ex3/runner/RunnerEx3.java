package by.training.epam.ex3.runner;

import by.training.epam.ex3.util.SquareAndCircle;
import by.training.epam.exception.MyException;
import by.training.epam.printer.MyPrinter;
import by.training.epam.scanner.MyScanner;

import java.util.InputMismatchException;

public class RunnerEx3 {

    public static void main(String[] args) {
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
        d = SquareAndCircle.squareSide(area);
        d = SquareAndCircle.inscribedCircleRadios(d);
        double area2 = SquareAndCircle.inscribedSquareArea(d);
        MyPrinter.print("area = " + area2);
        d = SquareAndCircle.areaDifference(area, area2);
        MyPrinter.print("difference : " + d);
    }

}
