package org.example.practise1;


import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class OptionalTest {
    public static void main(String[] args) {
        OptionalTest optionalTest = new OptionalTest();
        String value = Optional.of("test").orElseThrow(NoSuchElementException::new);
        System.out.println(value);

//        Parent parent = new Child(5);
//        System.out.println(parent.number);
        IntStream.rangeClosed(1, 10).forEach(optionalTest::print);
        Function<String, Integer> function = String::length;
        BiFunction<String, String, Integer> function1 = (String name, String city) -> (name + city).length();
        System.out.println(optionalTest.test(function));
        System.out.println(optionalTest.test1(function1));
        Supplier<String> supplier = optionalTest::printWithoutArgs;
        System.out.println(supplier.get());
        System.out.println(optionalTest.printWithoutArgs());
    }

    private <T> void print(T printable) {
        System.out.println(printable);
    }

    private String printWithoutArgs() {
        return "without arguments";
    }

    private Integer test(Function<String, Integer> function) {
        return function.apply("testing");
    }

    private Integer test1(BiFunction<String, String, Integer> function1) {
        return function1.apply("testing", "summa");
    }

}
