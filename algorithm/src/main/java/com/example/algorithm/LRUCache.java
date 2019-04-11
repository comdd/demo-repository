package com.example.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Description :
 *
 * @author : dd
 */
public class LRUCache<K, V> {
    class Node {
        K key;
        V vlaue;
        Node pre;
        Node next;
    }

    private Map<K, Node> cache;
    private int cap;
    Node head;
    Node tail;

    private LRUCache() {

    }

    public LRUCache(int cap) {
        this.cap = cap;
        this.cache = new HashMap<>(cap);
    }

    public V get(K key) {
        if (!cache.containsKey(key)) {
            return null;
        }
        Node node = cache.get(key);
        add(node);
        return node.vlaue;
    }

    private boolean add(Node node) {
        if (!remove(node))
            return true;
        tailAdd(node);
        return true;
    }

    private boolean remove(Node node) {
        if (node.next == null) {
            return false;
        }
        if (node.pre == null) {
            head = head.next;
        } else {
            node.next.pre = node.pre;
            node.pre.next = node.next;
        }
        return true;
    }

    private void tailAdd(Node node) {
        tail.next = node;
        node.pre = tail;
        node.next = null;
        tail = node;
    }

    public V addE(K key, V value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            V oldValue = node.vlaue;
            node.vlaue = value;
            add(node);
            return oldValue;
        } else {
            Node node = new Node();
            node.key = key;
            node.vlaue = value;
            if (cache.size() == cap) {
                Node temp = head;
                head = head.next;
                cache.remove(temp.key);
            } else if (cache.size() == 0) {
                head = node;
                tail = node;
            } else {
                tailAdd(node);
            }
            cache.put(key, node);
            return null;
        }
    }
}
