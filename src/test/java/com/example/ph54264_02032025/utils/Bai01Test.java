package com.example.ph54264_02032025.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Bai01Test {

    private Bai01 bai01;

    @BeforeEach
    void setUp() {
        bai01 = new Bai01();
    }


    @Test
    void testEven() {
        assertEquals("Even", bai01.testEvenOdd(2));
    }
    @Test
    void testOdd() {
        assertEquals("Odd", bai01.testEvenOdd(1));
    }
    @Test
    void testEvenNumber() {
        assertEquals("Even", bai01.testEvenOdd(10));
    }
    @Test
    void testOddNumber() {
        assertEquals("Odd", bai01.testEvenOdd(11));
    }
    @Test
    void testOddHundredNumber() {
        assertEquals("Even", bai01.testEvenOdd(100));
    }
    @Test
    void testZeroNumber() {
        assertEquals("Even", bai01.testEvenOdd(0));
    }


}