package com.stackroute.oops;

public class Address {
    String area;
    String city;

    public Address() {
    }

    public Address(String area, String city) {
        this.area = area;
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public boolean equals(Object address) {


        if(!(address instanceof Address))
            return false;

        Address c= (Address)address;

        if(this.getCity()== null && c.getCity()== null) {

            if (this.getArea()== null && c.getArea()== null)
                return true;

            if(this.getArea()==null || c.getArea()==null){
                return false;
            }
            if(this.getArea()==c.getArea()){
                return true;
            }
            if(this.getArea().equals(c.getArea())){
                return true;
            }
            return false;
        }

        if(this.getCity()== null || c.getCity()== null) {
            return false;
        }
        if(this.getArea()==null && c.getArea()==null){

            if(this.getCity()==null || c.getCity()==null){
                return false;
            }
            if(this.getCity()==c.getCity()){
                return true;
            }
            if(this.getCity().equals(c.getCity())){
                return true;
            }
            return false;
        }
        if(this.getArea()==null || c.getArea()==null){
            return false;
        }
        return this.getArea().equals(c.getArea()) && this.getCity().equals(c.getCity());
    }
}