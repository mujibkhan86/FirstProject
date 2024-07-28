package com.learn.operators;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student details {name : "+name+ ", age: "+age+ "}";
    }

    public static void main(String[] args) {
        Student student = new Student("Amit", 30);
        System.out.println(student);
    }
}
