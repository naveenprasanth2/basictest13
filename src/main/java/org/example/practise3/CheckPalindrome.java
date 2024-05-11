package org.example.practise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckPalindrome {
    public static void main(String[] args) {
        String name = "naveen";
        List<String> firstList = List.of(name.split(""));
        List<String> lastList = new ArrayList<>(List.of(name.split("")));
        Collections.reverse(lastList);
        System.out.println(firstList.equals(lastList));
    }
}
