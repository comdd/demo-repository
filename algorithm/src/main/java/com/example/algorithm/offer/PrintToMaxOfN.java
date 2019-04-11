package com.example.algorithm.offer;


import java.util.concurrent.TimeUnit;

/**
 * Description : 打印1到N位的所有数字值
 *
 * @author : dd
 */
public class PrintToMaxOfN {

    public static void porcess(int n) {
        if (n <= 0) {
            return;
        }
        char[] cs = new char[n];
        for (char i = 0; i < 10; i++) {
            cs[0] = i;
            printN(cs, 0);
        }
    }

    private static void printN(char[] cs, int index) {
        if (cs.length - 1 == index) {
            print(cs);
            return;
        }
        for (char k = 0; k < 10; k++) {
            cs[index + 1] = k;
            printN(cs, index + 1);
        }

    }

    private static void print(char[] cs) {
        boolean isStartForZero = true;
        for (int k = 0; k < cs.length; k++) {
            if (isStartForZero && cs[k]!=0) {
                isStartForZero = false;
            }
            if (!isStartForZero) {
                System.out.print(Integer.valueOf(cs[k]));
            }

        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        TimeUnit.SECONDS.sleep(100);
        porcess(2);
//        porcess(-2);
//        porcess(65);
    }
}
