package com.example.ph54264_02032025.utils;

public class baiTap02 {
    public int SumOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i+=2) {
            sum += i;
        }
        return sum;
    }
}
