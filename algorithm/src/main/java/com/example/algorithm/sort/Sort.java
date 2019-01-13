package com.example.algorithm.sort;

import java.util.List;

/**
 * Description :
 *
 * @author : dd
 */
public interface Sort {

    List<Integer> sort(Integer[] source);

    default void swap(Integer[] source, Integer left, Integer right) {
        Integer tmp = source[left];
        source[left] = source[right];
        source[right] = tmp;
    }
}
