package by.training.epam.ex3.util;

public class SquareAndCircle {

    public static double inscribedSquareArea(double circleRadios){
        return 2*circleRadios*circleRadios;
    }

    public static double inscribedCircleRadios(double squareSide){
        return squareSide/2;
    }

    public static double squareSide(double squareArea){
        return Math.sqrt(squareArea);
    }

    public static double areaDifference(double area1, double area2){
        return area1/area2;
    }

}
