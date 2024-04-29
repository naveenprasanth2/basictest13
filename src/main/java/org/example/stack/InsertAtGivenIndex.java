package org.example.stack;

import java.util.Stack;

public class InsertAtGivenIndex {
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        stack.push(34);
        stack.push(35);
        stack.push(36);
        stack.push(37);
        stack.push(38);
        System.out.println(stack);
        insertAtGivenIndex(2, 99);
        insertAtGivenIndex(4, 100);
        insertAtGivenIndex(5, 101);
        System.out.println(stack);
    }

    private static void insertAtGivenIndex(int index, int value) {
        Stack<Integer> tempStack = new Stack<>();
        if (index > stack.size()) {
            throw new IndexOutOfBoundsException();
        }
        int size = stack.size();
//        while (stack.size() > index){
//            tempStack.push(stack.pop());
//        }

        for (int i = 1; i <= size - index; i++) {
            tempStack.push(stack.pop());
        }

        stack.push(value);

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
