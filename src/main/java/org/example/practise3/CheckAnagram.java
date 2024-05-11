package org.example.practise3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CheckAnagram {
    public static void main(String[] args) {
        String name = "naveen";
        String newName = "naveen";
        List<String> firstList = Stream.of(name.split("")).sorted().toList();
        List<String> lastList = Stream.of(newName.split("")).sorted().toList();

        System.out.println(firstList.equals(lastList));
    }
}
