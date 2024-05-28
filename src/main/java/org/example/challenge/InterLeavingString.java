package org.example.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterLeavingString {
    public static void main(String[] args) {
        String s1 = "summa";
        Map<String, Long> s1Map = Stream.of(s1.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
