package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenManHeight187ThenWeight100Dot05() {
        short height = 187;
        double expected = 100.05;
        double result = Fit.manWeight(height);
        assertThat(result).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenWomanHeight187ThenWeight88Dot55() {
        short height = 187;
        double expected = 88.55;
        double result = Fit.womanWeight(height);
        assertThat(result).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenHeightIsZeroThenThrowException() {
        short height = 0;
        assertThatThrownBy(() -> Fit.manWeight(height))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Height must be positive");
    }

    @Test
    void whenWomanHeight150ThenWeight46Dot0() {
        short height = 150;
        double expected = 46.0;
        double result = Fit.womanWeight(height);
        assertThat(result).isCloseTo(expected, within(0.01));
    }
}