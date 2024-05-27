package org.example.challenge;

import java.util.Arrays;

public class DistinctToArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        Integer[] array = Arrays.stream(nums).boxed().distinct().toArray(Integer[]::new);
    }
}
