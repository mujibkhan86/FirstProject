package com.learn.chalenge109;

public class CheckString {
    public static void main(String[] args) {
        String str = "aabbc";
        String [] a = new String[]{str};
        for (int i =0; i<a.length; i++){
            String s = a[i];
            if(s.charAt(i) == s.charAt(i))
            System.out.println(s);
        }
    }
}
