package com.learn.classandobjects;

public class Driver {
    static int minAgeForDriving = 18;
    String name;
    String dateOfLicense;
    int age;

    public boolean isAllowedToDriving(){
        return this.age >= minAgeForDriving;

    }
    public static void main(String[] args) {
       /* Car myCar = new Car();
        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.addFuel(3);
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());*/

        Car swift = new Car("red");
       // swift.addFuel(6);
        swift.start().drive();
        System.out.println("car color is: " +swift.color);
       // Driver myDriver = new Driver();
       // myDriver.dateOfLicense = "1/jan/2024";
       // System.out.println(this.age);
    }
}
