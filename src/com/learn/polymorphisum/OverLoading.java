package com.learn.polymorphisum;

public class OverLoading {
    public int add(int a, int b){
        return a+b;
    }
    public String add(String a, String b){
      return a+b;
    }

    public static void main(String[] args) {
        OverLoading overLoading =  new OverLoading();
        System.out.println(overLoading.add(5,4));
        System.out.println(overLoading.add("a ", "b"));
    }
}
