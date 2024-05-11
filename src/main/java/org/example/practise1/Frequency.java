package org.example.practise1;

import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        List<String> test = List.of("test", "test1", "test", "test1", "summa");
        test.stream().filter(x -> Collections.frequency(test, x) >=2 ).distinct().forEach(System.out::println);
    }
}
