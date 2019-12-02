package by.training.epam.ex1.util;

public class LastDigit {

    public static int lastOfSquare(int number){
        int dig = getLastDigit(number);
        dig = multipleDigit(dig);
        dig = getLastDigit(dig);
        return dig;
    }

    private static int getLastDigit(int number){
        return number%10;
    }

    private static int multipleDigit(int digit){
        return digit*digit;
    }

}
