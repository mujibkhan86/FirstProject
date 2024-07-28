package com.learn.chalenge96;

public class EnumTest {
    public static void main(String[] args) {
        for (Day days : Day.values()) {
            System.out.printf("%s :" ,days);
        }
    }
}
