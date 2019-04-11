package com.example.algorithm;

/**
 * Description :
 *
 * @author : dd
 */
public class ReverseList {
    class ListNode {
        int value;
        ListNode next;
    }

    public ListNode reverseList(ListNode head, int m, int n) {
        if (head == null || m > n) {
            return null;
        }
        ListNode temp = new ListNode();
        temp.next = head;
        ListNode pre = temp;
        ListNode start = null;
        ListNode tail = null;
        for (int i = 0; i < m - 1; i++) {
            pre = pre.next;
            if (pre.next == null) {
                return null;
            }
        }
        start = pre.next;
        tail = start.next;
        for (int i = m; i < n; i++) {
            if (tail == null) {
                return null;
            }
            start.next = tail.next;
            tail.next = pre.next;
            pre.next = tail;
            tail = start.next;
        }
        return temp.next;
    }
}
