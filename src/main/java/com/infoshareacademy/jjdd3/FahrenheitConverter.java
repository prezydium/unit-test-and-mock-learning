package com.infoshareacademy.jjdd3;

public class FahrenheitConverter {
    public static int toCelsius(int fahrenheit) {
        if (fahrenheit < -459) {
            throw new IllegalArgumentException();
        }

        return (fahrenheit - 32) * 5 / 9;
    }

    public static int fromCelsius(int celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static class Calculator {

        public static int divide(int a, int b) {
                    if (b ==0){
                        throw new IllegalArgumentException();
                    }

            return a / b;
        }
    }
}
