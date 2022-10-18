package com.stackroute.oops;

/*
Class is having 3 fields name, modelName and type.
Type varies for different vehicles.
eg. Car is of type sedan, sports...
Bike is of type cruiser, sports...
 */
public abstract class AbstractManufacturer {
    private String name;
    private String modelName;
    private String type;

    public void setName(String name) {
        this.name = name;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModelName() {

        return modelName;
    }

    public String getType() {

        return type;
    }

    public String getName() {

        return name;
    }

    public abstract String getManufacturerInformation();
}