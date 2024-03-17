package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 92;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 100;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 92;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(200);
        System.out.println("200 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(276);
        System.out.println("276 rubles are " + dollar + " dollar.");
        float ruble = Converter.euroToRuble(5);
        System.out.println("5 euro are " + ruble + " ruble.");
        float rubles = Converter.dollarToRuble(6);
        System.out.println("6 dollars are " + rubles + " rubles.");
        float input = 300;
        float expected = 3;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("300 rubles are 3 euro. Test result : " + passed);
        float inpu = 184;
        float expecte = 2;
        float outpu = Converter.rubleToDollar(inpu);
        boolean passe = expecte == outpu;
        System.out.println("184 rubles are 2 dollars. Test result : " + passe);
        float inp = 5;
        float expect = 500;
        float outp = Converter.euroToRuble(inp);
        boolean pass = expect == outp;
        System.out.println("5 euro are 500 rubles. Test result : " + pass);
        float in = 6;
        float expec = 552;
        float out = Converter.dollarToRuble(in);
        boolean pas = expec == out;
        System.out.println("6 dollars are 552 rubles. Test result : " + pas);
    }
}
