package com.learn.stream.api.methodref;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestEmployee {
    public static void main(String[] args) {
       Supplier<Employee> employeeSupplier= Employee ::new;
              /* ()->{
            return new Employee(101,"mujib");
        };*/

        Employee employee = employeeSupplier.get();
        System.out.println(employee);

        Function<Integer, Employee> employeeFunction = Employee ::new;
        Employee emp1 = employeeFunction.apply(10);
        System.out.println(emp1);

        BiFunction<Integer, String,Employee> employeeBiFunction = Employee ::new;
        Employee emp2 = employeeBiFunction.apply(12, "mujib");
        System.out.println(emp2);
    }
}
