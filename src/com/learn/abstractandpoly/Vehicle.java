package com.learn.abstractandpoly;

public abstract class Vehicle implements Transport{
    private int noOfTires;

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }
public abstract void makeStartSound();
    public void commute(){
        System.out.println("going..");
    }

    @Override
    public void getSetGo() {
        System.out.println("going to place...");
    }
}
