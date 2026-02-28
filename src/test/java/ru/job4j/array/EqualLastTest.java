package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EqualLastTest {
    @Test
    public void whenEqual() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEqual() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }

    @Test
    public void whenEqual5() {
        int[] left = {1, 2, 3, 5, 4};
        int[] right = {23, 12, 7, 65, 4};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEqual5() {
        int[] left = {1, 2, 3, 4, 5};
        int[] right = {3, 3, 4, 6, 7};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }
}