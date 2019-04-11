package com.example.algorithm;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Description :
 *
 * @author : dd
 */
public class StackDemo {

    public static boolean isPopOrder(int[] pushNums, int[] popNums) {
        if (popNums == null || pushNums == null
                || (pushNums.length != popNums.length)
                || popNums.length == 0) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int length = pushNums.length;
        int pushIndex = 0;
        int popIndex = 0;
        boolean isOrder = false;
        while (pushIndex < length) {
            stack.push(pushNums[pushIndex++]);
            while (stack.peek() != popNums[popIndex]
                    && pushIndex < length) {
                stack.push(pushNums[pushIndex++]);
            }
            while (popIndex < length
                    && stack.peek() == popNums[popIndex]) {
                stack.pop();
                popIndex++;
            }
            if ((pushIndex == popIndex) && (pushIndex == length)) {
                isOrder = true;
            }
        }
        System.out.println();
        return isOrder;
    }

    public static void main(String[] args) {
        int[] pushNums = new int[]{1, 2, 3, 4, 5};
        Stack<Integer> integers = new Stack<>();
        integers.push(3);
        integers.push(4);
        System.out.println(integers.search(4));
        Queue<Integer> queue = new ArrayBlockingQueue<Integer>(2);
        queue.add(4);
        queue.offer(5);
//        System.out.println(queue.add(3));
        System.out.println(queue.offer(7));
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        //int[] popNums = new int[]{3,5, 4, 2,1};
        //System.out.println(isPopOrder(pushNums, popNums));

    }
}
