package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax15To9Then15() {
        int left = 15;
        int right = 9;
        int result = Max.max(left, right);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax18To32Then32() {
        int left = 18;
        int right = 32;
        int result = Max.max(left, right);
        int expected = 32;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax77To77Then77() {
        int left = 77;
        int right = 77;
        int result = Max.max(left, right);
        int expected = 77;
        assertThat(result).isEqualTo(expected);
    }
}
