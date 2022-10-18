package com.stackroute.oops;

public class Bike extends AbstractManufacturer implements Vehicle {
    public Bike(String name, String modelName, String bikeType) {
        setName(name);
        setModelName(modelName);
        setType(bikeType);
    }

    /*
   Method returns maximum speed depending upon their types
   For Sports-300kmh
   For cruiser-170kmh
    */
    @Override
    public int maxSpeed(String bikeType) {
        if(bikeType=="sports")
            return 300;
        if(bikeType=="cruiser")
            return 170;
        else
            return 0;
    }

    /*
    should return in d[the format : Bike{Manufacturer name:'name',Model Name:'modelName',Type:'type'}
     */
    @Override
    public String getManufacturerInformation() {

        return "Bike{Manufacturer name:"+getName()+","+"Model Name:"+getModelName()+",Type:"+getType()+"}";
    }
}