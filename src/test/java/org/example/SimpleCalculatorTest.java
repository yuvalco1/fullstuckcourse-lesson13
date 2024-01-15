package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoplustwo() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(4, simpleCalculator.add(2, 2));
    }

    @Test
    void twoplusone() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(3, simpleCalculator.add(2, 1));
    }

    @Test
    void twopluszero() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(2, simpleCalculator.add(2, 0));
    }


    @Test
    void dividesixbytwo() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(3, simpleCalculator.divide(6, 2));

    }

    @Test
    void dividebyzero() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertThrows(ArithmeticException.class, () -> simpleCalculator.divide(6, 0));
    }
    @Test
    void zerodividebytwo() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(0, simpleCalculator.divide(0, 2));
    }

}