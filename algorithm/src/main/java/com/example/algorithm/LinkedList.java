package com.example.algorithm;

import jdk.nashorn.internal.ir.debug.JSONWriter;
import jdk.nashorn.internal.parser.JSONParser;

/**
 * Description :
 *
 * @author : dd
 */
public class LinkedList {
    static class Node{
        private int value;
        private Node next;
        public Node(){

        }
        public Node(int value){
            this.value= value;
        }
    }
    public static void main(String[] args){
        Node node0 = new Node(1);
        node0.next = new Node(3);
        node0.next.next = new Node(5);
        Node node1 = new Node(2);
        node1.next = new Node(4);
        node1.next.next = new Node(6);
        Node node = merge(node0,node1);
        while(node!=null){
            System.out.println(node.value);
            node = node.next;
        }
    }

    private static Node merge(Node node0, Node node1) {
        if(node0==null){
            return node1;
        }else if(node1 == null){
            return node0;
        }
        Node nodeNew = null,node = null;
        if(node0.value<node1.value){
            nodeNew = node0;
            node0 = node0.next;
        }else{
            nodeNew = node1;
            node1 = node1.next;
        }
        node = nodeNew;
        while(node0!=null&&node1!=null){
            if(node0.value<node1.value){
                node.next = node0;
                node0 = node0.next;
            }else{
                node.next = node1;
                node1 = node1.next;
            }
            node = node.next;
        }
        if(node0==null){
            node.next = node1;
        }else if(node1==null){
            node.next = node0;
        }
        return nodeNew;
    }
}
