package org.example.challenges;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Peoples {
    public static void main(String[] args) {
        String[] names = {"naveen", "prasanth", "naveen", "praveen"};

        List<String> test = Stream.of(names).toList();

//        test.stream().filter(x -> Collections.frequency(test, x) > 1).distinct().forEach(System.out::println);

        for (String name : names) {
            if (test.indexOf(name) == test.lastIndexOf(name)) {
                System.out.println(name);
                System.out.println("This is unique");
            }
        }
    }
}
