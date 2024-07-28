package com.learn.chalenge79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Amit",30,44400.00);
        System.out.println(employee.getEmployeeDetails());
        employee.setName("Ram");
        System.out.println(employee.getEmployeeDetails());
    }
}
