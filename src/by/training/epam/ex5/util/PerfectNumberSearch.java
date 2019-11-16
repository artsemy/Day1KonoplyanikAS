package by.training.epam.ex5.util;

public class PerfectNumberSearch {

    public boolean isPerfect(int number){
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (isDivider(number, i)){
                sum += i;
            }
        }
        return number == sum;
    }

    private boolean isDivider(int number, int divider){
        return number % divider == 0;
    }

}
