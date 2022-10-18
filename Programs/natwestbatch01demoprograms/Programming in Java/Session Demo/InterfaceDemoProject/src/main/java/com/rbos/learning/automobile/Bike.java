package com.rbos.learning.automobile;

public class Bike implements Vehicle,Insurance {
    int gear;
    int speed;

    public void vehicleInsurance() {
        System.out.println("Please do the renewal of Insurance before it expires");
    }

    public void changeGear(int newGear) {
        gear=newGear;
    }

    public void speedUp(int increment) {
        speed +=increment;
    }

    public void applyBrakes(int decrement) {
        speed -=decrement;
    }

    public void printState(){
        System.out.println("Speed = "+speed+" : "+"Gear = "+gear);
    }
}
