package com.rals.refactoring.operations;

import com.rals.refactoring.exceptions.ZeroDivisionException;

public class Division implements OperationStrategy {
    @Override
    public double apply(double operator1, double operator2) {
        if (operator2 == 0) {
            throw new ZeroDivisionException("Division by zero is not allowed.");
        }
        return operator1 / operator2;
    }
}
