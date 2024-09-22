package com.sample.PracticeCode;

public class GCD {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        int result = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + result);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}