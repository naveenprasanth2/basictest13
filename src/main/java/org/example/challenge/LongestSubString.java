package org.example.challenge;

import java.util.*;

public class LongestSubString {
    public static void main(String[] args) {
        String name = "abcabcbb";
        String[] names = name.split("");
        Map<String, Integer> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            if (map.containsKey(names[i])) {
                list.add(stringBuilder.toString());
                map.clear();
                stringBuilder.delete(0, stringBuilder.length());
            } else {
                stringBuilder.append(names[i]);
                map.put(names[i], 1);
            }
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list.getFirst());
    }
}
