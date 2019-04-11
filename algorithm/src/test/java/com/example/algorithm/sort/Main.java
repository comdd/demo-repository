package com.example.algorithm.sort;


import java.util.ArrayList;
import java.util.List;

/**
 * Description :
 *
 * @author : dd
 */
public class Main {
    public static void main(String[] args){
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> list1= new ArrayList<>();
        list1.add(1);
        List<Integer> list2= new ArrayList<>();
        list2.add(2);
        List<Integer> list3= new ArrayList<>();
        list3.add(3);
        results.add(0,list1);
        results.add(0,list2);
        results.add(1,list3);
        System.out.println(results);

    }
}
