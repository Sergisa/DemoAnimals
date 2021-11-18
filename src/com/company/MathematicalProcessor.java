package com.company;

public class MathematicalProcessor {
    private static final int ITERATIONS = 17;

    public static double sin(double x) {
        double sum = 0;
        for (int n = 0; n < ITERATIONS; n++) {
            sum += pow(-1, n) * (pow(x, 2 * n + 1) / fact(2 * n + 1));
        }
        return sum;
    }

    public static int fact(int a) {
        int prod = 1;
        for (int i = 1; i <= a; i++) {
            prod *= i; // prod = prod*i
        }
        return prod;
    }

    public static double pow(double a, int p) {
        return Math.pow(a, p);
    }
}
