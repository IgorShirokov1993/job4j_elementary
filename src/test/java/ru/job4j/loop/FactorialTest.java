package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTest {
    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int number = 5;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int number = 0;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForTenThenOne() {
        int expected = 3628800;
        int number = 10;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }
}
