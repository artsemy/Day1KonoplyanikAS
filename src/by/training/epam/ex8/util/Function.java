package by.training.epam.ex8.util;

public class Function {

    public static double func(int x){
        double res;
        if (x < 3) {
            res = 1. / (x*x*x - 6);
        } else {
            res = -x*x + 3*x + 9;
        }
        return res;
    }

}
