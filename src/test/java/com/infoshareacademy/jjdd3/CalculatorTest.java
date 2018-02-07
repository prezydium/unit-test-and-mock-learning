package com.infoshareacademy.jjdd3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalculatorTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/calculatorDivideTest.csv"}, delimiter = ';')
    void shouldDivideNumkbers(int a, int b, int result){
        assertEquals(FahrenheitConverter.Calculator.divide(a, b), result);
    }

    @Test
    void shouldNotAcceptIllegalDivisor(){
        assertThrows(IllegalArgumentException.class,() -> FahrenheitConverter.Calculator.divide(3, 0));
    }


}
