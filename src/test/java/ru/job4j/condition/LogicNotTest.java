package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LogicNotTest {
    @Test
    void whenIsEvenTrue() {
        int num = 2;
        boolean result = LogicNot.isEven(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenIsEvenFalse() {
        int num = 3;
        boolean result = LogicNot.isEven(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenIsPositiveTrue() {
        int num = 2;
        boolean result = LogicNot.isPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenIsPositiveFalse() {
        int num = -2;
        boolean result = LogicNot.isPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNumIs0IsPositiveFalse() {
        int num = 0;
        boolean result = LogicNot.isPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenFalse() {
        int num = 2;
        boolean result = LogicNot.notEven(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenTrue() {
        int num = 3;
        boolean result = LogicNot.notEven(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNegativeTrue() {
        int num = -2;
        boolean result = LogicNot.isNegative(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNegativeFalse() {
        int num = 2;
        boolean result = LogicNot.isNegative(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNumIs0NegativeFalse() {
        int num = 0;
        boolean result = LogicNot.isNegative(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenAndPositiveIsTrue() {
        int num = 3;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotEvenFalseIsAllFalse() {
        int num = 2;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenPositiveFalseIsAllFalse() {
        int num = -3;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenAndPositiveIsFalse() {
        int num = 0;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenEvenOrNegativeIsTrue() {
        int num = -2;
        boolean result = LogicNot.evenOrNegative(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenEvenIsTrueThenAllIsTrue() {
        int num = 2;
        boolean result = LogicNot.evenOrNegative(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNegativeIsTrueThenAllIsTrue() {
        int num = -3;
        boolean result = LogicNot.evenOrNegative(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenEvenOrNegativeIsFalse() {
        int num = 3;
        boolean result = LogicNot.evenOrNegative(num);
        assertThat(result).isFalse();
    }
}