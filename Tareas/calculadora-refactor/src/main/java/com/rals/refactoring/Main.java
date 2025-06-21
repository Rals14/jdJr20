package com.rals.refactoring;

import com.rals.refactoring.enums.OperationType;
import com.rals.refactoring.operations.Addition;
import com.rals.refactoring.operations.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double suma = calculator.executeOperation(new Addition(),2 ,3 , OperationType.ADDITION);
        System.out.println("Resultado de: " + calculator.getLastOperation() +" es: " + calculator.getLastResult());
    }
}
