package org.example.practise3;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class RegexEval {
    public static void main(String[] args) {
        String name = "he_is_a_good_boy";
        List<String> test = Stream.of(name.split("_"))
                .map(x -> x.substring(1, 2).toUpperCase()+x.substring(1)).toList();
        StringJoiner stringJoiner = new StringJoiner("");
        stringJoiner.add(test.getFirst());
        test.stream().skip(1)
                .forEach(x -> stringJoiner.add(x.substring(1, 2)
                        .toUpperCase()+x.substring(2)));
        String value = "heIsAGoodBoy";
        List<String> testList = Stream.of(value.split("(?=[A-Z])")).toList();
        StringJoiner stringJoiner1 = new StringJoiner("");
        stringJoiner1.add(testList.getFirst());
        testList.stream().skip(1).forEach(x -> stringJoiner1.add(STR."_\{x.toLowerCase()}"));
        System.out.println(stringJoiner);
        System.out.println(stringJoiner1);
    }
}
