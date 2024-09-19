package com.learn.stream.api.methodref;

public class TestUpperCase {
    public static void main(String[] args) {
        //IUpperCase iUpperCase = String::toUpperCase;
         IUpperCase iUpperCase = TestUpperCase::convertToUpperCase;
        // this convert to like-> new new TestUpperCase().convertStringToUpperCase(hello world)
        String upperCase =iUpperCase.convertStringToUpperCase(new TestUpperCase(),"hello world");
        System.out.println(upperCase);


    }

   String convertToUpperCase( String str){
   return str.toUpperCase();
    }
}
