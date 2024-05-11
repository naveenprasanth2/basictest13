package org.example.practise3;

public class FactorialOfNumber {
    public static void main(String[] args) {
        System.out.println(findFactorial(3));
    }

    private static int findFactorial(int number) {
        if (number <= 1) {
            return number;
        } else {
            return number * findFactorial(number - 1);
        }
    }
}
