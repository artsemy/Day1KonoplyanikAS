package by.training.epam.ex7.util;

import by.training.epam.ex7.bean.MyDot;
import by.training.epam.exception.MyException;

public class DotDistance {

    public double findDistance(MyDot d1, MyDot d2){
        int a = Math.abs(d1.getX()- d1.getY());
        int b = Math.abs(d1.getY()-d2.getY());
        return Math.sqrt(a*a + b*b);
    }

    public MyDot nearestToZero(MyDot d1, MyDot d2) throws MyException {
        MyDot zero = new MyDot(0, 0);
        double l1 = findDistance(zero, d1);
        double l2 = findDistance(zero, d2);
        if (l1 < l2){
            return d1;
        } else if (l2 < l1){
            return d2;
        } else {
            throw new MyException("same distance");
        }
    }

}
