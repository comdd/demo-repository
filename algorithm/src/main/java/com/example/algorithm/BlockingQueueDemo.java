package com.example.algorithm;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description :
 *
 * @author : dd
 */
public class BlockingQueueDemo<E> {
    private int inIndex = 0;
    private int outIndex = 0;
    private int count = 0;
    private int cap;
    private Object[] objs;
    private Lock lock;
    private Condition notFull;
    private Condition notEmpty;

    public BlockingQueueDemo() {

    }

    public BlockingQueueDemo(int cap) {
        this.cap = cap;
        this.objs = new Object[cap];
        lock = new ReentrantLock();
        notFull = lock.newCondition();
        notEmpty = lock.newCondition();
    }

    public boolean offer(E e) {
        if(e==null){
            throw new NullPointerException();
        }
        lock.lock();
        try {
            if (count == cap) {
                return false;
            }
            inIndex = inIndex < cap ? inIndex : 0;
            objs[inIndex++] = e;
            count++;
            return true;
        }finally{
            lock.unlock();
        }

    }

    public Object peek() {
        lock.lock();
        try {
            if (count == 0) {
                return null;
            }
            outIndex = outIndex < cap ? outIndex : 0;
            return objs[outIndex];
        }finally {
            lock.unlock();
        }

    }
    public Object pop(){
        lock.lock();
        try {
            if (count == 0) {
                return null;
            }
            outIndex = outIndex < cap ? outIndex : 0;
            Object result = objs[outIndex++];
            count--;
            return result;
        }finally {
            lock.unlock();
        }
    }
}
