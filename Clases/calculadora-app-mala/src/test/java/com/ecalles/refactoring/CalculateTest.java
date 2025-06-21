package com.ecalles.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @Test
    void testAOp() {
        Calculate calculate = new Calculate(6, 2);
        double real = calculate.aOp();

        assertEquals(8, real);
    }

    @Test
    void testSOp() {
        Calculate calculate = new Calculate(6, 2);
        double real = calculate.sOp();
    }


}