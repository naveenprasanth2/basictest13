package org.example.sorting1;

import java.util.Random;
import java.util.stream.IntStream;

public class BubbleSort {

    public static void main(String[] args) {
        int[] inputArray = new int[10];
        Random random = new Random();
        IntStream.rangeClosed(1, 10).forEach(x -> {
            inputArray[x] = random.nextInt(100000);
        });

        System.out.println("Before");

        

    }
}
