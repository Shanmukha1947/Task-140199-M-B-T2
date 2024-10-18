package com.example.main;

import com.example.mathutils.Factorial;
import com.example.mathutils.Power;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        long result = Factorial.factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);

        double base = 2.0;
        int exponent = 10;
        double powerResult = Power.power(base, exponent);
        System.out.println("Power of " + base + " to the " + exponent + " is: " + powerResult);
    }
}
