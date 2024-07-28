package com.learn.operators;

class VarArgs {
    public static void main(String[] args) {
        System.out.println(concatenate("mujib", "khan"));
        System.out.println(concatenate("mujib", "khan","Amit","kumar"));
    }
    public static  String concatenate(String ... str){
      StringBuilder builder = new StringBuilder();
        for (String s : str) {
            builder. append(s).append(" ");
        }
        return builder.toString();
    }
}
