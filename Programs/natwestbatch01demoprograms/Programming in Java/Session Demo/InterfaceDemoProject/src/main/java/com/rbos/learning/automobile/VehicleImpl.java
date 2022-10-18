package com.rbos.learning.automobile;

public class VehicleImpl {
    public static void main(String[] args) {
        Bike bike=new Bike();
        bike.changeGear(2);
        bike.speedUp(80);
        bike.applyBrakes(40);
        bike.printState();
        bike.vehicleInsurance();
    }

}
