package org.example.challenges;

public class SeriesOfNumbers {
    public static void main(String[] args) {
        series(1, 32);
    }

    private static void series(int num, int limit) {
        if (num <= limit) {
            System.out.println(num);
            num += 3;
            series(num, limit);
        }
    }
}
