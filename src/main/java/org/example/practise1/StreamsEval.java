package org.example.practise1;

import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.regex.Pattern;

public class StreamsEval {
    public static void main(String[] args) {
        List<String> names = List.of("naveen", "prasanth", "shiva", "summas");
        List<String> test = names.stream().filter(s -> s.startsWith("n") || s.startsWith("s"))
                .map(String::toUpperCase).toList();

        System.out.println(test);

        List<String> test1 = names.stream().filter(x -> Pattern.matches("^n.+$|^.+s$", x))
                .map(String::toUpperCase).toList();

        System.out.println(test1);

    }
}
