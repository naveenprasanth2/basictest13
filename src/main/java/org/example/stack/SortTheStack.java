package org.example.stack;

import java.util.Stack;

public class SortTheStack {
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

    static void sort(Stack<Integer> stack){
        Stack<Integer> tempStack = new Stack<>();
        if (tempStack.isEmpty()){
            tempStack.push(stack.pop());
        }
        while (!stack.isEmpty()){
            int val = stack.pop();
            if(tempStack.peek() > val){
                tempStack.push(val);
            }else {
                while (!tempStack.isEmpty()){
                    if (tempStack.peek() <= val){
                        break;
                    }else {
                        stack.push(tempStack.pop());
                    }
                }
                tempStack.push(val);
            }
        }
        while (!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
        System.out.println(stack);
    }
}
