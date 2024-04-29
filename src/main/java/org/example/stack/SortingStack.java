package org.example.stack;

import java.util.Stack;

public class SortingStack {
    static Stack<Integer> stack;

    static {
        stack = new Stack<>();
    }

    public static void main(String[] args) {
        stack.push(34);
        stack.push(35);
        stack.push(36);
        stack.push(37);
        stack.push(38);
        sortAscending(stack);
    }

    private static void sortAscending(Stack<Integer> stack){
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()){
            int poppedVal = stack.pop();
            if (tempStack.isEmpty()){
                tempStack.push(poppedVal);
            }
            if (poppedVal > tempStack.peek()){
                tempStack.push(poppedVal);
            }else {
                while (!tempStack.isEmpty()){
                    stack.push(tempStack.pop());
                }
                tempStack.push(poppedVal);
            }
        }

        System.out.println(stack);
    }
}
