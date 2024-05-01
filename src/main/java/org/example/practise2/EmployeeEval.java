package org.example.practise2;

import java.util.List;

public class EmployeeEval {
    public static void main(String[] args) {
        List<Employee> test = List.of(new Employee(1, "naveen", List.of("chennai", "bangalore"))
                , new Employee(2, "naveena", List.of("chennai", "bangalore", "mumbai")),
                new Employee(3, "prasanth", List.of("bangalore", "mumbai", "kolkata"))
        );

        test.stream().map(Employee::id).forEach(System.out::println);
        test.stream().flatMap(employee -> employee.cities().stream()).forEach(System.out::println);
    }
}
