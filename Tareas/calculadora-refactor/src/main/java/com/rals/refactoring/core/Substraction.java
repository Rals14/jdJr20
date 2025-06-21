package com.rals.refactoring.core;

import com.rals.refactoring.operations.OperationStrategy;

// concrete strategy for addition operation
public class Substraction implements OperationStrategy {
    @Override
    public double apply(double operator1, double operator2) {
        return operator1 - operator2;
    }
}
