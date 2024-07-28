package com.learn.chalenge77.utils;

import com.learn.chalenge77.gemeroty.Circle;
import com.learn.chalenge77.gemeroty.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        Rectangle rectangle = new Rectangle(10, 5);
        double cirArea = Math.PI * Math.pow(circle.radius,2);
        double rectArea = rectangle.length * rectangle.breath;
        System.out.printf("Area of the circle is:  %f, Area of the Rectangle is: %f",
                cirArea, rectArea);
    }
}
