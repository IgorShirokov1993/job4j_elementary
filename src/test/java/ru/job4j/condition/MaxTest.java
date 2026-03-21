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

    @Test
    void whenMax4To6To5Then6() {
        int left = 4;
        int right = 6;
        int third = 5;
        int result = Max.max(left, right, third);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxMinus14To0ToMinus1Then0() {
        int left = -14;
        int right = 0;
        int third = -1;
        int result = Max.max(left, right, third);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxMinus9To1To5To2Then5() {
        int left = -9;
        int right = 1;
        int third = 5;
        int fourth = 2;
        int result = Max.max(left, right, third, fourth);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxMinus3ToMinus2ToMinus1To0Then0() {
        int left = -3;
        int right = -2;
        int third = -1;
        int fourth = 0;
        int result = Max.max(left, right, third, fourth);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}
