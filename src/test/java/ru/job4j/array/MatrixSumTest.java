package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MatrixSumTest {
    @Test
    public void whenSingle() {
        int[][] array = {
                {10}
        };
        int result = MatrixSum.sum(array);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenTwo() {
        int[][] array = {
                {1, 2},
                {1, 2}
        };
        int result = MatrixSum.sum(array);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenThree() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int result = MatrixSum.sum(array);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenThreeByThree() {
        int[][] array = {
                {5, 3, 1},
                {11, 12, 9},
                {4, 1, 4}
        };
        int result = MatrixSum.sum(array);
        int expected = 50;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFour() {
        int[][] array = {
                {7, 35, 41, 6},
                {0, 11},
                {3, 2, 4},
                {1}
        };
        int result = MatrixSum.sum(array);
        int expected = 110;
        assertThat(result).isEqualTo(expected);
    }
}
