package com.example.algorithm.sort;

import java.util.Arrays;
import java.util.List;

/**
 * Description :
 *
 * @author : dd
 */
public class HeapSort implements Sort {
    @Override
    public List<Integer> sort(Integer[] source) {
        if (source == null || source.length == 0) {
            return null;
        }
        heapBuild(source);
        int len = source.length - 1;
        for (int i = source.length - 1; i > 0; i--) {
            swap(source, i, 0);
            adjustHeap(source, 0, len--);
        }
        return Arrays.asList(source);
    }

    private void heapBuild(Integer[] source) {
        int len = source.length;
        for (int i = len / 2; i >= 0; i--) {
            adjustHeap(source, i, len);
        }
    }

    private void adjustHeap(Integer[] source, int i, int len) {
        int left = i * 2 + 1, right = i * 2 + 2, largest = i;
        if (left < len && source[left] > source[largest]) {
            largest = left;
        }
        if (right < len && source[right] > source[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(source, i, largest);
            adjustHeap(source, largest, len);
        }
    }
}
