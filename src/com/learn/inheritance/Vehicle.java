package com.learn.inheritance;

public class Vehicle {
private int noOfTires;

public void setNoOfTires(int noOfTires){
    this.noOfTires = noOfTires;
}
public void commute(){
    System.out.println("I am going from place A to Place B using %d tires, " + noOfTires);
    }
}
