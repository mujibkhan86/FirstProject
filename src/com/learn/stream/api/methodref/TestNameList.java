package com.learn.stream.api.methodref;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestNameList {
    public static void main(String[] args) {
        Function<Employee,String> employeeStringFunction = Employee ::getName;
        String name = employeeStringFunction.apply(new Employee(1, "jon"));
        System.out.println(name);
        System.out.println("------------------------------");

/*
        Function<String, Employee> stringToEmployeeConversion = (string)->
                                            {
                                               return new Employee(string);
                                            };
*/

        BiFunction<Integer, String, Employee> stringToEmployeeConversion = Employee::new;

        /*Employee emp = stringToEmployeeConversion.apply(10,"Rama");
        System.out.println(emp);*/

        List<String>stringList = List.of("Abhilash","Abhishek","joy","Clarck","Amit","Doe","Ramesh");
      // Consumer<String>stringConsumer = System.out::println; //name-> System.out.println(name);
        stringList.stream()
                /*.map((str)->{
                 return new Employee("amr");
                })*/
                .map(Employee::new)
               // .map((emp)->{
                //  emp.setId(ThreadLocalRandom.current().nextInt(1, 100));
               //   return emp;
              //  })
                .map((Employee ::getName))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
