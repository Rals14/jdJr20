package com.rals.refactoring.operations;

import com.rals.refactoring.enums.OperationType;

public class Calculator {
    private OperationType LastOperation;
    private double LastResult;

    public OperationType getLastOperation() {
        return LastOperation;
    }

    public double getLastResult() {
        return LastResult;
    }

    public double executeOperation(OperationStrategy operationStrategy, double operator1, double operator2, OperationType type) {
        double result = operationStrategy.apply(operator1, operator2);
        LastOperation = type;
        LastResult = result;
        return LastResult;
    }
}
