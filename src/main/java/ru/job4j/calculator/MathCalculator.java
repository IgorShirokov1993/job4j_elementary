package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDiv(double first, double second) {
        return difference(first, second)
                + div(first, second);
    }

    public static double sumOfAll(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + difference(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("The result of the calculation is: " + sumAndMultiply(10, 20));
        System.out.println("The result of the calculation is: " + differenceAndDiv(105, 15));
        System.out.println("The result of the calculation is: " + sumOfAll(8, 4));
    }
}
