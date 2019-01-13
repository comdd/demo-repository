package com.example.algorithm.sort;

import java.util.Arrays;
import java.util.List;

/**
 * Description :
 *
 * @author : dd
 */
public class SelectSort implements Sort {
    @Override
    public List<Integer> sort(Integer[] source) {
        if (source == null || source.length <= 1) {
            return null;
        }
        int temp;
        for (int i = 0; i < source.length - 1; i++) {
            temp = i;
            for (int j = i+1; j < source.length; j++) {
                if (source[j] < source[temp]) {
                    temp = j;
                }
            }
            swap(source, temp, i);
        }

        return Arrays.asList(source);
    }
}
