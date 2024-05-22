package org.example.stacks;

import java.util.Stack;

public class StackEval {
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> stack1 = new Stack<>();

    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        pop();
        pop();
        System.out.println("****************");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }


    private static void pop() {
        while (!stack.isEmpty()){
            stack1.push(stack.pop());
        }
        System.out.println(stack1.pop());
        while (!stack1.isEmpty()){
            stack.push(stack1.pop());
        }
    }
}
