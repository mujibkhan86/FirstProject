package com.learn.access.modifier;

public class Car {
    public String color;
    public String model;
    private double fueLevel;
    private long costOfPurchase;
      public Car(){

      }

    public Car(String color, String model, double fueLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fueLevel = fueLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", fueLevel=").append(fueLevel);
        sb.append(", costOfPurchase=").append(costOfPurchase);
        sb.append('}');
        return sb.toString();
    }
}
