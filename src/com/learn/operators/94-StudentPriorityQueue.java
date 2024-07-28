package com.learn.operators;

import java.util.Comparator;
import java.util.PriorityQueue;

class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });

        queue.offer(new Student("Prashant",'B'));
        queue.offer(new Student("Shyam",'C'));
        queue.offer(new Student("Ram",'A'));
        queue.offer(new Student("Mohan",'D'));
        queue.offer(new Student("Sachet",'A'));
        System.out.printf("Queue is: %s\n", queue);
        /*System.out.printf("Got:  %s\n", queue.poll());
        System.out.printf("Got:  %s\n", queue.poll());
        System.out.printf("Got:  %s\n", queue.poll());
        System.out.printf("Got:  %s\n", queue.poll());
        System.out.printf("Got:  %s\n", queue.poll());*/
        for (Student student : queue) {
            System.out.println(student);
        }
    }
    private static class Student{
        private final String name;
        private final char grade;
        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return  name + ": " +grade;
        }
    }

}
