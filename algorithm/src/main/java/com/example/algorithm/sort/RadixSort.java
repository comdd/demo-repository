package com.example.algorithm.sort;

import java.util.List;

/**
 * Description :
 *
 * @author : dd
 */
public class RadixSort implements Sort {
    @Override
    public List<Integer> sort(Integer[] source) {
        if (source == null || source.length == 0) {
            return null;
        }
        Integer[] newSorce = source.clone();
        QuickSort quickSort = new QuickSort();
        quickSort.sort(newSorce);
        Integer max = newSorce[newSorce.length - 1];
        int digit = getDigit(max);
        sort(source, digit);
        return null;
    }

    private void sort(Integer[] source, int digit) {
        int scale = 10;
        int max = scale * digit;
        int min = source[0] / scale;
        for (int i = 1; i < source.length; i++) {
            if (source[i] / scale < min) {

            }
        }
    }

    private static int getDigit(int num) {

        int digit = 0;
        int scale = 10;
        while (num / scale != 0) {
            digit++;
            scale *= 10;
        }
        return digit;
    }

    public static void main(String[] args) {
        System.out.println(getDigit(1498));
    }

}
