package org.example.practise2;

import java.util.List;

public class EmployeeEval1 {
    public static void main(String[] args) {
        List<Employee1> employees = List.of(
                new Employee1(1, 32000.00, 3),
                new Employee1(2, 33000.00, 1),
                new Employee1(3, 31000.00, 4),
                new Employee1(4, 35000.00, 2),
                new Employee1(5, 34000.00, 5),
                new Employee1(6, 32500.00, 1),
                new Employee1(7, 31500.00, 2),
                new Employee1(8, 34500.00, 4),
                new Employee1(9, 33500.00, 3),
                new Employee1(10, 35500.00, 5)
        );
        System.out.println(employees);
        employees.forEach(x -> {
                    switch (x.getGrade()) {
                        case 4, 5 -> x.setSalary(x.getSalary() * 1.3);
                        case 2, 3 -> x.setSalary(x.getSalary() * 1.4);
                        case 1 -> x.setSalary(x.getSalary() * 1.5);
                        default -> throw new IllegalStateException(STR."Unexpected value: \{x.getGrade()}");
                    }
                });

        System.out.println(employees);
    }
}
