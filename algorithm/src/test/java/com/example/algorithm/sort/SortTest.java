package com.example.algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


/**
 * Description :
 *
 * @author : dd
 */
public class SortTest {
    private static Integer[] sources = new Integer[]{1,3,2,19,10,25,14,11,8};
    private static List<Integer> expect = Arrays.asList(1,2,3,8,10,11,14,19,25);

    @Test
    public void insertionTest(){
        Sort sort = new InsertionSort();
        List<Integer> result = sort.sort(sources);
        System.out.println(result);
        Assert.assertEquals("结果不对",expect,result);
    }
    @Test
    public void shellTest(){
        Sort sort = new ShellSort();
        List<Integer> result = sort.sort(sources);
        System.out.println(result);
        Assert.assertEquals("结果不对",expect,result);
    }
    @Test
    public void bubbleSort(){
        Sort sort = new BubbleSort();
        List<Integer> result = sort.sort(sources);
        System.out.println(result);
        Assert.assertEquals("结果不对",expect,result);
    }
    @Test
    public void quickSort(){
        Sort sort = new QuickSort();
        List<Integer> result = sort.sort(sources);
        System.out.println(result);
        Assert.assertEquals("结果不对",expect,result);
    }
    @Test
    public void selectSort(){
        Sort sort = new SelectSort();
        List<Integer> result = sort.sort(sources);
        System.out.println(result);
        Assert.assertEquals("结果不对",expect,result);
    }

}