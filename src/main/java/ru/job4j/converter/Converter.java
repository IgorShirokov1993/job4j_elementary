package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 81;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 76;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 81;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 76;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(162);
        System.out.println("162 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(228);
        System.out.println("228 rubles are " + dollar + " dollar.");
        float ruble = Converter.euroToRuble(5);
        System.out.println("5 euro are " + ruble + " ruble.");
        float rubles = Converter.dollarToRuble(6);
        System.out.println("6 dollars are " + rubles + " rubles.");
    }
}
