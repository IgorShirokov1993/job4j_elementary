package ru.job4j.condition;

public class AlertDivByZero {
    public static void checkNumber(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0) {
            System.out.println("This is negative number.");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.checkNumber(4);
        AlertDivByZero.checkNumber(0);
        AlertDivByZero.checkNumber(-4);
        AlertDivByZero.checkNumber(-17);
    }
}