package com.learn.stream.api;

public class Student {
    private int id;
    private String studentName;
    private int mobileNumber;
    private int age;

    public Student(int id, String studentName, int mobileNumber, int age) {
        this.id = id;
        this.studentName = studentName;
        this.mobileNumber = mobileNumber;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", studentName='").append(studentName).append('\'');
        sb.append(", mobileNumber=").append(mobileNumber);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
