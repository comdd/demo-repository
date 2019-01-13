package com.example.algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description :
 *
 * @author : dd
 */
public class InsertionSort implements Sort{

    @Override
    public List<Integer> sort(Integer[] source) {
        int preIndex,currentNum;
        for(int i = 1;i<source.length;i++){
            currentNum = source[i];
            preIndex = i-1;
            while(preIndex>=0&&source[preIndex]>currentNum){
                source[preIndex+1]=source[preIndex];
                preIndex--;
            }
            source[preIndex+1]=currentNum;
        }
        return Arrays.asList(source);
    }
}
