package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when13to57then5Dot66() {
        double expected = 5.66;
        int x1 = 1;
        int y1 = 3;
        int x2 = 5;
        int y2 = 7;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus4and0to0Minus3then5() {
        double expected = 5;
        int x1 = -4;
        int y1 = 0;
        int x2 = 0;
        int y2 = -3;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when3and9to10and9then7() {
        double expected = 7;
        int x1 = 3;
        int y1 = 9;
        int x2 = 10;
        int y2 = 9;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}