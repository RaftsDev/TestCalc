package com.company.test;

import com.company.app.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestMultiply {

    @Test
    void multiplyPositive() {
        var calc = new Calculator();
        assertEquals(6,calc.multiply(2,3));
    }

    @Test
    void multiplyNegative() {
        var calc = new Calculator();
        assertEquals(-6,calc.multiply(2,-3));
    }

    @Test
    void multiplyAllNegative() {
        var calc = new Calculator();
        assertEquals(6,calc.multiply(-2,-3));
    }
}