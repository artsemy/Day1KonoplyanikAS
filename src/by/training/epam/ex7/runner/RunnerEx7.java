package by.training.epam.ex7.runner;

import by.training.epam.ex7.bean.MyDot;
import by.training.epam.ex7.util.DotDistance;
import by.training.epam.exception.MyException;
import by.training.epam.printer.MyPrinter;
import by.training.epam.scanner.MyScanner;

import java.util.InputMismatchException;

public class RunnerEx7 {

    public static void main(String[] args) {
        DotDistance dotDistance = new DotDistance();
        MyDot d1, d2, nearest;
        int x, y;
        try {
            MyPrinter.print("insert 'x' and 'y' of dot1");
            x = MyScanner.insertInt();
            y = MyScanner.insertInt();
            d1 = new MyDot(x, y);
            MyPrinter.print("insert 'x' and 'y' of dot2");
            x = MyScanner.insertInt();
            y = MyScanner.insertInt();
            d2 = new MyDot(x, y);
        } catch (InputMismatchException e) {
            MyPrinter.print("bad input");
            d1 = new MyDot(1,1);
            d2 = new MyDot(1,1);
        }
        try {
            nearest = dotDistance.nearestToZero(d1, d2);
        } catch (MyException e){
            MyPrinter.print(e.getMessage());
            nearest = new MyDot(0,0);
        }
        MyPrinter.print(nearest);
    }

}
