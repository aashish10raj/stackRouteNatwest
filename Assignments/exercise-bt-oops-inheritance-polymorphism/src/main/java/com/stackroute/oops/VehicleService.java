package com.stackroute.oops;

public class VehicleService {
    /*
    create a Car object and return it
     */
    public Car createCar(String name, String modelName, String type) {
        Car car=new Car(name,modelName,type);
        return car;
    }

    /*
    create a bike object and return it
     */
    public Bike createBike(String name, String modelName, String type) {
        Bike bike=new Bike(name,modelName,type);
        return bike;
    }

    /*
    Method should compare the speed only if the vehicle is of "SPORTS" type.
    Method should return 0 when speeds are equal otherwise should return maximum vehicle speed.
    Method returnscst -1 if the type is not "SPORTS"
    */
    public int compareMaxSpeed(Vehicle first, Vehicle second) {
        /*
        Vehicle objects should be downcasted to their respective concrete types
        */
        Car car=(Car)first;
        Bike bike=(Bike)second;
        if(car.getType()=="sports" && bike.getType()=="sports")
        {
            if(car.maxSpeed(car.getType())== bike.maxSpeed(bike.getType()))
                return 0;
            else if(car.maxSpeed(car.getType())>bike.maxSpeed(bike.getType()))
                return car.maxSpeed(car.getType());
            else
                return bike.maxSpeed(bike.getType());
        }
        else
            return -1;
    }
}