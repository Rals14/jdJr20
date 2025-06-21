package com.ecalles.refactoring;

public class Main {
    public static void main(String[] args) {
        Calculate calulator = new Calculate(10, 5);

        // Suma
        calulator.aOp();
        System.out.printf("%s %f + %f = %f%n", calulator.getO(), calulator.getA(), calulator.getB(), calulator.getR());
    }
}
