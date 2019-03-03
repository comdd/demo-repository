package com.example.algorithm.sort;

import java.util.Arrays;
import java.util.List;
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
          pivot = partion(source,fromIndex,toIndex);
          if(pivot-1>fromIndex){
              stack.push(fromIndex);
              stack.push(pivot-1);
          }
          if(pivot+1<toIndex){
              stack.push(pivot+1);
              stack.push(toIndex);
          }
        }
    }
    private int partion(Integer[] a,int left,int right){
        int key = a[left];
        while(left<right){
            while(left<right&&a[right]>=key){
                right--;
            }
            a[left] = a[right];
            while(left<right&&a[left]<=key){
                left++;
            }
            a[right] = a[left];
        }
        a[right] = key;
        return right;
    }
}
