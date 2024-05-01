package org.example.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoEqualsFour() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(4, simpleCalculator.add(2, 2));

    }

    @Test
    void fivePlusTwoEqualsSeven() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(7, simpleCalculator.add(5, 2));

    }

}