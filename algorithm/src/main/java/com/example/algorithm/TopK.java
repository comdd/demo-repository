package com.example.algorithm;

import java.util.Random;

/**
 * Description :
 *
 * @author : dd
 */
public class TopK {

    private static int partition(int[] data,int length,int left,int right){
        if(left<0||right>=length||left>right){
            throw new RuntimeException("invalid input");
        }
        int index = random(left,right);
        swap(data,index,right);
        int small = left-1;
        for(index =0;index<right;index++){
            if(data[index]<data[right]){
                if(++small!=index){
                    swap(data,small,index);
                }
            }
        }
        swap(data,++small,right);
        return index;
    }

    private static int getIndex(int[] data,int length,int left,int right,int n){
        int index = partition(data,length,left,right);
        while(index!=n){
            if(index<n){
                left = index+1;
            }else{
                right = index-1;
            }
            index = partition(data,length,left,right);
        }
        return index;
    }
    public static void main(String []args){
        int n = 5;
        int[] data = new int[]{1,2,15,3,28,6,1,56,11,4,7,13};
        topk(data,n);
        for(int i=0;i<n;i++){
            System.out.println(data[i]);
        }
    }

    private static void topk(int[] data, int n) {
        if(data==null||data.length<n){
            throw new RuntimeException("invalid input");
        }
        if(data.length==n){
            return;
        }
        getIndex(data,data.length,0,data.length-1,n);
    }

    private static void swap(int[] data, int index, int right) {
        int temp = data[index];
        data[index] = data[right];
        data[right] = temp;
    }

    private static int random(int left, int right) {
        Random random = new Random();
        return random.nextInt(right-left)+left;
    }
}
