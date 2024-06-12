package org.example.challenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LongestPalindrome {
    public static void main(String[] args) {
        String values = "madam";
        List<String> test = new ArrayList<>();

        for (int i = 0; i < values.length(); i++) {
            for (int j = i + 1; j <= values.length(); j++) {
                String original = values.substring(i, j);
                StringBuilder stringBuilder = new StringBuilder(original);
                stringBuilder.reverse();
                if (original.contentEquals(stringBuilder)) {
                    test.add(original);
                }
            }
        }

        test.sort(Comparator.reverseOrder());

        System.out.println(test);
    }
}
