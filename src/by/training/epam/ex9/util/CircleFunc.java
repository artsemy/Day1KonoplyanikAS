package by.training.epam.ex9.util;

import by.training.epam.exception.MyException;

public class CircleFunc {

    public static double findCircumference(int radius) throws MyException {
        if (radius < 0){
            throw new MyException("bad radius");
        }
        return 2*Math.PI*radius;
    }

    public static double findArea(int radius) throws MyException {
        if (radius < 0){
            throw new MyException("bad radius");
        }
        return Math.PI*radius*radius;
    }

}
