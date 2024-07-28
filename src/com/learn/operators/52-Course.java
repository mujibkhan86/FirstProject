package com.learn.operators;

 class Course {
   static int maxCapacity = 100;
  String courseName;
  int enrollments;
  String [] enrolledStudents;

  Course(String courseName){
   this.courseName = courseName;
   this.enrollments = 0;
   this.enrolledStudents = new String[maxCapacity];
  }
  static void setMaxCapacity(int maxCapacity){
       Course.maxCapacity = maxCapacity;
  }

  void enrollStudent(String studentName){
   enrollments++;
  }
  void  unrollStudent(String studentName){
      enrolledStudents[enrollments] = studentName;
      int i = 0;
      while (i < enrolledStudents.length){
         if(enrolledStudents[enrollments] == studentName)
          enrollments --;
      }
     
  }
}
