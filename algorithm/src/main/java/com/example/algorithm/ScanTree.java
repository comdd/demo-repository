package com.example.algorithm;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Description :
 *
 * @author : dd
 */
public class ScanTree {
    private int deep = 0;
    private int maxRange = 0;
    private int lastRange = 0;
    private int curRange = 0;

    class Node {
        int value;
        Node left;
        Node right;
    }

    public void scan(Node root, int n) {
        if (root == null || n <= 0) {
            return;
        }
        Queue<Node> queue1 = new ArrayBlockingQueue(n);
        queue1.offer(root);
        deep++;
        maxRange = 1;
        scan(queue1);
    }

    private void scan(Queue<Node> queue) {
        if (queue.isEmpty()) {
            return;
        }
        int curRange = 0;
        while (lastRange > 0) {
            Node node = queue.poll();
            lastRange--;
            if (node.left != null) {
                queue.offer(node.left);
                curRange++;
            }
            if (node.right != null) {
                queue.offer(node.right);
                curRange++;
            }
        }
        if (!queue.isEmpty()) {
            lastRange = curRange;
            maxRange = maxRange > curRange ? maxRange : curRange;
            deep++;
        }
        scan(queue);
    }

}
