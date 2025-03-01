package com.example.ph54264_02032025.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BaiTap01Test {
    private BaiTap01 baiTap01;

    @BeforeEach
    void setUp() {
        baiTap01 = new BaiTap01();
    }

    @Test
    void sumEvenValidMin() {
        assertEquals(0, baiTap01.SumEven(1));
    }

    @Test
    void sumEvenValidNearMin() {
        assertEquals(2, baiTap01.SumEven(2));
    }

    @Test
    void sumEvenValidNearMax() {
        assertEquals(432, baiTap01.SumEven(49));
    }

    @Test
    void sumEvenValid() {
        assertEquals(482, baiTap01.SumEven(50));
    }

    @Test
    void sumEvenValidNormal() {
        assertEquals(22, baiTap01.SumEven(10));
    }

    @Test
    void listDivide() {
        List<Integer> list = baiTap01.listDivide(100);
        for (int i = 0; i < 100; i+=5) {
           assertFalse(list.contains(i), "Danh sach khong duoc chia het cho 5");
        }
        assertEquals(80, list.size());
    }


}