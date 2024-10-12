package org.example.interview1;

public class FibonacciSeries {

    //0 1 1 2 3

    public static void main(String[] args) {
        int times = 5;
        recurse(0, 1, times - 2);
    }

    private static void recurse(int seed1, int seed2, int times) {
        System.out.println(seed1);
        if (times >= 0) {
            recurse(seed2, seed2 + seed1, --times);
        }

    }
}
