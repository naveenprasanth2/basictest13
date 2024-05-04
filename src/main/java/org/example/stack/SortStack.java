package org.example.stack;

import java.util.Stack;

public class SortStack {
    private static Stack<Integer> stack;

    static {
        stack = new Stack<>();
    }


    public static void main(String[] args) {
        stack.push(34);
        stack.push(35);
        stack.push(36);
        stack.push(37);
        stack.push(38);
        sort(stack);
    }

    static void sort(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int val = stack.pop();
            while ((!tempStack.isEmpty()) && (tempStack.peek() > val)) {
                stack.push(tempStack.pop());
            }
            tempStack.push(val);

        }
        System.out.println(tempStack);
    }
}
