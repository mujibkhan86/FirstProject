package com.learn.string;

public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        //char at index 0
        System.out.println(sb.charAt(0));
        //set char at index 0
       // sb.setCharAt(0,'P');
        //System.out.println(sb);
        sb.insert(0,'S');
        System.out.println(sb);
        //delete the char
        sb.delete(0, 1);
        System.out.println(sb);

        StringBuilder reverse = new StringBuilder("hello");
        for (int i = 0; i<reverse.length()/2; i++){
            int front = i;
            int back = reverse.length() -1 -i; // 5-1-0 = 4
            char frontChar = reverse.charAt(front);
            char backChar = reverse.charAt(back);

            reverse.setCharAt(front, backChar);
            reverse.setCharAt(back, frontChar);
        }
       // System.out.println(reverse);

        String s = "mujib";
                // char cc [] =  s.toCharArray();
                 for (int i = s.length()-1; i>=0; i-- ){
                     System.out.print(s.charAt(i));
                 }
    }
}
