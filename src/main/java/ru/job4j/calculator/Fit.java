package ru.job4j.calculator;

public class Fit {

    private static double calculateWeight(short height, int offset) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        return (height - offset) * 1.15;
    }

    /**
     * Вычисляет идеальный вес мужчины на основе роста.
     *
     * @param height Рост мужчины в сантиметрах.
     * @return Идеальный вес мужчины в килограммах.
     */
    public static double manWeight(short height) {
        return calculateWeight(height, 100);
    }

    /**
     * Вычисляет идеальный вес женщины на основе роста.
     *
     * @param height Рост женщины в сантиметрах.
     * @return Идеальный вес женщины в килограммах.
     */
    public static double womanWeight(short height) {
        return calculateWeight(height, 110);
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.printf("Man 187 is %.2f%n", man);
        double woman = Fit.womanWeight(height);
        System.out.printf("Woman 187 is %.2f%n", woman);
    }
}
