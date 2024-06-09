package org.example.challenge;

public class RegexTest {
    public static void main(String[] args) {
        String name = "NaveenPrasanth";
        int digits = 5;
        String summa = name.replaceAll(STR."^[a-zA-Z]{\{digits}}", "X".repeat(digits));
        System.out.println(summa);
    }
}
