package com.learn.chalenge114;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
             new Employee("Prashant", 100),
             new Employee("Sanchit", 1000 ),
             new Employee("Ram", 10000 ),
             new Employee("Shyam", 1 ),
             new Employee("Mohan", 5 )
        );
        List<Employee> sortedBySalary =employees.stream()
                .sorted((emp1,emp2)-> Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .collect(Collectors.toList());
        System.out.println(sortedBySalary);

        List<Employee> sortedBySalary1 =employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .toList();
        System.out.println(sortedBySalary1);
    }
}
