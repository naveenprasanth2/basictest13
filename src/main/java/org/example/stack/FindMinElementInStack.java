package org.example.stack;

import java.util.Objects;
import java.util.Stack;

public class FindMinElementInStack {
    static Stack<Integer> stack;
    static Stack<Integer> minStack;

    static {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public static void main(String[] args) {
        insert(10);
        insert(5);
        insert(7);
        insert(9);
        insert(2);
        insert(200);
        System.out.println(minStack.peek());
        pop();
        pop();
        System.out.println(minStack.peek());


    }


    static void insert(int val) {
        stack.push(val);
        if (minStack.isEmpty() || minStack.peek() > val) {
            minStack.push(val);
        }
    }

    static void pop() {
        if(Objects.equals(stack.pop(), minStack.peek())){
            minStack.pop();
        }
    }
}
