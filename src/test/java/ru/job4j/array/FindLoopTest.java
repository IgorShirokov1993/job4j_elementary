package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[]{5, 11, 3};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas18Then3() {
        int[] data = new int[]{5, 10, 35, 18, 41};
        int element = 18;
        int result = FindLoop.indexOf(data, element);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot75ThenMinus1() {
        int[] data = new int[]{1, 12, 31, 74};
        int element = 75;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}
