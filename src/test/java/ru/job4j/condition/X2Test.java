package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class X2Test {

    @Test
    void whenA10B0C0X2Then40() {
        /* Входные параметры. Их будет 4 для данного случая*/
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 40;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int result = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C1X1Then3() {
        /* Входные параметры. Их будет 4 для данного случая*/
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 3;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int result = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA0B1C1X1Then2() {
        /* Входные параметры. Их будет 4 для данного случая*/
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 2;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int result = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C0X1Then2() {
        /* Входные параметры. Их будет 4 для данного случая*/
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 2;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int result = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C1X0Then1() {
        /* Входные параметры. Их будет 4 для данного случая*/
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 1;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int result = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(result).isEqualTo(expected);
    }
}