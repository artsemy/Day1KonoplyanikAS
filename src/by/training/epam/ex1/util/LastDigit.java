package by.training.epam.ex1.util;

public class LastDigit {

    public int lastOfSquare(int number){
        int dig = getLastDigit(number);
        dig = multipleDigit(dig);
        dig = getLastDigit(dig);
        return dig;
    }

    private int getLastDigit(int number){
        return number%10;
    }

    private int multipleDigit(int digit){
        return digit*digit;
    }

}
