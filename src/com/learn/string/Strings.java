package com.learn.string;

public class Strings {
    public static void main(String[] args) {
       String firstName = "tony";
       String lastName = "stark";
       String fullName = firstName + "@" +lastName;
       // find the length
        System.out.println(fullName.length());
        // print the catch character position
        // if you repeater charterer than we need to use loop
        // if you want print string all character than we need to use loop.
        int count =0;
        for(int i =0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
            if(fullName.charAt(i) == 't'){
                count++;
            }
        }
        System.out.println("total count is: " +count);

    }
}
