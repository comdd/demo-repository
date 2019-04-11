package com.example.algorithm.sort;

import java.math.BigDecimal;

/**
 * Description :
 *
 * @author : dd
 */
public class Sqrt {

    public static void main(String[] args) {
        double re = sqrt(-3);
        System.out.println(re);
    }

    private static double sqrt(double i) {
        if(i<0){
            return -1;
        }
        double low = 0;
        double high = i;
        double mid;
        do {
            mid = low + (high - low) / 2;
            if (mid * mid > i) {
                high = mid;
            } else {
                low = mid;
            }
        } while (getNum(mid * mid) != i);
        return mid;
    }

    private static double getNum(double d) {
        BigDecimal bg = BigDecimal.valueOf(d);
        return bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
