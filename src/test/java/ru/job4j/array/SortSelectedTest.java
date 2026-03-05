package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortThenThree() {
        int[] data = new int[]{95, 28, 83};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{28, 83, 95};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortThenFive() {
        int[] data = new int[]{100, 41, 4, 2, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 4, 7, 41, 100};
        assertThat(result).containsExactly(expected);
    }
}
