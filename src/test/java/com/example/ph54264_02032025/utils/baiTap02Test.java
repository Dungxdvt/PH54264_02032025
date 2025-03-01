package com.example.ph54264_02032025.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class baiTap02Test {

    baiTap02 baiTap02;

    @BeforeEach
    void setUp() {
        baiTap02 = new baiTap02();
    }

    @Test
    void sumOdd() {
        assertEquals(16, baiTap02.SumOdd(8));
    }
}