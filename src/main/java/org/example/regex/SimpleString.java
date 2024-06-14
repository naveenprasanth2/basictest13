package org.example.regex;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class SimpleString {
    public static void main(String[] args) {
        List<String> testStrings = Arrays.asList(
                "hello world",
                "hi there",
                "helloo",
                "hello"
        );

        List<String> testing = testStrings.stream().filter(x -> Pattern.matches(".*\\bhello\\b.*", x))
                .toList();

        System.out.println(testing);

    }
}
