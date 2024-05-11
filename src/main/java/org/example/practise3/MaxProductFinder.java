package org.example.practise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxProductFinder {
    public static void main(String[] args) {
        int[] numbers = {3, 7, -2, 9, 5, -6};
        int maxProduct = findMaxProduct(numbers);
        System.out.println(maxProduct);
    }

    private static int findMaxProduct(int[] numbers) {
        List<Integer> test = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                test.add(numbers[i] * numbers[j]);
            }
        }
        test.sort(Comparator.reverseOrder());
        if (test.get(0) < 0) {
            return -1;
        } else {
            return test.get(1);
        }
    }
}
