package com.learn.operators;

class StringManipulation {
    public static void main(String[] args) {
        String firstName = "Amit";
        String lastName = "Jain";
        String fullName = firstName.concat(" ").concat(lastName).toUpperCase();
        System.out.println(fullName);

    }
}
