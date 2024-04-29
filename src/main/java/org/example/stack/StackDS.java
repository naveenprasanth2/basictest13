package org.example.stack;

import java.util.Stack;

public class StackDS {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.empty());
        stack.push(34);
        stack.push(35);
        stack.push(36);
        stack.push(37);
        stack.push(38);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.contains(38));
        stack.insertElementAt(12, 2);
        System.out.println(stack);
    }
}
