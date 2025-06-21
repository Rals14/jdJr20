package com.rals.refactoring;

import com.rals.refactoring.core.Calculate;
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
    void testSubstractNumbers() {
        Calculate calculate = new Calculate(6, 2);
        double real = calculate.substractNumbers();
    }


}