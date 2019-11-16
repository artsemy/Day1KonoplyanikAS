package by.training.epam.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyScanner {

    public static int insertInt() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        int i;
        i = scanner.nextInt();
        return i;
    }

    public static double insertDouble() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        double d;
        d = scanner.nextDouble();
        return d;
    }

}
