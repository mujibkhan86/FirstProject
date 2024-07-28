package com.learn.inheritance;

public class TwoWheeler extends  Vehicle{
    TwoWheeler(){
        setNoOfTires(2);
    }
    public void balance(){
        System.out.println("I am balancing on two tires.");
    }
}
