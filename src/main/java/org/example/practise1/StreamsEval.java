package org.example.practise1;

import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class StreamsEval {
    public static void main(String[] args) {
        List<String> names = List.of("naveen", "prasanth", "shiva");
       List<String> test =  names.stream().filter(s -> s.startsWith("n") || s.startsWith("s"))
                .map(String::toUpperCase).toList();
       log.info(test);
    }
}
