package com.learn.stream.api.methodref;

public class TestMethodRef {
    public static void main(String[] args) {
    /* Isum isum = ((num1,num2)->{ return num1+num2;});
        System.out.println(isum.sum(5,5));*/


        //Isum isum1 = TestMethodRef::addition;
         //   Isum isum1 = Integer::sum;
        //  (a,b)->{
        //  return Integer.sum(a,b);
        // } // internally do this
//int sum= isum1.sum(new 12,12);
       // System.out.println("sum is :" +sum);
    }



    public static int addition(int value1, int value2){
        System.out.println("helllllllllllll");
     return value1 + value2;
    }
}
