package org.example.practise3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 1, 2, 3, 4, 3, 4, 5, 6, 7, 8, 0};
        List<Integer> test = Arrays.stream(a).boxed().toList();
        List<Integer> result = test.stream().filter(x -> Collections.frequency(test, x) == 1)
                .toList();

        System.out.println(result);
    }
}
