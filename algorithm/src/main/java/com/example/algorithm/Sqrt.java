package com.example.algorithm;

/**
 * Description :
 *
 * @author : dd
 */
public class Sqrt {

    public static int sqrt(int x) {
        if (x <= 0) {
            return 0;
        }
        double mid = (double) x / 2;
        double start = 0;
        double end = x;
        int rs;
        while ((rs = equals(mid, x)) != 0) {
            if (rs > 0){
                end = mid;
            }else{
                start = mid;
            }
            mid = (start+end)/2;
        }
        return  (int)mid;
    }

    private static int equals(double mid, int x) {
        double rs = mid * mid;
        if (rs - x < 0) {
            return -1;
        }
        if ((rs - x) < 0.01) {
            return 0;
        }
        return 1;
    }
    public static void main(String[] args){
        System.out.println(sqrt(9));
    }
}
