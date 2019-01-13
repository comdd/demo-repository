package com.example.algorithm.sort;

import java.util.Arrays;
import java.util.List;

/**
 * Description :
 *
 * @author : dd
 */
public class BubbleSort implements Sort {
    @Override
    public List<Integer> sort(Integer[] source) {
        for (int i = 0; i < source.length - 1; i++) {
            for (int j = 0; j < source.length - i-1; j++) {
                if (source[j] > source[j + 1]) {
                    swap(source, j, j + 1);
                }
            }
        }
        return Arrays.asList(source);
    }

}
