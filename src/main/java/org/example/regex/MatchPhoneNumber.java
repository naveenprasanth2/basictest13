package org.example.regex;

import java.util.Arrays;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        List<String> testStrings = Arrays.asList(
                "Call me at (123) 456-7890.",
                "My office number is 123-456-7890.",
                "Invalid numbers: 1234567890, (123)456-7890, 123-4567-890"
        );

        // Corrected regex pattern
        String regex = "\\(\\d{3}\\) \\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4}";

        Pattern pattern = Pattern.compile(regex);

        List<String> matchingNumbers = testStrings.stream()
                .flatMap(text -> {
                    Matcher matcher = pattern.matcher(text);
                    return matcher.results().map(MatchResult::group);
                }).toList();

        System.out.println(matchingNumbers);
    }
}
