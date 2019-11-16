package by.training.epam.ex4.util;

public class EvenSearch {

    public boolean twoEven(int a, int b, int c, int d){
        int count = 0;
        if (isEven(a)){
            count++;
        }
        if (isEven(b)){
            count++;
        }
        if (isEven(c)){
            count++;
        }
        if (isEven(d)){
            count++;
        }
        return count > 1;
    }

    private boolean isEven(int i){
        return i % 2 == 0;
    }

}
