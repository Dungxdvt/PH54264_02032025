package com.example.ph54264_02032025.utils;

import java.util.ArrayList;
import java.util.List;

public class BaiTap01 {
    public int SumEven(int n) {
        if (n<2){
            return 0;
        }

        int sum=0;
        for (int i = 0; i <= n; i++) {
            if (i % 8 != 0 && i % 2 == 0){
                sum+=i;
            }
        }
        return sum;
    }

        public static List<Integer> listDivide(int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 5 != 0){
                list.add(i);
            }
        }
        return list;
    }

    public int SumOdd(int n){
        if (n<1){
            return 0;
        }

        int sum=0;
        for (int i = 1; i <= n; i+=2){
            if (i % 7 != 0){
                sum+=i;
            }
        }
        return sum;
    }

}

