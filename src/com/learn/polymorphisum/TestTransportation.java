package com.learn.polymorphisum;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
        //Vehicle vCar = new Car();
          Plane p = new Plane();
       // Car vhcar = (Car) new Vehicle();
        //castTest(vCar);
        castTest(c);
        castTest(p);
    }
    private static void castTest(Vehicle vehicle){
     //Car v = (Car)vehicle;
     //vehicle).noOfDoors();
       // ((Car) vehicle).noOfDoors();
        //v.start();
        vehicle.start();;
        if(vehicle instanceof Car) {
            System.out.println("true");
        }
    }
}
