package com.learn.inheritance;

public class EqualAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Amit",30,"001");
        Person person2 = new Person("Amit",30,"001");
       if(person1.equals(person2)){
           System.out.println("Equal");
       }else {
           System.out.println("Not Equal");
       }
    }
}
