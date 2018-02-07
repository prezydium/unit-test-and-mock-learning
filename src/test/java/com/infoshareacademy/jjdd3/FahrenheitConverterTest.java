package com.infoshareacademy.jjdd3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class FahrenheitConverterTest {
    @Test
    void toCelsiusShouldReturnProperValueForZeroF() {
        assertEquals(-17, FahrenheitConverter.toCelsius(0));
    }

    @Test
    void toCelsiusShouldReturnProperValueForPositiveInteger() {
        assertEquals(93, FahrenheitConverter.toCelsius(200));
    }

    @Test
    void toCelsiusShouldReturnProperValueForNegativeInteger() {
        assertEquals(-26, FahrenheitConverter.toCelsius(-15));
    }

    @Test
    void toCelsiusShouldThrowExceptionWhenValueIsLowerThanMinimum() {
        assertThrows(IllegalArgumentException.class, () -> {
           FahrenheitConverter.toCelsius(-500);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/fahrenheitToCelcious.csv"}, delimiter = ';')
    void shouldPareFahrenheitToCelcious(int fahrenheit, int celcious){
        assertEquals(FahrenheitConverter.toCelsius(fahrenheit), celcious, () -> "For " + fahrenheit + "F: ");

    }
}
