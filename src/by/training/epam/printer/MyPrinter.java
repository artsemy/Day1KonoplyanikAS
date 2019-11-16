package by.training.epam.printer;

import by.training.epam.ex7.bean.MyDot;

public class MyPrinter {

    public static void print(int k){
        System.out.println(k);
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void print(MyDot d) {
        System.out.println("(" + d.getX() + ", " + d.getY() + ")");
    }

    public static void print(double d) {
        System.out.println(d);
    }

}
