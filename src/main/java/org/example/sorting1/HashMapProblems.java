package org.example.sorting1;

import java.util.HashMap;

public class HashMapProblems {
    public static void main(String[] args) {
        HashMap<String, String> test = new HashMap<>();
        test.put("name", "naveen");
        test.put("age", "25");

        HashMap<String, String> test1 = new HashMap<>();
        test1.put("name", "naveen");

        HashMap<String, String> biggest = test.size() > test1.size() ? test : test1;
        HashMap<String, String> smallest = test.size() < test1.size() ? test : test1;
        biggest.entrySet().stream().filter(x -> !smallest.containsKey(x.getKey())).forEach(System.out::println);
    }
}
