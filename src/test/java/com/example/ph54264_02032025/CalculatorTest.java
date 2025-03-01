package com.example.ph54264_02032025;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        int expected=5;
        int actual=calculator.add(3,2);
        assertEquals(expected,actual);
    }

    @Test
    void subtract() {
        int expected=1;
        int actual=calculator.subtract(3,2);
        assertEquals(expected,actual);
    }

    @Test
    void multiply() {
        int expected=6;
        int actual=calculator.multiply(3,2);
        assertEquals(expected,actual);
    }

    @Test
    void divide() {
        int expected=5;
        int actual=calculator.divide(10,2);
        assertEquals(expected,actual);
    }

    @Test
    void sumMin() {
        assertEquals(0,Calculator.sum(1));
    }
    @Test
    void sumBin() {
        assertEquals(2,Calculator.sum(2));
    }
    @Test
    void sumPass() {
        int expected=6;
        int actual=Calculator.sum(4);
        assertEquals(expected,actual);
    }
    @Test
    void sumMax() {
        assertEquals(482,Calculator.sum(50));
    }
    @Test
    void sum() {
        assertEquals(432,Calculator.sum(49));
    }

    @Test
    void listNumber() {
        List<Integer> result = Calculator.listNumber(100);
        for (int i = 5; i <= 100; i += 5) {
            assertFalse(result.contains(i), "Danh sách không nên chứa số " + i);
        }
        assertEquals(80, result.size()); // Vì bỏ qua 20 số chia hết cho 5
    }
}