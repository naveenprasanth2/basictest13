package org.example.interview;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String test = "My 90 name 10 is 50 Naveen";

       Long sum = Stream.of(test.split(" "))
                    .filter(x -> Pattern.matches("\\d+", x))
                    .mapToLong(Integer::valueOf).sum();

        System.out.println(sum);
    }
}
