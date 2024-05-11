package org.example.practise3;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class FindDuplicatesInString {
    public static void main(String[] args) {
        String name = "tuyviyubiugtwdfuydbieb";
        List<String> testList = Stream.of(name.split("")).toList();
        List<String> finalList = testList.stream()
                .filter(x -> Collections.frequency(testList, x) >= 2)
                .distinct().toList();
        System.out.println(finalList);
    }
}
