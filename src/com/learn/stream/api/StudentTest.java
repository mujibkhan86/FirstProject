package com.learn.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.*;

public class StudentTest {
    public static void main(String[] args) {
        Student mujib = new Student(1,"mujib",99116359,34);
        Student Amit = new Student(2,"amit",991163,32);
        Student Rahul = new Student(3,"rahul",99116,36);
        List<Student> studentlist = Arrays.asList(mujib, Amit, Rahul);
        // old of way doing
       /* for (Student student : studentlist){
            System.out.println(student);
        }*/
        // converting to lambda
        /*studentlist.forEach(student->{
          if(student.getStudentName().equalsIgnoreCase("mujib")){
              System.out.println(student.getAge());
          }
        });*/
        // single line conversion
        studentlist.forEach(System.out::println);
    }
}
