package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class CustomCalculatorTest {
    CustomCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new CustomCalculator();
    }

    @Test
    void add() {
        int a = 1;
        int b = 2;

        int actual = calculator.add(a, b);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void dividedBy2() {
        int x = 123;

        boolean actual = calculator.dividedBy2(x);

        assertFalse(actual);
    }

    @Test
    void entrypoint() {
        int x = 123;

        int actual = calculator.entrypoint(x);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void entrypoint2() {
        int x = -3;

        int actual = calculator.entrypoint(x);
        int expected = -1;

        assertEquals(expected, actual);
    }
}