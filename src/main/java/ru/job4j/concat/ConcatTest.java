package ru.job4j.concat;

public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Job4j");
        for (int index = 0; index < 9999; index++) {
            builder.append(index);
        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
    }
}
