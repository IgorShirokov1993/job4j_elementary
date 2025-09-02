package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        for (int n = 1; n <= number; n++) {
            result *= n;
        }
        return result;
    }
}
