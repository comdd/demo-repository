package com.example.algorithm.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Description :
 *
 * @author : dd
 */
public class BlockingQueue {

    private List<Integer> queue = new ArrayList<>(10);

    public synchronized void add(int x){
        if(queue.size()>=10){
            throw new IllegalStateException();
        }
        queue.add(x);
    }
    public synchronized int remove(){
        if(queue.size()==0){
            throw new NoSuchElementException();
        }
        return queue.remove(0);
    }
    public synchronized int element(){
        if(queue.size()==0){
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }
    public synchronized boolean offer(int x){
        if(queue.size()>=10){
            return false;
        }
        return queue.add(x);
    }
    public synchronized Integer poll(){
        if(queue.size()==0){
            return null;
        }
        return queue.get(0);
    }
    public synchronized Integer peek(){
        if(queue.size()==0){
            return null;
        }
        return queue.remove(0);
    }
    public synchronized void put(int x) throws InterruptedException {
        while (queue.size()==0){
            Thread.sleep(100);
        }
        queue.add(x);
    }
    public synchronized int take() throws InterruptedException {
        while (queue.size()>10){
            Thread.sleep(100);
        }
        return queue.remove(0);
    }
    public static void main(String[] args){
        BlockingQueue blockingQueue = new BlockingQueue();
        blockingQueue.add(10);
        blockingQueue.add(13);
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println();
    }
}
