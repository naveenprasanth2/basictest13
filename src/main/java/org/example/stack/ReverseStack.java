package org.example.stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(35);
        stack.push(36);
        stack.push(37);
        stack.push(38);
        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
    }

    private static void reverseStack(Stack<Integer> stack){
        Stack<Integer> temp1 = new Stack<>();
        while (!stack.isEmpty()){
            temp1.push(stack.pop());
        }
        Stack<Integer> temp2 = new Stack<>();
        while (!temp1.isEmpty()){
            temp2.push(temp1.pop());
        }

        while (!temp2.isEmpty()){
            stack.push(temp2.pop());
        }
    }
}
