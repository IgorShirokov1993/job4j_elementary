package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert100RblThen1Euro() {
        float input = 100;
        float expected = 1;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert180RblThen3Dollar() {
        float input = 184;
        float expected = 2;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert4p867EuroThen486p7Ruble() {
        float input = 4.867f;
        float expected = 486.7f;
        float output = Converter.euroToRuble(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert8p2365DollarThen757p758Ruble() {
        float input = 8.2365f;
        float expected = 757.758f;
        float output = Converter.dollarToRuble(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}