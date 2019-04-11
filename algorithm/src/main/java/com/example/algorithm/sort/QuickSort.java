package com.example.algorithm.sort;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Stack;

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
        int pivot;
        Stack<Integer> stack = new Stack<>();
        stack.push(fromIndex);
        stack.push(toIndex);
        while (!stack.empty()) {
            toIndex = stack.pop();
            fromIndex = stack.pop();
            pivot = partion(source, fromIndex, toIndex);
            if (pivot - 1 > fromIndex) {
                stack.push(fromIndex);
                stack.push(pivot - 1);
            }
            if (pivot + 1 < toIndex) {
                stack.push(pivot + 1);
                stack.push(toIndex);
            }
        }
    }

    private int partion(Integer[] a, int left, int right) {
        Random random = new Random();
        int index = random.nextInt(right - left) + left;
        swap(a, index, right);
        int small = left-1;
        for(index = left;index<=right;index++){
            if(a[index]<a[right]){
                if(++small!=index){
                    swap(a,index,small);
                }
            }
        }
        swap(a,++small,right);
        return small;
    }
}
