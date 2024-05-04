package org.example.stack;

import java.util.Stack;
import java.util.stream.Stream;

public class BalancedString {
    public static void main(String[] args) {
        String s = "(2+) [{4}]}";
        System.out.println(isBalanced(s));
    }

    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                Character top;
                if (!stack.isEmpty()) {
                    top = stack.pop();
                }else {
                    return false;
                }
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
