package com.rals.refactoring.operations;

// Concrete strategy for addition operation
public class Addition implements OperationStrategy {
    @Override
    public double apply(double operator1, double operator2) {
        return operator1 + operator2;
    }
}
