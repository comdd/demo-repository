package com.example.algorithm.search;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Description :
 *
 * @author : dd
 */
public class FindFirstMaxNum {

    private static Integer[] findFirstMax(Integer[] a){
        if(a==null||a.length==1){
            return a;
        }
        Integer[] max = new Integer[a.length];
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while(i<a.length){
            if(stack.empty()||a[stack.peek()]>=a[i]){
                stack.push(i++);
            }else{
                max[stack.pop()]=a[i];
            }
        }
        while(!stack.empty()){
            max[stack.pop()]=-1;
        }
        return max;
    }
    public static void main(String[] args){
        Integer[] nums = new Integer[]{6,9,4,8,15};
        List<Integer> list = Arrays.asList(findFirstMax(nums));
        System.out.println(list);
    }
}
