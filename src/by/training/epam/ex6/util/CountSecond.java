package by.training.epam.ex6.util;

import by.training.epam.exception.MyException;

public class CountSecond {

    public static int countHours(int seconds) throws MyException {
        int hours = seconds / 3600;
        if (hours > 23 || hours < 0){
            throw new MyException("bad input");
        }
        return hours;
    }

    public static int countMinutes(int seconds) throws MyException {
        int minutes = seconds / 60;
        if (minutes > 59 || minutes < 0){
            throw new MyException("bad input");
        }
        return minutes;
    }

    public static int countSeconds(int seconds) throws MyException {
        if (seconds > 59 || seconds < 0){
            throw new MyException("bad input");
        }
        return seconds;
    }

}
