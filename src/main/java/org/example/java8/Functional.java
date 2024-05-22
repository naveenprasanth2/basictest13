package org.example.java8;

import java.util.function.BiFunction;
import java.util.function.ToIntBiFunction;

public class Functional {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> test = (x, y) -> x.length() + y.length();
        ToIntBiFunction<String, String> testInt = (x, y) -> x.length()+y.length();
        printIntMethod(testInt);
        printMethod(test);
    }

    static void printMethod(BiFunction<String, String, Integer> test) {
        int val = test.apply("summa", "tha");
        System.out.println(val);
    }

    static void printIntMethod(ToIntBiFunction<String, String> test) {
        int val = test.applyAsInt("summa", "tha");
        System.out.println(val);
    }
}
