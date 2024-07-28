package com.learn.enums;

public class TestingEnums {
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.RED;
        color = TrafficLight.GREEN;
        Grade grade = Grade.A;
        grade = Grade.F;
                  Grade s = Grade.valueOf("D");
        for (Grade value : Grade.values()) {
            System.out.println(value);
        }
    }

}
