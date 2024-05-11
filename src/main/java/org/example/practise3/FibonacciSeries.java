package org.example.practise3;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(findFibonacci(7));
    }

    private static int findFibonacci(int value) {
        if (value == 0 || value == 1) {
            return value;
        } else {
            return findFibonacci(value - 1) + findFibonacci(value - 2);
        }
    }
}
