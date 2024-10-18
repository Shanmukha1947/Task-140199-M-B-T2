package com.example.mathutils;

public class Power {

    public static double power(double base, int exponent) {
        double result = 1.0;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }
        if (exponent < 0) {
            result = 1.0 / result;
        }
        return result;
    }
}
