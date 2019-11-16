package by.training.epam.ex2.util;

import by.training.epam.exception.MyException;

public class DayCounter {

    public static int countDay(int year, int month) throws MyException {
        int days;
        if (!checkMonth(month)){
            throw new MyException("bad month");
        }
        days = countMonthDay(month);
        if (month == 2 && isLeapYear(year))
        {
            days++;
        }
        return days;
    }

    private static int countMonthDay(int month){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1;
        }
    }

    private static boolean isLeapYear(int year){
        int p = 2000 - year;
        return p%4 == 0 ? true : false;
    }

    private static boolean checkMonth(int month){
        if (month > 12 || month < 1){
            return false;
        }
        return true;
    }

}
