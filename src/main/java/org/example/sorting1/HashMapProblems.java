package org.example.sorting1;

import java.util.HashMap;

public class HashMapProblems {
    public static void main(String[] args) {
        HashMap<String, String> test = new HashMap<>();
        test.put("name", "naveen");
        test.put("age", "25");

        HashMap<String, String> test1 = new HashMap<>();
        test1.put("name", "naveen");

        test.putAll(test1);

        test.entrySet().stream().filter(x -> !test1.containsKey(x.getKey())).forEach(System.out::println);
    }
}
