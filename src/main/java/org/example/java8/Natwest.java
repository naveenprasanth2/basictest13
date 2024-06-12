package org.example.java8;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Natwest {
    public static void main(String[] args) {
        String name = "naveen is a good boy good naveen";
        String[] answer = Stream.of(name.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .toArray(String[]::new);

        System.out.println(Arrays.toString(answer));
    }
}
