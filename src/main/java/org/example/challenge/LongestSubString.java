package org.example.challenge;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        String name = "abcabcbb";
        String[] names = name.split("");
        Map<String, Integer> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < names.length; i++) {
            if (map.containsKey(names[i])) {
                break;
            } else {
                stringBuilder.append(names[i]);
                map.put(names[i], 1);
            }
        }

        System.out.println(stringBuilder);
    }
}
