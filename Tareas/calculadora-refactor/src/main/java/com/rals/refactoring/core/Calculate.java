package com.rals.refactoring.core;

public class Calculate {
    private double operator1;
    private double operator2;
    private String lastOperation;
    private double lastResult;  

    public Calculate(double operator1, double operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    // Getters and Setters
    public double getOperator1() {
        return operator1;
    }

    public void setOperator1(double operator1) {
        this.operator1 = operator1;
    }

    public double getOperator2() {
        return operator2;
    }

    public void setOperator2(double operator2) {
        this.operator2 = operator2;
    }

    public String getLastOperation() {
        return lastOperation;
    }

    public void setLastOperation(String lastOperation) {
        this.lastOperation = lastOperation;
    }

    public double getLastResult() {
        return lastResult;
    }

    public void setLastResult(double lastResult) {
        this.lastResult = lastResult;
    }

    private void updateState(String operation, double result) {
        this.lastOperation = operation;
        this.lastResult = result;

    }

    private double executeOperation(String operation, double result) {
        updateState(operation, result);
        return result;

    }
    // This method realice an addition, return th result,
    //... store the operation name (lastOperation) and the result (lastResult)
    public double addNumbers() {
        return executeOperation("Addition", this.operator1 + this.operator2);
    }

    // This method realice operator1 subtraction, return the result,
    //... store the operation name (lastOperation) and the result (lastResult)
    public double substractNumbers() {
        return executeOperation("Subtraction", this.operator1 - this.operator2);
    }

    public double multiplyNumbers() {
        return executeOperation("Multiplication", this.operator1 * this.operator2);
    }

}
