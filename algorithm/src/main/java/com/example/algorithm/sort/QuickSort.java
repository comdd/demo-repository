package com.example.algorithm.sort;

import java.util.Arrays;
import java.util.List;

/**
 * Description : 快排
 *
 * @author : dd
 */
public class QuickSort implements Sort {
    @Override
    public List<Integer> sort(Integer[] source) {
        if (source == null || source.length == 0) {
            return null;
        }
        if (source.length == 1) {
            return Arrays.asList(source);
        }
        sort(0, source.length - 1, source);
        return Arrays.asList(source);
    }

    private void sort(int fromIndex, int toIndex, Integer[] source) {
        if (fromIndex >= toIndex) {
            return;
        }
        int i = fromIndex + 1, j = toIndex, key = source[fromIndex], index = fromIndex;
        while (j >= i) {
            while (j >= index && source[j] >= key) {
                j--;
            }
            if (j >= index) {
                source[index] = source[j];
                index = j;
            }
            while (i <= index && source[i] <= key) {
                i++;
            }
            if (i <= index) {
                source[index] = source[i];
                index = i;
            }
        }
        source[index] = key;
        sort(fromIndex, index - 1, source);
        sort(index + 1, toIndex, source);
    }
}
