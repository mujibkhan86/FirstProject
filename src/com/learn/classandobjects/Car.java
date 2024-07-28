package com.learn.classandobjects;

public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;
    Car(String color){
        noOfSeats = 4;
        this.color = color;
        maxSpeed  = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }
    Car(){
        this("Black");
    }

    public Car start(){
        if(currentFuelInLiters == 0){
            System.out.println("Car is out of fuel, can not start");
        } else if ( currentFuelInLiters < 5 ) {
            System.out.println("Car is a reserved mood, please refuel");
        }else {
            System.out.println("Car is started...bruuuuuu");

        }
        return this;
    }
    public void drive(){
        currentFuelInLiters--;
            System.out.println("Car is driving:");

    }
    public void addFuel(float currentFuelInLiters){
     this.currentFuelInLiters += currentFuelInLiters;
    }
    public float getCurrentFuelLevel(){
        return  currentFuelInLiters;
    }
}
