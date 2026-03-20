package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        double expected = 2.0;
        assertThat(distance).isEqualTo(expected);
    }

    @Test
    void when13to57then5Dot66() {
        Point a = new Point(1, 3);
        Point b = new Point(5, 7);
        double distance = a.distance(b);
        double expected = 5.66;
        assertThat(distance).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus4and0to0Minus3then5() {
        Point a = new Point(-4, 0);
        Point b = new Point(0, -3);
        double distance = a.distance(b);
        double expected = 5;
        assertThat(distance).isEqualTo(expected);
    }

    @Test
    void when3and9to10and9then7() {
        Point a = new Point(3, 9);
        Point b = new Point(10, 9);
        double distance = a.distance(b);
        double expected = 7;
        assertThat(distance).isEqualTo(expected);
    }
}