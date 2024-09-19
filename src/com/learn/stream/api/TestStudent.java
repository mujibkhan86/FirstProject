package com.learn.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStudent {
    public static void main(String[] args) {
      //  print 2 student name how ager is grater than 25
        // first step need to print all the student forget to thing print 2 student
         // second Step print those student whose age is greater than 25
        //third step print student name only not the entire object. I want to transform the
        // student object to a string. the name of the student. so i want to transform than i want to use map here
        // for transformation. the map is taken as a input the input is student object than student object i want to
        // transform as string.
        //So I am taken a input student object and returning the string student name.
        // third step i want to only print the first 2 student than we use limit after map because map is returning
        // all the student name but we want only two first student.
          List<String>student =getStudentList().stream()
                  .filter(studentObj-> studentObj.getAge() > 25)
                  .map(studentObj->{return studentObj.getStudentName();})
                  .limit(2)
                  //.forEach(studentName->System.out.println(studentName));
                  .collect(Collectors.toList());
                  System.out.println(student);


       /* List<Student> list = getStudentList();
         list.stream()
                .filter((age) ->age.getAge() > 25)
                 .map(Student::getStudentName)
                 .limit(2)
                 .forEach(System.out::println);*/

        //System.out.println(studentStream);

    }
    public static List<Student> getStudentList(){
        List<Student>studentList = new ArrayList<>();
        Student mujib = new Student(1,"mujib",99116359,34);
        Student Amit = new Student(2,"amit",991163,32);
        Student Rahul = new Student(3,"rahul",99116,36);
        Student Priya = new Student(4,"priya",5678,31);
        Student Ram = new Student(5,"ram",6788,24);
        Student Lanyard = new Student(6,"lanyard",655,38);
        Student Chitra = new Student(7,"chitra",8766,33);
        studentList.add(mujib);
        studentList.add(Amit);
        studentList.add(Rahul);
        studentList.add(Priya);
        studentList.add(Ram);
        studentList.add(Lanyard);
        studentList.add(Chitra);

        return studentList;
    }
}
