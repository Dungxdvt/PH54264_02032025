package com.example.ph54264_02032025;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        return a / b;
    }

    public static int sum(int n){
        if(n < 2){
            return 0;
        }

        int sum = 0;
        for (int i = 2; i <= n; i+=2) {
            if(i % 8 != 0){
                sum += i;
            }
        }
        return sum;
    }

    public static List<Integer> listNumber(int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (i%5!=0){
                list.add(i);
            }
        }
        return list;
    }
    //sâg
}
