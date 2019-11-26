package by.training.epam.ex6.util;

import by.training.epam.exception.MyException;

public class CountSecond {

    public int countHours(int seconds) throws MyException {
        int hours = seconds / 3600;
        if (hours > 23 || hours < 0){
            throw new MyException("bad input");
        }
        return hours;
    }

    public int countMinutes(int seconds) throws MyException {
        int minutes = seconds / 60;
        if (minutes > 59 || minutes < 0){
            throw new MyException("bad input");
        }
        return minutes;
    }

    public int countSeconds(int seconds) throws MyException {
        if (seconds > 60 || seconds < 0){
            throw new MyException("bad input");
        }
        return seconds;
    }

}
