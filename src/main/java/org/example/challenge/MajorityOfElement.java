package org.example.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityOfElement {
    public static void main(String[] args) {
        int[] numArray = {1, 2, 1, 2, 1, 1, 2, 1, 1};
     List<Map.Entry<Integer, Long>> test = Arrays.stream(numArray).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted((x1, x2) -> (int) (x2.getValue() - x1.getValue())).toList();

        System.out.println(test.getFirst());
    }
}
