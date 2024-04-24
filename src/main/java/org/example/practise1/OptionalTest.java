package org.example.practise1;


import lombok.extern.log4j.Log4j2;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;

@Log4j2
public class OptionalTest {

    private static final String WITHOUT_ARGUMENTS = "without arguments";

    public static void main(String[] args) {
        OptionalTest optionalTest = new OptionalTest();
        String value = Optional.of("test").orElseThrow(NoSuchElementException::new);
        log.info(value);

        Parent parent = new Child(5);
        log.info(parent.number);
        parent.test();
        IntStream.rangeClosed(1, 10).forEach(optionalTest::print);
        ToIntFunction<String> function = String::length;
        BiFunction<String, String, Integer> function1 = (String name, String city) -> (name + city).length();
        log.info(optionalTest.test(function));
        log.info(optionalTest.test1(function1));
        Supplier<String> supplier = optionalTest::printWithoutArgs;
        log.info(supplier.get());
        log.info(optionalTest.printWithoutArgs());
    }

    private <T> void print(T printable) {
        log.info(printable);
    }

    private String printWithoutArgs() {
        return WITHOUT_ARGUMENTS;
    }

    private Integer test(ToIntFunction<String> function) {
        return function.applyAsInt("testing");
    }

    private Integer test1(BiFunction<String, String, Integer> function1) {
        return function1.apply("testing", "summa");
    }

}
