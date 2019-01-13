package com.example.algorithm.sort;

import java.util.Arrays;
import java.util.List;

/**
 * Description :
 *
 * @author : dd
 */
public class ShellSort implements Sort {
    @Override
    public List<Integer> sort(Integer[] source) {
        int d = source.length / 2;
        int currentNum,preIndex;
        while (d >= 1) {
            for(int i = d;i<source.length;i++){
                currentNum = source[i];
                preIndex = i-d;
                while(preIndex>=0&&source[preIndex]>currentNum){
                    source[preIndex+d]=source[preIndex];
                    preIndex=preIndex-d;
                }
                source[preIndex+d]=currentNum;
            }
            d = d / 2;
        }
        return Arrays.asList(source);
    }
}
