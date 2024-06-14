package org.example.regex;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class EmailAddress {
    public static void main(String[] args) {
        List<String> testStrings = Arrays.asList("Please contact us at support@example.com for assistance.", "You can also reach@cm.co. out to sales@example.com or admin@example.co.uk.", "Invalid emails: example@.com, @example.com, example.com");

        List<String> testing = testStrings.stream()
                .flatMap(x -> Arrays.stream(x.split("\\s+")))
                .map(x -> x.replaceAll("[.,;]$", ""))
                .filter(x -> Pattern.matches("[0-9a-z._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}", x))
                .toList();

        System.out.println(testing);

        // Regex for matching valid email addresses
//        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";
//
//        List<String> matchingEmails = testStrings.stream()
//                .flatMap(text -> Arrays.stream(text.split("\\s+"))) // Split by whitespace
//                .map(word -> word.replaceAll("[.,;]$", "")) // Remove trailing punctuation
//                .filter(word -> Pattern.matches(regex, word)) // Match using refined regex
//                .toList();

//        System.out.println(matchingEmails);
    }
}
