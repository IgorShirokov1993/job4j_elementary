package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {
    @Test
    void from2to10() {
        int start = 2;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 54;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void from10to4() {
        int start = 10;
        int finish = 4;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void from5to5() {
        int start = 5;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void fromMinus18to1() {
        int start = -18;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = -170;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void fromMinus3toMinus12() {
        int start = -3;
        int finish = -12;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}
