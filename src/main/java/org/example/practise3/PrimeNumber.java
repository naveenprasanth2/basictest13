package org.example.practise3;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 13;
        int value = (number / 2) - 1;
        boolean isPrime = true;
        while (value > 1) {
            if (number % value == 0) {
                isPrime = false;
                break;
            }
            value--;
        }
        System.out.println(isPrime ? "The number is prime" : "The number is not prime");
    }
}
