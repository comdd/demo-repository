package com.example.algorithm;


import java.util.Stack;

/**
 * Description :
 *
 * @author : dd
 */
public class SortStack {

    public static void sortStack(Stack<Integer> stack){
        if(stack == null||stack.size()<=1){
            return;
        }
        Stack<Integer> temStack = new Stack<>();
        int temp = stack.pop();
        temStack.push(temp);
        while(!stack.empty()){
            temp = stack.pop();
            while(!temStack.empty()&&temp > temStack.peek()){
                stack.push(temStack.pop());
            }
            temStack.push(temp);
        }
        while(!temStack.empty()){
            stack.push(temStack.pop());
        }
    }
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(8);
        stack.push(2);
        stack.push(1);
        sortStack(stack);
        System.out.println(stack.peek());
    }
}
